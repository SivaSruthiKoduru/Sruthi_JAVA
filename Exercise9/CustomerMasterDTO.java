package Exercise9;

import java.io.Serializable;
import java.util.Objects;

public class CustomerMasterDTO implements Serializable,Comparable<CustomerMasterDTO>
{
	private String customerId,customerName,customerAddress;
	public CustomerMasterDTO()
	{
		
	}
	private CustomerMasterDTO(String customerId,String customerName,String customerAddress)
	{
		this.customerId=customerId;
		this.customerName=customerName;
		this.customerAddress=customerAddress;
	}
	public int compareTo(CustomerMasterDTO customerMasterDto)
	{
		return this.customerId.compareTo(customerMasterDto.customerId);
	}
	public int hashCode()
	{
		return Objects.hash(customerId,customerName,customerAddress);
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
		CustomerMasterDTO other=(CustomerMasterDTO)obj;
		return Objects.equals(customerId, other.customerId)&&Objects.equals(customerName, other.customerName)&&Objects.equals(customerAddress, other.customerAddress);
	}
	public String toString()
	{
		return "CustomerMasterDTO [customerId=" + customerId + ", customerName=" + customerName + ", customerAddress=" + customerAddress + "]";
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	
	
}
