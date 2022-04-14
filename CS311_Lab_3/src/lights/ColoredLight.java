package lights;

import java.awt.Color;
import java.util.Random;

public class ColoredLight extends Light{
	
	/**
	 * Creates a new colored light	.
	 * @param color - color of this light.
	 */
	private Color lightcolor;
	Random rnd = new Random();
	
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
		
		super.randomChange();
		
		int red = rnd.nextInt(256);
        int green = rnd.nextInt(256);
        int blue = rnd.nextInt(256);
        
        Color c = new Color(red, green, blue);
        setColor(c);
	}
	
}