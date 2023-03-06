package VisitorPatternPackage;

class HandlerClass extends Handler
{
	public void handle(DogBarkException e)
	{
		System.out.println("Handled Dog bark exception...!!");
	}
	public void handle(DogBiteException e)
	{
		System.out.println("Handled Dog bite exception...!!");
	}
	public void handle(DogHappyException e)
	{
		System.out.println("Handled Dog happy exception...!!");
	}
}
