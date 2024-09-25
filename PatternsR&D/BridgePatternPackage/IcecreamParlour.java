package BridgePatternPackage;
/**
 * This is an abstract class IceCreamParlour
 * It is super class for Ibaco and Naturals
 * It has abstract methods like addSauce,addToppings,makeCup
 * @author sivasruthikoduru
 *
 */
public abstract class IcecreamParlour {

    protected IceCream icecream;
/**
 * This is IceCreamParlour Constructor
 * @param icecream
 */
    protected IcecreamParlour(IceCream icecream) {
        this.icecream = icecream;
    }
/**
 * This is abstract method addSauce
 * @param nothing
 * @return nothing
 */
    abstract void addSauce();
    /**
     * This is abstract method addToppings
     * @param nothing
     * @return nothing
     */
    abstract void addToppings();
    /**
     * This is abstract method makeCup
     * @param nothing
     * @return nothing
     */
    abstract void makeCup();
/**
 * This is deliver methos that calls other methods
 * @param nothing
 * @return nothing
 */
    public void deliver() {
        makeCup();
        addSauce();
        addToppings();
        icecream.assemble();
        icecream.cupCheck();
        System.out.println("Order in Progress!");
    }

}