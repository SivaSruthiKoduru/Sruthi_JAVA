package VisitorPatternPackage;

abstract class Handler
{
	public abstract void handle(DogBarkException e);
	public abstract void handle(DogBiteException e);
	public abstract void handle(DogHappyException e);
	
}


