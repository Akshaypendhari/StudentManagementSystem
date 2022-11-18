package studentManagementSystem;
import java.io.*;

import java.util.*;

public class HomePage {
public static void main(String[] args) throws IOException {
	System.out.println("Welcome to student management system \n\n");
	
	BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
	
	 while (true)
	 {
		 System.out.println("PRESS 1 to ADD Student") ;
		 System.out.println("PRESS 2 to Delete Student") ;
		 System.out.println("PRESS 3 to Display Student") ;
		 System.out.println(" PRESS 4 to Exit  ");
		 
		 int c= Integer.parseInt(br.readLine());
		 
		 if (c==1) 
		 {
			 // add student
			 
			 System.out.println("Enter user name");
			 String name = br.readLine();
			 
			 
		
			 System.out.println("Enter phone");
			 String phone = br.readLine();
			 
			 System.out.println("Enter city");
			 String city = br.readLine();
			 
			// cretae student object 
			 
			 
			 Student st = new Student (name,phone,city);
			boolean answer = StudentDao.insertStudentToDB(st);
			if (answer) 
			{
				System.out.println("Student added succesfully ");
			}
			else 
			{
				System.out.println("something went wrong ");
			}
			 System.out.println(st);
			 
			 
			 
		 }
		 else if (c==2) 
		 {
			 // delete student 
			 
			 System.out.println("Enter id to delete student..");
			 int uid =Integer.parseInt(br.readLine());
			 boolean f = StudentDao.deleteStudent(uid);
			 
			 if (f) 
			 {
				 System.out.println("deleted");
			 }
			 else {System.out.println("something went wrong");}
			 }
			 
		 
		 else if (c==3) 
		 {
			 // display student 
			 StudentDao.showAllStudents();
			 
			 
		 }
		 
		 
		 else  if (c==4) 
		 {
			 // exit student 
			 break;
			 
		 }
		 		
	 }
	 System.out.println("Thank you for using this app...");
	
}
}
