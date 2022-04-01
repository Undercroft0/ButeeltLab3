package lights;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class MyHolidayLights implements HolidayLights  {

	
	ArrayList<Light> lightList = new ArrayList<Light>();

	private int length;
	private int count = 0;
	private int mode = 0;
	
	public MyHolidayLights(int length) {
		
		this.length = length;

		for(int i = 0; i < length; i++) {
			
			lightList.add(i, new ColoredLight(null));	
		} 
	}
	
	int i = 0;
	public List<Light> next() {
		
		
		switch (mode) {
		
		case 0:
		// Anivchih
		for(int i = 0; i < length; i++) {
			ColoredLight cl1 = (ColoredLight) lightList.get(i);
			cl1.randomChange();
			count++;
		}
		
		if(count > 300) {
			mode = 1;
		count = 0;
		for(int i = 0; i < length; i++) {
			
ColoredLight cl1 = (ColoredLight) lightList.get(i);
		
		cl1.setOn(false);
		}
		}
		break;
		
		case 1: 
		//2 talaasaa asah
		ColoredLight cl1 = (ColoredLight) lightList.get(i);
		
		cl1.setOn(true);
			
		ColoredLight cl2 = (ColoredLight) lightList.get(length-i-1);
		
		cl2.setOn(true);
		
		if(i < length/2) {
		i = i + 1;
		}
		
		if(count > length/2) {
			mode = 0;
			count = 0;
		}
		break;
		
		}
		
		return lightList;
	}

	public int getLength() {
		
		return length;
	}
}
