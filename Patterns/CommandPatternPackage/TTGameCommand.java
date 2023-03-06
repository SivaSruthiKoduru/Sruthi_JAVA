package CommandPatternPackage;

class TTGameCommand extends Command
{
	public TTGameCommand(Tv tv,SetUpBox setupbox,SoundSystem soundsystem,VGame vgame)
	{
		super(tv,setupbox,soundsystem,vgame);
	}
	public void execute()
	{
		System.out.println("TT game started processing...");
		tv.av2();
		soundsystem.highSound();
		vgame.ttGame();
	}
}
