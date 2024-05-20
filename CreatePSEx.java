package com.jdbc.prepeadstatement;

import java.sql.*;

public class CreatePSEx {

	public static void main(String[] args) throws Exception {
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/Batch155", "root","root");
		PreparedStatement preparedStatement=connection.prepareStatement("Create table Employee (eid int(3),eName varchar(30));");
		preparedStatement.executeUpdate();
		System.out.println("Table created ");
	
	}

}
