package nuigalway.app;

import java.util.ArrayList;

public class Module {
	private String name;
	private String ID;
	private Student[] students;
	private Course[] courses; 
	
	public Module(String name, String ID, Course[] courses, Student[] students)
	{
		this.name = name;
		this.ID = ID;
		this.students =students;
		this.courses = courses;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getID()
	{
		return ID;
	}
	
	public Student[] getStudents()
	{
		for (Student student: students) 
		{
			for (int i = 0; i < student.getModules().length; i++) 
			{      
				System.out.println(student.getModules().toString());
				
//				if(this.name == student.getModules()[i])
//				{
//					studentList.add(student);
//				}
				
			}
		}
		System.out.println(students[0].getModules());
		return students;
	}
	
	public Course[] getCourses()
	{
		return courses;
	}
	
	public String toString()
	{
		String output = getName() + ": \n";
		
		 for(Student stud:getStudents()) {
			 output += stud + "\n";
	        }
		return output;
	}
	
}

