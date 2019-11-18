package nuigalway.app;


import static org.junit.Assert.*;
import java.util.ArrayList;
import org.joda.time.DateTime;
import org.junit.Test;

public class StudentTest {

	@Test
	public void test() 
	{
	
		Course[] louis_course = {new Course("CS and IT", null, null, new DateTime(2019, 9, 9, 10, 11, 12, 123), new DateTime(2020, 5, 16, 10, 11, 12, 123))};
		Module[] louis_module = {new Module("Software Engineering", "CT417", null, null), new Module("Systems Modelling and Simulation", "CT561", null, null)};
		Student louis = new Student("Louis", 21, "02/06/1998", 16350616, louis_module, louis_course);
		String expected_louis = "Louis, 21, 02/06/1998, 16350616, Louis21";
		assertEquals(expected_louis, louis.toString());
		
		
		Course[] louise_course = {new Course("CS and IT", null, null, new DateTime(2019, 9, 9, 10, 11, 12, 123), new DateTime(2020, 5, 16, 10, 11, 12, 123))};
		Module[] louise_module = {new Module("Software Engineering", "CT417", null, null), new Module("Machine Learning", "CT4101", null, null)};
		Student louise = new Student("Louise", 20, "12/06/1999", 16350625, louise_module, louise_course);
		String expected_louise = "Louise, 20, 12/06/1999, 16350625, Louise20";
		assertEquals(expected_louise, louise.toString());

	}

} 
