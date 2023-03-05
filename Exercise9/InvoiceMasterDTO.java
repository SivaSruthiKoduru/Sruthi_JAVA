package Exercise9;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class InvoiceMasterDTO implements Serializable,Comparable<InvoiceMasterDTO>{
	private int invoiceNo;
	String customerId;
	String date;
	public InvoiceMasterDTO()
	{
		
	}
	public InvoiceMasterDTO(int invoiceNo,String customerId,String date)
	{
		this.invoiceNo=invoiceNo;
		this.customerId=customerId;
	    this.date=date;
	}
	public int compareTo(InvoiceMasterDTO invoiceMasterDTO)
	{
		return this.customerId.compareTo(invoiceMasterDTO.customerId);
	}
	public int hashCode()
	{
		return Objects.hash(invoiceNo,customerId,date);
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
		InvoiceMasterDTO other=(InvoiceMasterDTO)obj;
		return invoiceNo==other.invoiceNo&&Objects.equals(customerId, other.customerId)&&Objects.equals(date, other.date);
		
	}
	public String toString()
	{
		return "InvoiceMasterDTO [invoiceNo=" + invoiceNo + ", customerId=" + customerId + ", date=" + date + "]";
	}
	public int getInvoiceNo() {
		return invoiceNo;
	}
	public void setInvoiceNo(int invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
}
