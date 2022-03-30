package lights;

import java.awt.Color;
import java.util.List;

/**
 * Represents a sequence of lights that periodically changes
 * appearence.
 */

public interface HolidayLights {

	/**
	 * Appearence of lights at next time slice.
	 * @return appearence of lights at next time slice.
	 */
	public int getLength();
	
	public List<Light> next();
	
}