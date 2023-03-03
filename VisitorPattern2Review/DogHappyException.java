package VisitorPatternPackage;

class DogHappyException extends DogExceptions
{
	String msg;
	public DogHappyException(String msg)
	{
		this.msg=msg;
	}
	
	public String toString() {
		return msg;
	}
	public void visit()
	{
		HandlerClass h = new HandlerClass();
		h.handle(this);
	}
}
