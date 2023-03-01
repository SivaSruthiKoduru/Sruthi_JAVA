package StrategyPatternPackage;
import java.util.Scanner;
public class StrategyPattern {
	public static void main(String[] args)throws Exception {
		PaintBrush p = new PaintBrush();
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		s="StrategyPatternPackage."+s;
		p.paint=(Paint)Class.forName(s).getConstructor().newInstance();
		p.doColour();
		
		}

}



