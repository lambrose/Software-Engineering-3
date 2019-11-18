package nuigalway.app;

import static org.junit.Assert.*;

import org.joda.time.DateTime;
import org.junit.Test;

public class ModuleTest {

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
		
		String expected_software = "Software Engineering: \n" + 
				"Louis, 21, 02/06/1998, 16350616, Louis21, CS and IT\n" + 
				"Ambrose, 20, 12/06/1999, 16350625, Ambrose20, CS and IT\n";
		assertEquals(expected_software, software.toString());

		
		Module modelling = new Module("Systems Modelling and Simulation", "CT561", course, students);
		String expected_modelling = "Systems Modelling and Simulation: \n" +
				"Louis, 21, 02/06/1998, 16350616, Louis21, CS and IT\n" +
				null + ", CS and IT\n";
		assertEquals(expected_modelling, modelling.toString());
	}

}
