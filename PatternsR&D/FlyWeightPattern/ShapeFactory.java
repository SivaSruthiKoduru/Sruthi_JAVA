package FlyWeightPattern;

import java.util.HashMap;

class ShapeFactory
{
	private static final HashMap<String,Shape> circleMap=new HashMap<>();
	public static Shape getCircle(String colour)
	{
		Circle circle=(Circle)circleMap.get(colour);
		if(circle==null)
		{
			circle = new Circle(colour);
			circleMap.put(colour, circle);
			System.out.println("Creating circle of colour:"+colour);
		}
		return circle;
	}
}
