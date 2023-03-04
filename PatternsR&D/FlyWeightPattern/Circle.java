package FlyWeightPattern;
/**
 * This is class Circle
 * It has methods setXCoordinate,setYCoordinate,setRadius,draw
 * It also has a constructor
 * @author sivasruthikoduru 
 * 
 *
 */
class Circle
{
private int xCoordinate;
private int yCoordinate;
private String colour;
private int radius;
/**
 * This is Circle constructor
 * @param colour
 * @return Nothing
 */
public Circle(String colour)
{
	this.colour=colour;
	
}
/**
 * This is setXCoordinate method that assigns x value.
 * @param xCoordinate
 * @return nothing
 */
public void setXCoordinate(int xCoordinate)
{
	this.xCoordinate=xCoordinate;
	
}
/**
 * This is setYCoordinate method that assigns y value.
 * @param yCoordinate
 * @return nothing
 */
public void setYCoordinate(int yCoordinate)
{
	this.yCoordinate=yCoordinate;
}
/**
 * This is setRadius method that assigns radius value.
 * @param radius
 * @return nothing
 */
public void setRadius(int radius)
{
	this.radius=radius;
}
/**
 * This is draw method
 * @param Nothing
 * @return Nothing
 */
public void draw()
{
	System.out.println("Drawing circle with\ncolour:"+colour+"\nx:"+xCoordinate+"\ny:"+yCoordinate+"\nRadius:"+radius+"\n\n\n");
}
	
}