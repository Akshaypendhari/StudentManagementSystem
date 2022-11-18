package studentManagementSystem;
import java.sql.*;
import java.sql.PreparedStatement;

public class StudentDao {

	public static boolean insertStudentToDB(Student st) 
	{
		boolean f = false;
		
		try {
			
			Connection con = CP.createC();
		  String q= "insert into student(sname , sphone,city) values(?,?,?)";
			
		  PreparedStatement pstmt = con.prepareStatement(q);
		  
		  pstmt.setString(1, st.getSname());
		  pstmt.setString(2, st.getSphone());
		  pstmt.setString(3, st.getCity());
		  
		  pstmt.executeUpdate();
		  f= true;
		  
		  
		  		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return f;
		
	}
	
	
	

	public static boolean deleteStudent(int uid) {
		// TODO Auto-generated method stub
		
     boolean f = false;
		
		try {
			
			Connection con = CP.createC();
		  String q= "delete from student where sid=?";
			
		  PreparedStatement pstmt = con.prepareStatement(q);
		  
		  pstmt.setInt(1, uid);
		 
		  
		  pstmt.executeUpdate();
		  f= true;
		  
		  
		  		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return f;
		
		
	}




	public static void showAllStudents() {
		// TODO Auto-generated method stub
		

			
			try {
				
				Connection con = CP.createC();
			  String q= "select * from student ";
				
			  Statement stmt = con.createStatement();
			  
			ResultSet set = stmt.executeQuery(q);
			
			while (set.next()) 
			{
				int id = set.getInt(1);
				String name = set.getString(2);
				String phone = set.getString(3);
				String city = set.getString("city");
				
				

				System.out.println("ID : "+ id );
				System.out.println("Name : "+ name );
				System.out.println("Phone : "+ phone);
				System.out.println("city : "+ city);
				System.out.println("================================");
				
			}
			 
			  
			  
			  		} catch (Exception e) {
				e.printStackTrace();
				// TODO: handle exception
			}
		
			
			
		}




	
	}
	
