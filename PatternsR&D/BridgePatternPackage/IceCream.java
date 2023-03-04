package BridgePatternPackage;
/**
 * This is IceCream class.
 * It is the parent class of CreamyIcecream and LowFatIcecream
 * @author sivasruthikoduru
 *
 */

public abstract class IceCream {

    protected String sauce;
    protected String toppings;
    protected String cup;
/**
 * This is abstract method assemble.
 * It is implemented in CreamyIceCream and LowFatIcecream
 * @param Nothing
 * @return Nothing
 */
    public abstract void assemble();
    /**
     * This is abstract method cupCheck.
     * It is implemented in CreamyIceCream and LowFatIcecream
     * @param Nothing
     * @return Nothing
     */
        
    public abstract void cupCheck();
 /**
  * This is setToppings Method
  * @return Nothing
  * @param toppings
  */
	public void setToppings(String toppings) {
		this.toppings=toppings;
	}
	/**
	 * This is setSauce method
	 * @return Nothing
	 * @param sauce
	 */
	public void setSauce(String sauce) {
		this.sauce=sauce;
	}
	/**
	 * This is setCup method
	 * @param cup
	 * @return Nothing
	 */
	public void setCup(String cup) {

		this.cup=cup;
	}

}