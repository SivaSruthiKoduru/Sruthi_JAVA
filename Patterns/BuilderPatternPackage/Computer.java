package BuilderPatternPackage;

import BuilderPatternPackage.Computer.BuildComputer;
import BuilderPatternPackage.Computer.Cabinet;

class Computer
{
	class Cabinet
	{
		String motherboard,ram,harddisk,vgacard,ssd;
		public Cabinet(String motherboard,String ram,String harddisk,String vgacard,String ssd) {
			this.motherboard=motherboard;
			this.ram=ram;
			this.harddisk=harddisk;
			this.vgacard=vgacard;
			this.ssd=ssd;

		}
		public String toString() {
			return "Cabinet [motherboard is" + motherboard + ", ram is" + ram + ", harddisk is" + harddisk + ", vgacard is"
					+ vgacard + ", ssd is" + ssd + "]";
			}
	}
	Cabinet c;
	String brandName="New Brand";
	public Computer(BuildComputer bc)
	{
		c = new Cabinet(bc.motherboard,bc.ram,bc.harddisk,bc.vgacard,bc.ssd);
		
	}
	public String toString() {
		return "Computer [c=" + c + ", brand=" + brandName + "]";
	}
	static class BuildComputer
	{
		String motherboard,ram,harddisk,vgacard,ssd;
		public  BuildComputer setMotherboard(String motherboard)
		{
			this.motherboard=motherboard;
			return this;
		}
		public  BuildComputer setRam(String ram)
		{
			this.ram=ram;
			return this;
		}
		public  BuildComputer setHardDisk(String harddisk)
		{
			this.harddisk=harddisk;
			return this;
		}
		public  BuildComputer setVgaCard(String vgacard)
		{
			this.vgacard=vgacard;
			return this;
		}
		public  BuildComputer setSsd(String ssd)
		{
			this.ssd=ssd;
			return this;
		}
		public Computer build()
		{
			return new Computer(this);
		}
	}
}
