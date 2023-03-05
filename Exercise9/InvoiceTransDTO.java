package Exercise9;

import java.io.Serializable;
import java.util.Objects;

public class InvoiceTransDTO implements Serializable,Comparable<InvoiceTransDTO>{
	private int invoiceNo,itemQty;
	private String itemNo;
	public InvoiceTransDTO()
	{
		
	}
	public InvoiceTransDTO(int invoiceNo,String itemNo,int itemQty)
	{
		this.invoiceNo=invoiceNo;
		this.itemNo=itemNo;
		this.itemQty=itemQty;
	}
	public int compareTo(InvoiceTransDTO invoiceTransDto)
	{
		return this.itemNo.compareTo(itemNo);
	}
	public int hashCode()
	{
		return Objects.hash(invoiceNo,itemNo,itemQty);
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
		InvoiceTransDTO other=(InvoiceTransDTO)obj;
		return invoiceNo==other.invoiceNo&&itemQty==other.itemQty&&Objects.equals(itemNo, other.itemNo);
		
	}
	public String toString()
	{
		return "InvoiceTransDTO [invoiceNo=" + invoiceNo + ", itemNo=" + itemNo + ", itemQty=" + itemQty + "]";
	}
	public int getInvoiceNo() {
		return invoiceNo;
	}
	public void setInvoiceNo(int invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public int getItemQty() {
		return itemQty;
	}
	public void setItemQty(int itemQty) {
		this.itemQty = itemQty;
	}
	public String getItemNo() {
		return itemNo;
	}
	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}
	
	
	

}
