package jdbc;

import java.sql.*;

public class JDBCCreateTest {

	public static void main(String[] args)throws SQLException
	{
		Connection connection=MyConnection.getConnection();
		Statement statement=connection.createStatement();
		statement.execute("create table name_log(firstname varchar2(20),lastname varchar2(20))");
		connection.close();

	}

}
