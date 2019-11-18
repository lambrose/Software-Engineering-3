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
		return students;
	}
	
	public Course[] getCourses()
	{
		return courses;
	}
	
	public Student[] getStudentsRelevant()
	{
		Student[] registeredStudents = new Student[2];
		for (int i = 0; i < students.length; i++) 
		{  
			for (int j = 0; j < students.length; j++) 
			{
				Module[] mod = students[i].getModules();
				
				if(this.name == mod[j].getName())
				{
					registeredStudents[i] = students[i];
				}
			}
		}
		
		return registeredStudents;
	}
	
	public String toString()
	{
		String output = getName() + ": \n";
		
		 for(int i = 0; i < getStudentsRelevant().length; i++) {
			 output += getStudentsRelevant()[i] + ", " + getCourses()[0].getName() + "\n";
	        }
		return output;
	}
	
}

