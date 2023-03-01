package SingleTonPatternPackage;

class Transaction implements Cloneable
{
	int amount;
	String crid,deid;
	public void credit(String crid,int amount)
	{
		this.crid=crid;
		this.amount=amount;
	}
	public void debit(String deid,int amount)
	{
		this.deid=deid;
		this.amount=amount;
	}
	public void updateAmount()
	{
		System.out.println("Before..."+crid+  ":" + deid+"updated...."+amount);
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			
		}
		System.out.println("After...."+crid+  ":"+ deid+"updated....."+amount);
	}
	private Transaction()
	{
		System.out.println("Object created...");
	}
	private static Transaction t;
	synchronized private Transaction createClone()
	{
		try {
			return (Transaction)super.clone();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		
	}
	synchronized public static Transaction createCloneInstance()
	{
		if(t!=null)
		{
			return t.createClone();
		}
		else
		{
			return t.createSingleTon();
		}
	}
	synchronized public static Transaction createSingleTon()
	{
		if(t==null)
		{
			t=new Transaction();
			return t;
		}
		else
		{
			return t;
		}
	}
}
