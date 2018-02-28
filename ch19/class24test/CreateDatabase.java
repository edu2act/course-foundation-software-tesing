package lww.class24test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;


public class CreateDatabase {
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/test" ;    
	     String username = "root" ;   
	     String password = "" ;
		Connection conn = null;
		Statement statement = null;
		try {
			conn = DriverManager.getConnection(url, username, password);
			statement = conn.createStatement();
			statement.execute("create database test");
			System.out.println("数据库创建成功");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("test数据库已经存在");
		}
		statement.execute("create table if not exists user (id int primary key, name varchar(12))");
		statement.execute("insert into user(id, name) values (2, \"Lily\")");
		PreparedStatement preparedStatement = conn.prepareStatement("update user set name = ? where id = ?");
		preparedStatement.setString(1, "Tom");
		preparedStatement.setInt(2, 2);
		preparedStatement.execute();
		conn.close();
		
	}
}
