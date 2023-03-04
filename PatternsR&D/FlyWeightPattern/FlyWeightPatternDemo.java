package FlyWeightPattern;
import java.util.HashMap;
/**
 * This is the FlyWeightPatternDemo class
 * This has the main class
 * This also has getRandomColour,getRandomX.getRandomY methods
 * @author sivasruthikoduru
 *
 */
public class FlyWeightPatternDemo {
	private static final String colours[]= {"red","green","blue","pink","purple"};
	/**
	 * This is the main method
	 * @param args
	 * @return nothing
	 */
	public static void main(String[] args)
	{
		for(int i=0;i<20;i++)
		{
			Circle circle=(Circle)ShapeFactory.getCircle(getRandomColour());
			circle.setXCoordinate(getRandomX());
			circle.setYCoordinate(getRandomY());
			circle.setRadius(100);
			circle.draw();
			
		}
	}
	/**
	 * This is getRandomColour method that generates random Colour.
	 * @param Nothing
	 * @return String
	 */
	private static String getRandomColour()
	{
		return colours[(int)(Math.random()*colours.length)];
	}
	/**
	 * This is getRandomX method that generates random x value.
	 * @param Nothing
	 * @return String
	 */
	private static int getRandomX()
	{
		return (int)(Math.random()*100);
	}
	/**
	 * This is getRandomY method that generates random y v alue.
	 * @param Nothing
	 * @return String
	 */
	private static int getRandomY()
	{
		return (int)(Math.random()*100);
	}

}



