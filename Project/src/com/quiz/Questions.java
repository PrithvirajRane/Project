package com.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Questions {
	
      int count;
	public void question(int num){
		Connection con = null;
		PreparedStatement ps = null;
		String check ="";
		
	Scanner scanner =new Scanner(System.in);
	try {
		JdbcConnection jdbcConnection = new JdbcConnection();
		con = jdbcConnection.getConnection();
		ps = con.prepareStatement("Select answer from questions where queNo=?");
		
//*****************************************************************************************
		
		if(num==1) {
		ps.setString(1, "1");
		ResultSet ans1 = ps.executeQuery();
		while(ans1.next()) {
		 check = ans1.getString(1);
		}
				
		System.out.println("Q1) What is default size of ArrayList ?");
		System.out.println("a) 10");
    	System.out.println("b) 16");
		System.out.println("c) 8");
		System.out.println("d) 12");
		System.out.println("Give answer");
		String answer1 = scanner.next();
		
		   if(answer1.equals(check)) {
			System.out.println("Correct Answer");
			count++;
		   }else {
			System.out.println("Wrong Answer");
		   }
		}
		
//****************************************************************************************
		
		if(num==2) {
		ps.setString(1, "2");
		ResultSet ans2 = ps.executeQuery();
		while(ans2.next()) {
		 check = ans2.getString(1);
		}
				
		System.out.println("Q2) Which of the following is non-primitive data type ?");
		System.out.println("a) int");
    	System.out.println("b) String");
		System.out.println("c) float");
		System.out.println("d) long");
		System.out.println("Give answer");
		String answer2 = scanner.next();
		
		  if(answer2.equals(check)) {
			System.out.println("Correct Answer");
			count++;
		  }else {
			System.out.println("Wrong Answer");
		  }
		}
		
//****************************************************************************************
		
		if(num==3) {
		ps.setString(1, "3");
		ResultSet ans3 = ps.executeQuery();
		while(ans3.next()) {
		 check = ans3.getString(1);
		}
				
		System.out.println("Q3) How many reserved keywords are present in java ?");
		System.out.println("a) 48");
    	System.out.println("b) 53");
		System.out.println("c) 50");
		System.out.println("d) 47");
		System.out.println("Give answer");
		String answer3 = scanner.next();
		
		if(answer3.equals(check)) {
			System.out.println("Correct Answer");
			count++;
		}else {
			System.out.println("Wrong Answer");
		}
	    }
		
//*****************************************************************************************
		
		if(num==4) {
		ps.setString(1, "4");
		ResultSet ans4 = ps.executeQuery();
		while(ans4.next()) {
		 check = ans4.getString(1);
		}
				
		System.out.println("Q4) Which of the following interfaces does not implements collection interface ?");
		System.out.println("a) List");
    	System.out.println("b) Queue");
		System.out.println("c) Set");
		System.out.println("d) Map");
		System.out.println("Give answer");
		String answer4 = scanner.next();
		
		if(answer4.equals(check)) {
			System.out.println("Correct Answer");
			count++;
		}else {
			System.out.println("Wrong Answer");
		}
		}
		
//*******************************************************************************************
		
		if(num==5) {
		ps.setString(1, "5");
		ResultSet ans5 = ps.executeQuery();
		while(ans5.next()) {
		 check = ans5.getString(1);
		}
				
		System.out.println("Q5) Select valid statemnt to declare and initialize an Array.");
		System.out.println("a) int[] A={}");
    	System.out.println("b) int[] A={1,2,3}");
		System.out.println("c) int[] A=(1,2,3)");
		System.out.println("d) int[][] A={1,2,3}");
		System.out.println("Give answer");
		String answer5 = scanner.next();
		
		if(answer5.equals(check)) {
			System.out.println("Correct Answer");
			count++;
		}else {
			System.out.println("Wrong Answer");
		}
		}
		
//********************************************************************************************
		
		if(num==6) {
		ps.setString(1, "6");
		ResultSet ans6 = ps.executeQuery();
		while(ans6.next()) {
		 check = ans6.getString(1);
		}
				
		System.out.println("Q6) Which of the following is not a java feature ?");
		System.out.println("a) Dynamic");
    	System.out.println("b) Architecture Neutral");
		System.out.println("c) Use of pointers ");
		System.out.println("d) Object oriented ");
		System.out.println("Give answer");
		String answer6 = scanner.next();
		
		if(answer6.equals(check)) {
			System.out.println("Correct Answer");
			count++;
		}else {
			System.out.println("Wrong Answer");
		}
		}
		
//*******************************************************************************************
		
		if(num==7) {
		ps.setString(1, "7");
		ResultSet ans7 = ps.executeQuery();
		while(ans7.next()) {
		 check = ans7.getString(1);
		}
				
		System.out.println("Q7) What is the return type of the hashCode() method in Object class ?");
		System.out.println("a) object");
    	System.out.println("b) void");
		System.out.println("c) int");
		System.out.println("d) long");
		System.out.println("Give answer");
		String answer7 = scanner.next();
		
		if(answer7.equals(check)) {
			System.out.println("Correct Answer");
			count++;
		}else {
			System.out.println("Wrong Answer");
		}
		}
		
//*******************************************************************************************
		
		if(num==8) {
		ps.setString(1, "8");
		ResultSet ans8 = ps.executeQuery();
		while(ans8.next()) {
		 check = ans8.getString(1);
		}
				
		System.out.println("Q8) Which package contains the Random class ?");
		System.out.println("a) java.awt");
    	System.out.println("b) java.lang");
		System.out.println("c) java.io");
		System.out.println("d) java.util");
		System.out.println("Give answer");
		String answer8 = scanner.next();
		
		if(answer8.equals(check)) {
			System.out.println("Correct Answer");
			count++;
		}else {
			System.out.println("Wrong Answer");
		}
		}
		
//*******************************************************************************************
		
		if(num==9) {
		ps.setString(1, "9");
		ResultSet ans9 = ps.executeQuery();
		while(ans9.next()) {
		 check = ans9.getString(1);
		}
				
		System.out.println("Q9) In which memory a String is stored, when we create a string using 'new' operator ?");
		System.out.println("a) Heap memory");
    	System.out.println("b) Stack");
		System.out.println("c) String memory");
		System.out.println("d) Random storage space");
		System.out.println("Give answer");
		String answer9 = scanner.next();
		
		if(answer9.equals(check)) {
			System.out.println("Correct Answer");
			count++;
		}else {
			System.out.println("Wrong Answer");
		}
		}
		
//********************************************************************************************
		
		if(num==10) {
		ps.setString(1, "10");
		ResultSet ans10 = ps.executeQuery();
		while(ans10.next()) {
		 check = ans10.getString(1);
		}
				
		System.out.println("Q10) Which keyword is used for accessing the features of package ?");
		System.out.println("a) export");
    	System.out.println("b) extends");
		System.out.println("c) package");
		System.out.println("d) import");
		System.out.println("Give answer");
		String answer10 = scanner.next();
		
		if(answer10.equals(check)) {
			System.out.println("Correct Answer");
			count++;
		}else {
			System.out.println("Wrong Answer");
		}
		}
		
//********************************************************************************************
	 // scanner.close();
	  //ps.close();
	  //con.close();
	}catch(Exception e) {
		e.printStackTrace();
	}
	
  }

}
