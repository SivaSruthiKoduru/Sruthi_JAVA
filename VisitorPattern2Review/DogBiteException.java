package VisitorPatternPackage;

class DogBiteException extends DogExceptions
{
	String msg;
	public DogBiteException(String msg)
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
