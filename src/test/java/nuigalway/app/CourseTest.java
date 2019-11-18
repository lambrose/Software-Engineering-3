package nuigalway.app;

import static org.junit.Assert.*;

import org.joda.time.DateTime;
import org.junit.Test;

public class CourseTest {

	@Test
	public void test() {

		Course[] louis_course = {new Course("CS and IT", null, null, new DateTime(2019, 9, 9, 10, 11, 12, 123), new DateTime(2020, 5, 16, 10, 11, 12, 123))};
		Module[] louis_module = {new Module("Software Engineering", "CT417", null, null), new Module("Systems Modelling and Simulation", "CT561", null, null)};
		Student louis = new Student("Louis", 21, "02/06/1998", 16350616, louis_module, louis_course);
		
		
		Course[] Ambrose_course = {new Course("CS and IT", null, null, new DateTime(2019, 9, 9, 10, 11, 12, 123), new DateTime(2020, 5, 16, 10, 11, 12, 123))};
		Module[] Ambrose_module = {new Module("Software Engineering", "CT417", null, null), new Module("Machine Learning", "CT4101", null, null)};
		Student Ambrose = new Student("Ambrose", 20, "12/06/1999", 16350625, Ambrose_module, Ambrose_course);
	

		Student[] students = {louis, Ambrose};
		Course[] course = {new Course("CS and IT", null, null, new DateTime(2019, 9, 9, 10, 11, 12, 123), new DateTime(2020, 5, 16, 10, 11, 12, 123))};
		
		Module software = new Module("Software Engineering", "CT417", course, students);
	
		Module modelling = new Module("Systems Modelling and Simulation", "CT561", course, students);
		Module[] modules = {software, modelling};
		
		Course csIT = new Course("CS and IT", modules, students, new DateTime(2019, 9, 9, 10, 11, 12, 123), new DateTime(2020, 5, 16, 10, 11, 12, 123));
		String expected_csIT = "Course: CS and IT\n" + 
				"Students in this course are:\n" + 
				"Louis\n" + 
				"Ambrose\n" + 
				"Modules in this course are:\n" + 
				"Software Engineering\n" + 
				"Systems Modelling and Simulation\n" + 
				"Start datae:2019-09-09T10:11:12.123+01:00\n" + 
				"End datae:2020-05-16T10:11:12.123+01:00\n";
		assertEquals(expected_csIT, csIT.toString());
		
	}

}
