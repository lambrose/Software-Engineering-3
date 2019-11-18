package nuigalway.app;

public class Student {
	
	private String name;
	private int age;
	private String DOB;
	private int ID;
	private String username;
	private Course[] courses;
	private Module[] modules;
	
	public Student(String name, int age, String DOB, int ID, Module[] modules, Course[] courses)
	{
		this.name = name;
		this.age = age;
		this.DOB = DOB;
		this.ID = ID;
		this.username = name + age;
		this.courses = courses;
		this.modules = modules;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public String getDOB()
	{
		return DOB;
	}
	
	public int getID()
	{
		return ID;
	}
	
	public String getUsername()
	{
		return username;
	}
	
	
	public Module[] getModules()
	{
		return modules;
	}
	
	public Course[] getCourse()
	{
		return courses;
	}
	
	
	public String toString()
	{
		return getName() + ", " + getAge() + ", " + getDOB() + ", " +  getID() + ", " + getUsername();
	}

}
