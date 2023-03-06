package VisitorPatternPackage;

class DogBarkException extends DogExceptions
{
	String msg;
	public DogBarkException(String msg)
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
