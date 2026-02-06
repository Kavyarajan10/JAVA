package com.Innovation.ConsoleProject;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentDAO st = new StudentDAO();
		
		while(true) {
			System.out.println("\n --- Student Management System ---");
			System.out.println("1. Add Student");
			System.out.println("2. View All Students");
			System.out.println("3. Update Student");
			System.out.println("4. Delete Student");
			System.out.println("5. Exit");
			System.out.println("Choose an option: ");
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch (choice) {
			case 1: 
				System.out.println("Enter the name: ");
				String name = sc.nextLine();
				
				System.out.println("Enter age: ");
				int age = sc.nextInt();
				sc.nextLine();
				
				System.out.println("Enter the course: ");
				String course = sc.nextLine();
				
				st.addStudent(name, age, course);
				System.out.println("Student added.");
				break;
				
			case 2:
				System.out.println("--- Students ---");
				for(Student s: st.getAllStudents()) {
					System.out.println(s);
				}
				break;
				
			case 3:
				System.out.println("Enter student ID to update: ");
				int updateId = sc.nextInt();
				sc.nextLine();
				
				System.out.println("Enter the name: ");
				String newName = sc.nextLine();
				
				System.out.println("Enter age: ");
				int newAge = sc.nextInt();
				sc.nextLine();
				
				System.out.println("Enter the course: ");
				String newCourse = sc.nextLine();
				
				if(st.updateStudent(updateId, newName, newAge, newCourse)) {
					System.out.println("Student updated.");
				}else {
					System.out.println("Student not found.");
				}
				break;
				
			case 4:
				System.out.println("Enter stduent ID to delete: ");
				int deleteId = sc.nextInt();
				sc.nextLine();
				
				if(st.deleteStudent(deleteId)) {
					System.out.println("Student deleted.");
				}else {
					System.out.println("Student not found.");
				}
				break;
				
			case 5:
				System.out.println("Goodbye...");
				return;
			
			default:
				System.out.println("Invalid option.");
			}
		
		}
		
	}
}
