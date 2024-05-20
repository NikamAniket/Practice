package com.jdbc.prepeadstatement;

import java.sql.*;


public class FetchPSEx {

	public static void main(String[] args) throws Exception {
		
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/Batch155","root","root");
		PreparedStatement preparedStatement=connection.prepareStatement("Select * from Employee;");
		ResultSet resultSet=preparedStatement.executeQuery();
		System.out.println("Eid"+"\t"+"Ename");
		while(resultSet.next()){
			int eid=resultSet.getInt("eid");
			String ename=resultSet.getString("ename");
			System.out.println(eid+"\t"+ename);
			
		}
		
	}

}
