package CommandPatternPackage;

abstract class Command
{
	Tv tv;
	SetUpBox setupbox;
	SoundSystem soundsystem;
	VGame vgame;
	public Command()
	{
		
	}
	public Command(Tv tv,SetUpBox setupbox,SoundSystem soundsystem,VGame vgame)
	{
		this.tv=tv;
		this.setupbox=setupbox;
		this.soundsystem=soundsystem;
		this.vgame=vgame;
	}
	public abstract void execute();
	
	
	
}