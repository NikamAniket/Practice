package com.jdbc.prepeadstatement;

import java.sql.*;
import java.util.Scanner;

public class UpdatePSEx {

	public static void main(String[] args) throws Exception {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the name and eid to update record");
		int eid=scanner.nextInt();
		String ename=scanner.next();
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/Batch155","root","root");
		PreparedStatement preparedStatement=connection.prepareStatement("update Employee set Ename=? where Eid=?");
		
		preparedStatement.setInt(2,eid);
		preparedStatement.setString(1,ename);
		preparedStatement.executeUpdate();
		System.out.println("Record updated");
	
	}

}
