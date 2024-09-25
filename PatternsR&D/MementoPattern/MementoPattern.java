package MementoPattern;
import java.util.ArrayList;
import java.util.List;
/**
 * This is MementoPattern class 
 * It has getState Method
 * It also has a constructor
 * @author sivasruthikoduru
 *
 */

public class MementoPattern {
	private String state;
	/**
	 * This is the Mementopattern constructor
	 * @param state
	 * @return Nothing
	 */
	public MementoPattern(String state)
	{
		this.state=state;
	}
	/**
	 * This is getState method
	 * @param  Nothing
	 * @return String state
	 */
	public  String getState()
	{
		return state;
	}

}

