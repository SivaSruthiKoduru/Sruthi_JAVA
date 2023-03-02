package FlyWeightPattern;
import java.util.HashMap;
public class FlyWeightPatternDemo {
	private static final String colours[]= {"red","green","blue","pink","purple"};
	public static void main(String[] args)
	{
		for(int i=0;i<20;i++)
		{
			Circle circle=(Circle)ShapeFactory.getCircle(getRandomColour());
			circle.setX(getRandomX());
			circle.setY(getRandomY());
			circle.setRadius(100);
			circle.draw();
			
		}
	}
	private static String getRandomColour()
	{
		return colours[(int)(Math.random()*colours.length)];
	}
	private static int getRandomX()
	{
		return (int)(Math.random()*100);
	}
	private static int getRandomY()
	{
		return (int)(Math.random()*100);
	}

}



