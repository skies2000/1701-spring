package db;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;



public class DBConnect {
    Connection conn;
    String driver;
    String url;
    String user;
    String pwd;
    
	public DBConnect() {
	
	}
	public Connection getConn() {
		  try{
			  Class.forName(driver).newInstance();
			  conn = DriverManager.getConnection(url, user, pwd);
		  }catch(Exception e){
			  e.printStackTrace();
		  }
		return conn;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
}
