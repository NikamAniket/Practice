package com.jdbc.prepeadstatement;

import java.sql.*;
import java.util.Scanner;

public class InsertPSEx {

	public static void main(String[] args) throws Exception {
		Scanner scanner=new Scanner(System.in);
		
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/Batch155","root","root");
		PreparedStatement preparedStatement=connection.prepareStatement("insert into Employee (eid,ename)values(?,?);");
		
		for(int i=1;i<=3;i++) {
			System.out.println("Enter the employee id and name");
			int eid=scanner.nextInt();
			String ename=scanner.next();
			
			preparedStatement.setInt(1,eid);
			preparedStatement.setString(2, ename);
			preparedStatement.executeUpdate();
			}
		System.out.println("Records inserted");
	}

}
