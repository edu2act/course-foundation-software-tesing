package lww.class25test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
	//属性
	private Connection conn;
	private String url;
	private String user;
	private String password;
	
	public DBUtil(String url, String user, String password) {
		this.url = url;
		this.user = user;
		this.password = password;
	}
	//方法
	// 获取数据库连接对象方法 Connection openConnection();
	public Connection openConnection() throws SQLException, ClassNotFoundException{
		if(isDatabaseAvalable()){
			return conn;
		} else {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
			return conn;
		}
	}
	// 查询方法 ResultSet query(sql)
	public ResultSet query(String sql) throws SQLException, ClassNotFoundException{
		if(!isDatabaseAvalable()){
			openConnection();
		} 
		Statement statement = conn.createStatement();
		ResultSet rs = statement.executeQuery(sql);
		return rs;
	}
	// 更新方法 int update(sql)
	
	// 关闭数据库连接方法  close()
	public void close() throws SQLException{
		if(isDatabaseAvalable()){
			conn.close();
		}
	}
	// 数据库连接对象是否可用   boolean isDatabaseAvalable()
	public boolean isDatabaseAvalable() throws SQLException{
		if(null != conn && !(conn.isClosed())){
			return true;
		} else {
			return false;
		}
	}
}
