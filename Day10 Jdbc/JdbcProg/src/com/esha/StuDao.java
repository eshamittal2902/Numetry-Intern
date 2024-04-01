package com.esha;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StuDao {

	public static boolean insertStu(Student s) {
		boolean f=false;
		//jdbc code
		try {
			Connection con=Connect.createCon();
			String q="insert into student(sname,sphn,scity) values(?,?,?)";
			
			//prepared statement
			PreparedStatement p=con.prepareStatement(q);
			
			//set the values
			p.setString(1,s.getStuName());
			p.setString(2,s.getStuPhn());
			p.setString(3,s.getStuCity());
			
			//execute
			p.executeUpdate();
			f=true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	public static boolean delStu(int sId) {
		boolean f=false;
		//jdbc code
		try {
			Connection con=Connect.createCon();
			String q="delete from student where sid=?";
			
			//prepared statement
			PreparedStatement p=con.prepareStatement(q);
			
			//set the values
			p.setInt(1,sId);
			
			//execute
			p.executeUpdate();
			f=true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
		
	}

	public static void showStu() {
		boolean f=false;
		//jdbc code
		try {
			Connection con=Connect.createCon();
			String q="select * from student";
		
			Statement st=con.createStatement();
			ResultSet res=st.executeQuery(q);
			while(res.next()) {
				int id=res.getInt(1);
				String name=res.getString(2);
				String phone=res.getString(3);
				String city=res.getString(4);
				System.out.println("ID: "+id);
				System.out.println("Name: "+name);
				System.out.println("Phone: "+phone);
				System.out.println("City: "+city);
				System.out.println("****************************");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
			
	}

	public static boolean upStu(int sId,String sCity) {
		boolean f=false;
		//jdbc code
		try {
			Connection con=Connect.createCon();
			String q="update student set scity=? where sid=?";
			
			//prepared statement
			PreparedStatement p=con.prepareStatement(q);
			
			//set the values
			p.setString(1,sCity);
			p.setInt(2, sId);
			
			//execute
			p.executeUpdate(); 
			f=true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}
}
