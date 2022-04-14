package lights;

import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.Assert;
import org.junit.Test;

public class ColoredLightTest {


	@Test
	public void getColorTest() {
		ColoredLight cl = new ColoredLight(Color.green);
		Assert.assertEquals(Color.green, cl.getColor());
	}
	
	@Test
	public void NoGetColorTest() {
		ColoredLight cl = new ColoredLight(Color.green);
		Assert.assertNotEquals(Color.red, cl.getColor());
	}
	
	
	@Test
	public void setColorTest() {
		ColoredLight cl = new ColoredLight(null);
		cl.setColor(Color.red);
		Assert.assertTrue(cl.getColor() == Color.red);
	}
	
	@Test
	public void TurnOnOnlyOneLight()
	{
		ColoredLight firstLight = new ColoredLight(Color.red);
		ColoredLight secondLight = new ColoredLight(Color.blue);
		
		firstLight.setOn(true);
		
		Assert.assertTrue(firstLight.isOn());
		Assert.assertFalse(secondLight.isOn());
	}
	
	@Test public void TurnOffColoredLightTest()
	{
		ColoredLight Light = new ColoredLight(Color.red);
		Light.setOn(false);
		
		Assert.assertFalse(Light.isOn());
	}
	
	@Test
	public void randomChangeTest() {
		
		boolean colorChanged = false;
		ColoredLight cl = new ColoredLight(Color.red);
		ColoredLight cl2 = new ColoredLight(Color.red);
		for (int i = 0; i < 10; i++) {
			cl.randomChange();
			if(cl != cl2) {
				colorChanged = true;
				break;
			}
		}	
		Assert.assertTrue(colorChanged);	
	}
}
