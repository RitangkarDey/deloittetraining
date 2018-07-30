package jdbc;

import java.sql.*;

public class JdbcTest {

	public static void main(String[] args)throws ClassNotFoundException, SQLException 
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver Loaded");
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott", "tiger"); 
		System.out.println("Connected");
		Statement statement=connection.createStatement();
		ResultSet res=statement.executeQuery("select*from name_log");
		System.out.println("The result is");
		
		while(res.next())
		{
		System.out.println(res.getString(1)+" ");
		System.out.println(res.getString(2));
		}
		connection.close();
	}

}
