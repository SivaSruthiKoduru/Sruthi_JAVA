package MementoPattern;
/**
 * This is the Originator class
 * This has methods getState,saveStateToMemento,getStateFromMemento
 * It also has a constructor
 * @author sivasruthikoduru
 *
 */
class Originator {
	private String state;
	/**
	 * This is the Originator constructor
	 * @param Nothing
	 * @return Nothing
	 */
	public Originator() {
		System.out.println("originator...");
	}
	/**
	 * This is the setState method
	 * 
	 * @param state
	 * @return Nothing
	 */
	public void setState(String state)
	{
		this.state=state;
	}
	/**
	 * This is getState method
	 * @param Nothing
	 * @return state
	 */
	public String getState()
	{
		return state;
	}
	/**
	 * This is saveStateToMementoPattern method
	 * @param nothing
	 * @return MementoPattern(state);
	 */
	public MementoPattern saveStateToMemento()
	{
		return new MementoPattern(state);
	}
	/**
	 * This is getStateFromMemento method
	 * 
	 * @param memento
	 * @return Nothing
	 */
	public void getStateFromMemento(MementoPattern memento)
	{
		state=memento.getState();
	}

}