package BridgePatternPackage;
/**
 * This is CreamyIcecream class that extends IceCream Class
 * 
 * @author sivasruthikoduru
 *
 */
public class CreamyIcecream extends IceCream {
/**
 * This assemble method that assembles the CreameyIcecream
 * @param nothing
 * @return returns void
 */
    
    public void assemble() {
        System.out.println("Adding Sauce: " + sauce);
        System.out.println("Adding Toppings: " + toppings);
        System.out.println("Adding Cream");
    }
    /**
     * This cupCheck method that checks the cup for the CreameyIcecream
     * @param nothing
     * @return returns void
     */
    public void cupCheck() {
        System.out.println("Cup is: " + cup);
    }

}