package jdbc;

import java.sql.*;


public class MyConnection {

	public static Connection getConnection()
	{
		Connection connection=null;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		System.out.println("Driver loaded");
	
		try
		{
			connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott", "tiger");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return connection;
	}
}
