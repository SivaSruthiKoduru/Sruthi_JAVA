package StrategyPatternPackage;
import java.util.Scanner;
public class StrategyPattern {
	public static void main(String[] args)throws Exception {
		PaintBrush paintBrush = new PaintBrush();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter choice..");
		String colourString = scan.next();
		colourString="StrategyPatternPackage."+colourString;
		paintBrush.paint=(Paint)Class.forName(colourString).getConstructor().newInstance();
		paintBrush.doColour();
		
		}

}



