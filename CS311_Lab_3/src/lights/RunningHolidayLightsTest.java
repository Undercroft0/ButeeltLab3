package lights;

import static org.junit.Assert.*;

import java.awt.Color;
import java.util.ArrayList;

import org.junit.Test;

public class RunningHolidayLightsTest {

	@Test
	public void testRunningHolidayLights() {
		ArrayList<Light> lightList = new ArrayList<Light>();
		RunningHolidayLights t = new RunningHolidayLights(10);
		
		
		for(int i = 0; i < t.getLength(); i++) {
			lightList.add(i, new ColoredLight(Color.green));	
		}
		
		assertTrue(lightList.size() == t.getLength());
	}

	@Test
	public void testNext() {
		int count = 0;
		ArrayList<Light> lightList = new ArrayList<Light>();
		RunningHolidayLights t = new RunningHolidayLights(5);
		for(int i = 0; i < t.getLength(); i++) {
			ColoredLight cl1 = (ColoredLight) lightList.get(i);
			cl1.randomChange();
			count ++;
		}
		
		assertTrue(count == 4);
	}

	@Test
	public void testGetLength() {
		RunningHolidayLights t = new RunningHolidayLights(10);
		
		assertTrue(10 == t.getLength());
	}

}
