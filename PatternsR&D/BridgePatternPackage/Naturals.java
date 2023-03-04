package BridgePatternPackage;
/**
 * This is Naturals class 
 * This extends IceCreamParlour
 *
 * @author sivasruthikoduru
 *
 */
public class Naturals extends IcecreamParlour {
/**
 * This is the constructor of IceCreamParlour
 * @param icecream
 * 
 */
    public Naturals(IceCream icecream) {
        super(icecream);
    }
/**
 * This is addToppings method.
 * It adds Mangoes
 * @param Nothing
 * @return Nothing
 */
    public void addToppings() {
    	icecream.setToppings("mango");
    }

/**
 * This is addSauce method that adds Strawberry Sauce
 *   @param Nothing
 *   @return Nothing
 */
    public void addSauce() {
    	icecream.setSauce("Strawberry sauce");
    }

 /**
  * This is makeCup method that makes small cups
  * @param Nothing
  * @return Nothing
  */
    public void makeCup() {
    	icecream.setCup("small");
    }

}