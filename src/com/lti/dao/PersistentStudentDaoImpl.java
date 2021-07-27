/**
 * 
 */
package com.lti.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import com.lti.model.Course;
import com.lti.model.Student;

/**
 * @author dhruv
 *
 */

public class PersistentStudentDaoImpl implements StudentDao {

	Connection conn;
	String sql;
	PreparedStatement stmt;
	ResultSet rs;
	CallableStatement cstmt;
	

	public PersistentStudentDaoImpl() {

		conn = ConnectionFactory.getConnection();
	}

	@Override
	public boolean addAStudent(Student student) {
		// TODO Auto-generated method stub
//		sql = "insert into Stud values(seq_student.nextval,?,?)";
//		try {
//			stmt = conn.prepareStatement(sql);
//			stmt.setString(1, student.getName());
//			stmt.setDate(2, Date.valueOf(student.getDateOfBirth())); // converted java.time.LocalDate(java8) to
//																		// java.sql.Date(old)
//			int rec = stmt.executeUpdate();
//			if (rec > 0) {
//				return true;
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return false;
		
		sql="{call insertStudent(?,?)}";
		int res;
		try {
			cstmt = conn.prepareCall(sql);
			cstmt.setString(1, student.getName());
			cstmt.setDate(2, Date.valueOf(student.getDateOfBirth())); // converted java.time.LocalDate(java8) to
			res= cstmt.executeUpdate();
			if (res > 0) {
				return true;			}
			else {
				return false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public void updateAStudent(Student student,int id) {
		// TODO Auto-generated method stub
		sql = "update Stud set name=?, dob=? where id=?";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, student.getName());
            stmt.setDate(2, Date.valueOf(student.getDateOfBirth()));
            stmt.setInt(3, id);
            int rec = stmt.executeUpdate();
            if(rec>0)
                System.out.println("Record updated successfully");
            else
                System.out.println("Sorry no record found");
        } catch (SQLException e) {
            e.printStackTrace();
        }

	}

	@Override
	public void removeAStudent(int id) {
		// TODO Auto-generated method stub
		sql = "delete from Stud where id=? ";
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, id);
            int rec = stmt.executeUpdate();
            if(rec>0)
                System.out.println("Record Deleted successfully");
            else
                System.out.println("Sorry no record found");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

	@Override
	public Student findStudent(int id) {
		// TODO Auto-generated method stub
		sql = "select * from Stud where id=? ";
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, id);
			rs = stmt.executeQuery();
			if (rs.next())
			{
				int id1=rs.getInt(1);
				String name=rs.getString(2);
				Date dob=rs.getDate(3);
				Student st = new Student(id1,name,dob.toLocalDate());
				return st;
			}
			else {
				System.out.println("Record Not Found");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public List<Student> viewAllStudent() {
		// TODO Auto-generated method stub
		List<Student> students = new ArrayList<Student>();
		sql = "select * from Stud";
		try {
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			while(rs.next())
			{
				int id1=rs.getInt(1);
				String name=rs.getString(2);
				Date dob=rs.getDate(3);
				students.add(new Student(id1,name,dob.toLocalDate()));
			}
			return students;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public void enroll(int studentId, int courseId) {
		// TODO Auto-generated method stub

	}

	@Override
	public Course findCourse(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Entry<Student, Course>> viewEnrollments() {
		// TODO Auto-generated method stub
		return null;
	}

}
