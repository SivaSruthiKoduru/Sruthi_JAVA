package CommandPatternPackage;

class UniversalRemote
{
	Command c[]= new Command[5];
	public UniversalRemote()
	{
		for(int i=0;i<5;i++)
		{
			c[i]=new DummyCommand();
		}
		
	}
	public void executeCommand(int slot)
	{
		c[slot].execute();
	}
	public void assignCommand(int slot,Command com)
	{
		c[slot]=com;
	}
}
