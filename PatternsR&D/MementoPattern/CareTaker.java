package MementoPattern;

import java.util.ArrayList;
import java.util.List;
/**
 * This is CareTaker class
 * This has add and get methods
 * @author sivasruthikoduru
 *
 */
class CareTaker
{
	private List<MementoPattern> mementoList=new ArrayList<MementoPattern>();
	/**
	 * This is add method that adds the state given
	 * 
	 * @param state
	 * *return Nothing
	 */
	public void add(MementoPattern state)
	{
		mementoList.add(state);
	}
	/**
	 * This is get method
	 * @param index
	 * @return MomentoPattern
	 */
	public MementoPattern get(int index)
	{
		return mementoList.get(index);
	}
}