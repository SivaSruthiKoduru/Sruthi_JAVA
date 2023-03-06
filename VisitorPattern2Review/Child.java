package VisitorPatternPackage;

class Child
{
	public void playWithDog(Dog dog,String item)throws DogExceptions
	{
		try 
		{
			dog.play(item);
		}
		catch(DogExceptions e)
		{
			e.printStackTrace();
			e.visit();
		}
		}
}

