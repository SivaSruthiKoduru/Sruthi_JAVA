package FlyWeightPattern;

import java.util.HashMap;
/**
 * This is ShapeFactory class
 * This has getCircle method
 * @author sivasruthikoduru
 *
 */
class ShapeFactory
{
	private static final HashMap<String,Circle> circleMap=new HashMap<>();
	/**
	 * This is getCircle method that checks if the object exists
	 * If exists returns the existing objects .Else creates an object then returns it.
	 * @param colour
	 * @return Circle
	 */
	public static Circle getCircle(String colour)
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
