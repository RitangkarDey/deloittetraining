package jdbc;

import java.sql.*;

public class CallableDemo {

	public static void main(String[] args) throws SQLException {
		Connection connection=MyConnection.getConnection();
		CallableStatement stmt=connection.prepareCall("{call firstp(?,?)}");
		stmt.setInt(1, 1011);
		stmt.setString(2, "Amit");
		stmt.execute();
		connection.close();
	}

}
