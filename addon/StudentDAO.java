package com.Innovation.ConsoleProject;

import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

	private List<Student> students = new ArrayList<>();
	private int nextId = 1;
	
	public void addStudent(String name, int age, String course) {
		students.add(new Student(nextId++, name, age, course));
	}
	
	public List<Student> getAllStudents(){
		return students;
	}
	
	public boolean updateStudent(int id, String name, int age, String course) {
		for(Student s: students) {
			if(s.getId() == id) {
				s.setName(name);
				s.setAge(age);
				s.setCourse(course);
				return true;
			}
		}
		return false;
	}
	
	public boolean deleteStudent(int id) {
		return students.removeIf(s->s.getId() == id); //Lambda expression
	}
	
	/**
	 * non-lambda expression:
	 * Iterator<Student> itr = students.iterator();
	 * while(itr.hasNext()){
	 *      Student s = itr.next();
	 *      if(s.getId() == id){
	 *         itr.remove();
	 *         return true;
	 *      }
	 * }
	 * return false;
	 * 
	 */
}




