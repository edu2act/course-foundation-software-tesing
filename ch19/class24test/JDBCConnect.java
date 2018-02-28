package lww.class24test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBCConnect {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		//1、加载数据库的驱动程序（前提首先引入数据库驱动的jar包）
		Class.forName("com.mysql.jdbc.Driver");
		//2、建立数据库连接
		String url = "jdbc:mysql://localhost:3306/lazy_test" ;    
	     String username = "root" ;   
	     String password = "840701lww" ;     
	    Connection con =    
	             DriverManager.getConnection(url , username , password ) ;
		//3、执行数据库操作SQL
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from student");
		while(rs.next()){
			System.out.println(rs.getString("name"));
		}
		//或者stmt.execute(sql);
		//4、关闭数据库连接
		con.close();

	}
}
