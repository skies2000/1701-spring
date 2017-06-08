package di_constructor;

import java.sql.Connection;
import java.sql.DriverManager;

public class SpringDBConnect {
	private String driver;
	private String url;
	private String username;
	private String password;
	
	private Connection conn;

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Connection getConn() {
		try{
			  Class.forName(driver).newInstance();
			  
			  
			  System.out.println("Driver loadiong ok...");
			  /*Context init = new InitialContext();
			  DataSource ds =(DataSource)init.lookup("java:comp/env/jdbc/OracleDB");
			  conn = ds.getConnection();*/
			  conn = DriverManager.getConnection(url, username, password);
			  
		  }catch(Exception e){
			  System.out.println("Connection fail....");
			  e.printStackTrace();
		  }
		return conn;
	}
	
	
	
}
