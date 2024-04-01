package com.esha;

import java.io.IOException;
import java.util.Scanner;

public class Start {

	public static void main(String[] args) throws IOException {
		System.out.println("Welcome");
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("Press 1 to add student");
			System.out.println("Press 2 to delete student");
			System.out.println("Press 3 to display student");
			System.out.println("Press 4 to update student");
			System.out.println("Press 5 to exit");
			int c=sc.nextInt();
			
			if(c==1) {
				System.out.println("Enter Name: ");
				String name=sc.next();
				System.out.println("Enter Phone: ");
				String phn=sc.next();
				System.out.println("Enter City: ");
				String city=sc.next();
				Student s=new Student(name, phn, city);
				boolean ans=StuDao.insertStu(s);
				if(ans) {
					System.out.println("Added successfully");
				}
				else {
					System.out.println("Error");
				}
				System.out.println(s);
			}
			else if(c==2){
				System.out.println("Enter student id: ");
				int sId=sc.nextInt();
				boolean a= StuDao.delStu(sId);
				if(a) {
					System.out.println("Deleted");
				}
				else {
					System.out.println("Error");
				}
			}
			else if(c==3) {
				StuDao.showStu();
			}
			else if(c==4) {
				System.out.println("Enter student id: ");
				int sId=sc.nextInt();
				System.out.println("Enter new city: ");
				String sCity=sc.next();
				boolean an=StuDao.upStu(sId,sCity);
				if(an) {
					System.out.println("Updated");
				}
				else {
					System.out.println("Error");
				}
			}
			else if(c==5) {
				//exit
				break;
			}
			else {
				
			}
		}
		System.out.println("Thank you");
		
	}

}
