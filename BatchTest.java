package jdbc;

import java.sql.*;

public class BatchTest {

	public static void main(String[] args) throws SQLException 
	{
		Connection connection=MyConnection.getConnection();
		connection.setAutoCommit(false);
		Statement stmt=connection.createStatement();
		stmt.addBatch("INSERT INTO name_log VALUES('Hoer','Simpson')");
		stmt.addBatch("INSERT INTO name_log VALUES('Bart','Simpson')");
		stmt.addBatch("INSERT INTO name_log VALUES('Marge','Simpson')");
		int[] updateCounts=stmt.executeBatch();
		connection.commit();
		System.out.println("entered");
		connection.close();
	}

}
