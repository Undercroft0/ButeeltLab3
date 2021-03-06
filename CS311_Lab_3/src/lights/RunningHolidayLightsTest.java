package lights;

import static org.junit.Assert.*;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

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
		int len = 12;
			RunningHolidayLights list = new RunningHolidayLights(len);
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
		int len = 10;
		
		RunningHolidayLights t = new RunningHolidayLights(len);
		
		assertTrue(len == t.getLength());
	}
	
	@Test 
	public void testRunningHolidaysLightsOff()
	{
		RunningHolidayLights rLight = new RunningHolidayLights(5);
		for(Light llight : rLight.next())
		{
			assertFalse(llight.isOn());			
		}
	}
	
	@Test
	public void testNotLength () {
		
		RunningHolidayLights t = new RunningHolidayLights(11);
		
		assertNotEquals(12, t.getLength());
	}

}

