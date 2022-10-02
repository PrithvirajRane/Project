package com.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class MainTest {
	
	public static void main(String[] args) {
		Questions que = new Questions();
		Scanner scanner = new Scanner(System.in);
		JdbcConnection jdbc = new JdbcConnection();
		
//********************taking student name and ID for records *************************************************
		
		System.out.println("Student Name > ");
		String name = scanner.next();
		System.out.println("Student ID > ");
		int id = scanner.nextInt();
		
//*********************accessing the questions for test*******************************************************
		
		for(int i=1; i<=10; i++) {
		    System.out.println("Give question no. that you want to answer(Note: Do not repeat the question).");
			int qNum = scanner.nextInt();
			que.question(qNum);	
		}
		
//*************checking for marks and uploading marks, name, id of student in database  **********************		
		
		int scoreCount =que.count;
		
		System.out.println("Your Total Score out of 10 is >>> " + scoreCount);
		if(scoreCount<=10 && scoreCount>=8) {
			System.out.println("Your rank is >>> A");
		}else if(scoreCount<8 && scoreCount>=6) {
			System.out.println("Your rank is >>> B");
		}else if (scoreCount==5) {
			System.out.println("Your rank is >>> C");
		}else {
			System.out.println("Your rank is >>> D (fail)");
		}
		
		try {
			Connection con1 = jdbc.getConnection();
		    PreparedStatement state = con1.prepareStatement("insert into students (id, stdName, marks) values (?,?,?)");
		    state.setInt(1, id);
		    state.setString(2, name);
		    state.setInt(3, scoreCount);
		    int i =state.executeUpdate();
		    
		    }catch(Exception e) {
				e.printStackTrace();
			}
		

//*******printing list of students along with their marks and ID number <and> retrieving data based on student id*********
		
	 System.out.println("<<<<<<< THIS IS LIST OF STUDENTS WITH THEIR MARKS(from highest to lowest) >>>>>>>");	
	  try {
		  Connection con2 = jdbc.getConnection();
		  PreparedStatement state1 = con2.prepareStatement("select * from students order by marks DESC");
		  ResultSet marksList = state1.executeQuery();
		  while (marksList.next()) {
			  System.out.print("ID:- "+marksList.getString(1));
			  System.out.print("  Name:- "+marksList.getString(2));
			  System.out.println("  Marks:- "+marksList.getString(3));
		  }
			  
			  System.out.println(" If you want your pirticular record please type 'yes' or else 'no'. ");
			  String retrive = scanner.next();
			  String yes = "yes";
			  if(retrive.equals(yes)) {
				  System.out.println("Please provide your ID number : ");
				  int idNum = scanner.nextInt();
				  PreparedStatement state2 = con2.prepareStatement("select * from students where id=?");
				  state2.setInt(1, idNum);
				  
				  ResultSet data = state2.executeQuery();
				  while(data.next()) {
					  System.out.print("ID:- "+data.getString(1));
					  System.out.print("   Name:- "+data.getString(2));
					  System.out.println("   Marks:- "+data.getString(3));
				      }
			  }else {
				  System.out.println("Thank you for giving test. ");
			  }
		  
	  }catch(Exception e) {
		  e.printStackTrace();
	  }
				
		
	}
}
