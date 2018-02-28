package lww.class25test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://127.0.0.1:3306/test";
		DBUtil util = new DBUtil(url, "root", "");
		ResultSet rs = util.query("select * from user");
		while(rs.next()){ 
			System.out.println("id:" + rs.getInt("id") + "--name:" + rs.getString(2));
		}
		util.close();
	}
}
