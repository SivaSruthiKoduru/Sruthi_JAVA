package VisitorPatternPackage;

class Dog
{
	public void play(String item) throws DogExceptions
	{
		if(item.equals("stick"))
		{
			throw new DogBarkException("Dog bark exception caught...!!");
		}
		else if(item.equals("stone"))
		{
			throw new DogBiteException("Dog bite exception caught....!!");
		}
		else if(item.equals("food"))
		{
			throw new DogHappyException("Dog happy exception caught...!!");
		}
		
	}
}

