package com.controller.ornamentDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.controller.ornamentbe.OrnamentBean;

public class OrnamentDao {
	static String url ="jdbc:mysql://localhost:3306/java";
	static String user="root";
	static String pass ="admin";
	static Connection con =null;
	static PreparedStatement ps =null;	
	static int count = 0;
	
	static String insert ="insert into ornament values(?,?,?,?)";

	public static int insert(OrnamentBean o )
	
	{
	   try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection(url, user, pass);
		ps= con.prepareStatement(insert);
		ps.setString(1,o.getType());
		ps.setString(2,o.getBrand());
		ps.setInt(3,o.getCost());
		ps.setInt(4,o.getRatings() );
		int count = ps.executeUpdate();
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    finally {
    	try {
			ps.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
	return count;

	

	   
}
}