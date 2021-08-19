package services;
import java.sql.*;

public class MysqlConnection {
	public static Connection getConnection() throws Exception {
		String Url="jdbc:mysql://localhost:3306/test";
		String Username="root";
		String Password="";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(Url,Username,Password);
		return con;
	}
}
