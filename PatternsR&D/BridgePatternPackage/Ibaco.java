package BridgePatternPackage;
/**
 * This is Ibaco Class that represents an ice cream parlour.
 * It extends IceCreamParlour
 * It has three methods addToppings,addSauce,makeCup
 * It also has a constructor
 * @author sivasruthikoduru
 *
 */
public class Ibaco extends IcecreamParlour {
/**
 * constructor of Ibaco
 * @param icecream
 */
    public Ibaco(IceCream icecream) {
        super(icecream);
    }
/**
 * This is addToppings method .It adds Chocochips
 * @param nothing
 * @return nothing
 */
    
    public void addToppings() {
        icecream.setToppings("Choco chips");
    }
    /**
     * This is addSacuse method .It adds Ibaco special sauce.
     * @param nothing
     * @return nothing
     */
    
    public void addSauce() {
        icecream.setSauce("Ibaco sepcial sauce");
    }
    /**
     * This is makeCup method .It makes Large cup.
     * @param nothing
     * @return nothing
     */
    
    public void makeCup() {
        icecream.setCup("Large");
    }

}