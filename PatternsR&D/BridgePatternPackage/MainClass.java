package BridgePatternPackage;
/**
 * This is the main class MainClass
 * It contains the main method
 * @author sivasruthikoduru
 *
 */
public class MainClass {
/**
 * This is the main method
 * 
 * @param args
 * @return nothing
 */
    public static void main(String[] args) {

        IcecreamParlour ibaco = new Ibaco(new LowFatIcecream());
        ibaco.deliver();

        System.out.println();

        IcecreamParlour naturals = new Naturals(new CreamyIcecream());
        naturals.deliver();

    }

}