package CommandPatternPackage;

public class CommandPattern {
	public static void main(String[] args) {
		Tv tv= new Tv();
		SetUpBox setupbox = new SetUpBox();
		SoundSystem soundsystem = new SoundSystem();
		VGame vgame=new VGame();
		
		Command NewsChannelCommand= new NewsChannelCommand(tv,setupbox,soundsystem,vgame);
		Command SerialChannelCommand = new SerialChannelCommand(tv,setupbox,soundsystem,vgame);
		Command TTGameCommand=new TTGameCommand(tv,setupbox,soundsystem,vgame);
		
		UniversalRemote ur = new UniversalRemote();
		ur.assignCommand(1, TTGameCommand);
		ur.assignCommand(2, NewsChannelCommand);
		ur.assignCommand(3, SerialChannelCommand);
		ur.executeCommand(0);
	}

}










