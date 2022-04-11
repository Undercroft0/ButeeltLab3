package lights;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class MyHolidayLightsTest {

	@Test
	public void testMyHolidayLights() {
		ArrayList<Light> lightList = new ArrayList<Light>();
		MyHolidayLights t = new MyHolidayLights(10);
		
		int length = 10;
		for(int i = 0; i < length; i++) {
			lightList.add(i, new ColoredLight(null));	
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

}
