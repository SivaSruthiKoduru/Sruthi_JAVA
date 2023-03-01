package CommandPatternPackage;

class SerialChannelCommand extends Command
{
	public SerialChannelCommand(Tv tv,SetUpBox setupbox,SoundSystem soundsystem,VGame vgame)
	{
		super(tv,setupbox,soundsystem,vgame);
	}
	public void execute()
	{
		System.out.println("serial channel started processing...");
		tv.av2();
		setupbox.serialChannel();
		soundsystem.highSound();
	}
}
