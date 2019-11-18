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
	
	public String toString()
	{
		return getName() + "\t" + getModule() + "\t" + getStudents() + "\t" +  getStartDate() + "\t" +  getEndDate();
	}
}

