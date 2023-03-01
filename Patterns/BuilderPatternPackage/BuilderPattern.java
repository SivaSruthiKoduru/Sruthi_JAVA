package BuilderPatternPackage;

public class BuilderPattern {
	public static void main(String[] args) {
		Computer computer=new Computer.BuildComputer().setMotherboard(" intel").setRam(" 1024gb").setHardDisk(" 1000tb").
				setSsd(" 35million tb ssd hd").setVgaCard(" full graphics").build();
		System.out.println(computer);
	}

}
