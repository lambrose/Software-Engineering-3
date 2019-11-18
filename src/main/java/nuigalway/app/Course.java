package nuigalway.app;

import java.util.ArrayList;
import org.joda.time.DateTime;

public class Course {
	private String  name; 
	private Module[] modules;
	private Student[] students;
	private DateTime startDate = new DateTime();
	private DateTime endDate = new DateTime(); 
	
	public Course(String name, Module[] modules, Student[] students, DateTime startDate, DateTime endDate)
	{
		 this.name = name;
		 this.modules = modules;
		 this.students = students;
		 this.startDate = startDate;
		 this.endDate = endDate;
	}
	
	public String getName()
	{
		return name;
	}
	
	public Module[] getModule()
	{
		return modules;
	}
	
	public Student[] getStudents()
	{
		return students;
	}
	
	public DateTime getStartDate()
	{
		return startDate;
	}
	
	public DateTime getEndDate()
	{
		return endDate;
	}
	
	public String[] getStudentNames()
	{
		String[] registeredStudents = new String[2];
		for (int i = 0; i < students.length; i++) 
		{  
			registeredStudents[i] = students[i].getName();
		}
		return registeredStudents;
	}
	
	public String[] getModlueNames()
	{
		String[] registeredModules = new String[2];
		for (int i = 0; i < modules.length; i++) 
		{  
			registeredModules[i] = modules[i].getName();
		}
		
		return registeredModules;
	}
	
	public String toString()
	{
		String output = "Course: " + getName() + "\n";
		output += "Students in this course are:\n";
		for(int i = 0; i < getStudentNames().length; i++) 
		{
			output += getStudentNames()[i] + "\n";
	    }
		output += "Modules in this course are:\n";
		for(int i = 0; i < getModlueNames().length; i++) 
		{
			output += getModlueNames()[i] + "\n";
	    }
		output += "Start datae:" + getStartDate() + "\n";
		output += "End datae:" + getEndDate() + "\n";
		return output;
	}
}

