package Exercise9;

import java.util.Collection;

public abstract class CustomerMasterDAO {
	public abstract CustomerMasterDTO findById(String customerId);
	public abstract CustomerMasterDTO findByName(String customerName);
	public abstract Collection<CustomerMasterDTO>findAll();
	public abstract int updateCustomer(CustomerMasterDTO customerMasterDto);
	public abstract int deleteCustomerById(String customerId);
	public abstract int deleteCustomerByName(String customerName);
	

}
