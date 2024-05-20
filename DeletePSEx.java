package com.jdbc.prepeadstatement;

import java.sql.*;
import java.util.Scanner;

public class DeletePSEx {

	public static void main(String[] args) throws Exception {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the eid of record to delete ");
		int eid=scanner.nextInt();
		
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/Batch155","root","root");
		PreparedStatement preparedStatement=connection.prepareStatement("Delete from employee where eid=?");
		
		preparedStatement.setInt(1, eid);
		preparedStatement.executeUpdate();
		System.out.println("Record Delete");
	
	
	
	
	
	
	}

}
