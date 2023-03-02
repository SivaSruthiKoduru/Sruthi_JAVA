package FlyWeightPattern;

class Circle implements Shape
{
private int x;
private int y;
private String colour;
private int radius;
public Circle(String colour)
{
	this.colour=colour;
	
}
public void setX(int x)
{
	this.x=x;
	
}
public void setY(int y)
{
	this.y=y;
}
public void setRadius(int radius)
{
	this.radius=radius;
}
public void draw()
{
	System.out.println("Drawing circle with\ncolour:"+colour+"\nx:"+x+"\ny:"+y+"\nRadius:"+radius+"\n\n\n");
}
	
}