package lights;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class MyHolidayLights implements HolidayLights  {

	
	ArrayList<Light> lightList = new ArrayList<Light>();

	private int length;
	
	
	public MyHolidayLights(int length) {
		
		this.length = length;

		for(int i = 0; i < length; i++) {
			
			lightList.add(i, new ColoredLight(Color.green));	
		} 
	}
	
	int i = 0;
	public List<Light> next() {
		// TODO Auto-generated method stub
		/*for(int i = 0; i < length; i++) {
			ColoredLight cl1 = (ColoredLight) lightList.get(i);
			cl1.randomChange();
		}*/
		
		
		ColoredLight cl1 = (ColoredLight) lightList.get(i);
		
		
		cl1.setOn(true);
			
		ColoredLight cl2 = (ColoredLight) lightList.get(length-i-1);
		
		cl2.setOn(true);
		if(i < length/2) {
		i = i + 1;
		}
		
		return lightList;
	}

	public int getLength() {
		// TODO Temu
		return length;
	}
}
