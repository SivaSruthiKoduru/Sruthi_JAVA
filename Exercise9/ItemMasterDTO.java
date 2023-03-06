package Exercise9;

import java.io.Serializable;
import java.util.Objects;

public class ItemMasterDTO implements Serializable,Comparable<ItemMasterDTO>{
	private int itemPrice;
	private String itemDescription,itemNo,itemUnit;
	public ItemMasterDTO()
	{
		
	}
	public ItemMasterDTO(String itemNo,String itemUnit,int itemPrice,String itemDescription)
	{
		this.itemNo=itemNo;
		this.itemPrice=itemPrice;
		this.itemUnit=itemUnit;
		this.itemDescription=itemDescription;
	}
	public int compareTo(ItemMasterDTO itemMasterDto)
	{
		return this.itemNo.compareTo(itemMasterDto.itemNo);
	}
	public int hashCode()
	{
		return Objects.hash(itemNo,itemUnit,itemPrice,itemDescription);
	}
	public boolean equals(Object obj)
	{
		if(this==obj)
		{
			return true;
		}
		if(obj==null)
		{
			return false;
		}
		if(getClass()!=obj.getClass())
		{
			return false;
		}
		ItemMasterDTO other=(ItemMasterDTO)obj;
		return itemPrice==other.itemPrice&&Objects.equals(itemNo, other.itemNo)&&Objects.equals(itemDescription, other.itemDescription)&&Objects.equals(itemUnit, other.itemUnit);
	}
	public String toString()
	{
		return "ItemMasterDTO [itemNo=" + itemNo + ", itemPrice=" + itemPrice + ", itemDescription=" +itemDescription + ", itemUnit="+itemUnit+ "]";
	}
	public int getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}
	public String getItemDescription() {
		return itemDescription;
	}
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	public String getItemNo() {
		return itemNo;
	}
	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}
	public String getItemUnit() {
		return itemUnit;
	}
	public void setItemUnit(String itemUnit) {
		this.itemUnit = itemUnit;
	}
	

}
