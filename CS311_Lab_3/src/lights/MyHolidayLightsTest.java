package lights;

import static org.junit.Assert.*;

import java.util.ArrayList;

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
		fail("Not yet implemented");
	}

	@Test
	public void testGetLength() {
		MyHolidayLights t = new MyHolidayLights(10);
		
		assertTrue(10 == t.getLength());
	}

}
