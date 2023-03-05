package Exercise9;

import java.util.Collection;

public abstract class ItemMasterDAO {
	public abstract ItemMasterDTO findById(String itemNo);
	public abstract Collection<ItemMasterDTO>findAll();
	public abstract int updateItem(ItemMasterDTO itemMasterDto);
	public abstract int deleteItemById(String itemNo);

}
