package studentManagementSystem;
import java.sql.*;

import java.sql.DriverManager;

public class CP {
	static Connection con ;
	
public  static Connection  createC() {
	
	try {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/studentmanage";
		String uname= "root";
		String pass ="Swaksh@141895";
		
				
		 con = DriverManager.getConnection(url,uname,pass);
		
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	return con;
	
	
}

}
