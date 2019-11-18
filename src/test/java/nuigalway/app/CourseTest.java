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
		
		
		Course[] louise_course = {new Course("CS and IT", null, null, new DateTime(2019, 9, 9, 10, 11, 12, 123), new DateTime(2020, 5, 16, 10, 11, 12, 123))};
		Module[] louise_module = {new Module("Software Engineering", "CT417", null, null), new Module("Machine Learning", "CT4101", null, null)};
		Student louise = new Student("Louise", 20, "12/06/1999", 16350625, louise_module, louise_course);
	

		Student[] students = {louis, louise};
		Course[] course = {new Course("CS and IT", null, null, new DateTime(2019, 9, 9, 10, 11, 12, 123), new DateTime(2020, 5, 16, 10, 11, 12, 123))};
		
		Module software = new Module("Software Engineering", "CT417", course, students);
		System.out.println(software);
		
//		String expected_software = "Software Engineering: \n" + 
//				"Louis, 21, 02/06/1998, 16350616, Louis21, CS and IT\n\n" + 
//				"Louise, 20, 12/06/1999, 16350625, Louise20, CS and IT\n\n";
//		assertEquals(expected_software, software.toString());

		
//		Module modeling = new Module("Systems Modelling and Simulation", "CT561", course, students);
////		String expected_modeling = "Systems Modelling and Simulation: \nLouis, 21, 02/06/1998, 16350616, Louis21, CS and IT\n\n";
//		System.out.println(modeling);
////		assertEquals(expected_modeling, modeling.toString());
	}

}
