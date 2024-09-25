package BridgePatternPackage;
/*
 * 	This is LowFatIcream Class
 * This extends IceCream
 * This has assemble and cupCheck methods
 */
public class LowFatIcecream extends IceCream {
/**
 * This is assemble methood that assembles the LowFatIcream
 * @param nothing
 * @return nothing
 */
    
    public void assemble() {
        System.out.println("Adding Sauce: " + sauce);
        System.out.println("Adding Toppings: " + toppings);
        System.out.println("Adding Pepperoni");
    }

   /**
    * This is cupCheck method.That prints the cup size
    * @param nothing
    * @return nothing 
    */
    public void cupCheck() {
        System.out.println("Cup is: " + cup);
    }

}
