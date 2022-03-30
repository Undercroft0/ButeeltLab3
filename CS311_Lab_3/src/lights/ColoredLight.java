package lights;

import java.awt.Color;

public class ColoredLight extends Light{
	
	/**
	 * Creates a new colored light.
	 * @param color - color of this light.
	 */
	private Color lightcolor;
	
	public ColoredLight(Color color) {
		
		super();
		this.lightcolor = color;
		
	}
	
	/**
	 * Returns the color of this light.
	 * @return color of this light.
	 */
	public Color getColor() {
		return lightcolor;
	}
	
	/**
	 * Changes the color of this light to be c.
	 */
	public void setColor(Color c) {
		lightcolor = c;
	}
	
	/**
	 * Randomly changes this light to be on or off and its color.
	 */
	@Override
	public void randomChange() {
		// TODO. 
		super.randomChange();
	}
	
}