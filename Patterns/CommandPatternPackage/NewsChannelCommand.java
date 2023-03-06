package CommandPatternPackage;

class NewsChannelCommand extends Command
{
	public NewsChannelCommand(Tv tv,SetUpBox setupbox,SoundSystem soundsystem,VGame vgame)
	{
		super(tv,setupbox,soundsystem,vgame);
	}
	
	public void execute()
	{
		System.out.println("News channel started processing...");
		tv.av1();
		setupbox.newsChannel();
		soundsystem.highSound();
		
	}
}