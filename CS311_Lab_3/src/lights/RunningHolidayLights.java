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
	public RunningHolidayLights(int length) {
		
		// TODO ArrayList<Light> lightList = new ArrayList<Light>();
		this.length = length;
		
	}
	
	public List<Light> next() {
			new ColoredLight(Color.green);
			new ColoredLight(Color.red);
			new ColoredLight(Color.BLUE);
			ArrayList<Light> lightList = new ArrayList<Light>();
		// TODO
		return lightList;
		
	}
	
	/**
	 * Returns the length of this
	 * @return length of this
	 */
	public int getLength() {
		// TODO
		return length;
	}
						
}