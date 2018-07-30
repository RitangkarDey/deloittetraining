package jdbc;

import java.sql.*;
import java.util.*;

public class JDBCInserTest 
{
	public static void main(String[] args) throws SQLException 
	{
		Connection connection=MyConnection.getConnection();
		//Statement statement=connection.createStatement();
		//int rowsAffected=statement.executeUpdate("insert into stu_d values(100,'Kapoor')");
		//System.out.println(rowsAffected+"row(s) inserted successfully");
		Scanner scanner;
		try {
			scanner = new Scanner(System.in);
			System.out.println("Enter roll :");
			int roll = scanner.nextInt();
			System.out.println("Enter Name :");
			String name = scanner.next();
			PreparedStatement statement = connection.prepareStatement("insert into stu_d values(?,?)");
			statement.setInt(1, roll);
			statement.setString(2, name);
			statement.executeUpdate();
			System.out.println("Enter roll :");
			int roll2 = scanner.nextInt();
			System.out.println("Enter Name :");
			String name2 = scanner.next();
			PreparedStatement statement2 = connection.prepareStatement("insert into stu_d values(?,?)");
			statement2.setInt(1, roll2);
			statement2.setString(2, name2);
			statement2.executeUpdate();
			connection.commit();
			scanner.close();
		} catch (Exception e) {
			connection.rollback();
			e.printStackTrace();
		}
		connection.close();
		
	}
}
