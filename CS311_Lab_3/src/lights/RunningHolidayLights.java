package lights;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class RunningHolidayLights implements HolidayLights {
	
	private int length;

	/**
	 * Creates new running holiday lights.
	 * @param length - length of this set of lights.
	 */
	ArrayList<Light> lightList = new ArrayList<Light>();
	
	public RunningHolidayLights(int length) {
	
		this.length = length;
		for(int i = 0; i < length; i++) {
			lightList.add(i, new ColoredLight(Color.green));	
		}
	}
	
	public List<Light> next() {
		
		return lightList;
		
	}
	
	/**
	 * Returns the length of this
	 * @return length of this
	 */
	public int getLength() {
		
		return length;
	}
						
}