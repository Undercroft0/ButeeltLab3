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
	public void setColorTest() {
		ColoredLight cl = new ColoredLight(null);
		cl.setColor(Color.red);
		Assert.assertTrue(cl.getColor() == Color.red);
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
