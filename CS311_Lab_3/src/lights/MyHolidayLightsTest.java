package lights;

import static org.junit.Assert.*;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class MyHolidayLightsTest {

	@Test 
	public void testMakeLights() {
		MyHolidayLights lig = new MyHolidayLights(8);
		assertTrue(8 == lig.getLength());
	}
	
	@Test
	public void testMyHolidayLights() {
		ArrayList<Light> lightList = new ArrayList<Light>();
		MyHolidayLights t = new MyHolidayLights(10);
		
		int length = 10;
		for(int i = 0; i < length; i++) {
			lightList.add(i, new ColoredLight(Color.green));	
		}
		
		assertTrue(lightList.size() == length);
	}

	@Test
	public void testNext() {
		int len = 12;
		MyHolidayLights list = new MyHolidayLights(len);
		List<Light> li;
		li = list.next();
		
		for (int i = 0; i < len; i++) {
			li.get(i).setOn(true);
			assertTrue(li.get(i).isOn());
		}
		for (int i = 0; i < len; i++) {
			li.get(i).setOn(false);
			assertFalse(li.get(i).isOn());
		}
}
	
	@Test
	public void testGetLength() {
		MyHolidayLights t = new MyHolidayLights(10);
		
		assertTrue(10 == t.getLength());
	}

	@Test
	public void testNotLength () {
		
		MyHolidayLights t = new MyHolidayLights(11);
		
		assertNotEquals(12, t.getLength());
	  }

}
