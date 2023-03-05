package Exercise9;

import java.util.Collection;

public abstract class InvoiceMasterDAO
{
	public abstract InvoiceMasterDTO findByNo(int invoiceNo);
	public abstract InvoiceMasterDTO findById(String customerId);
	public abstract Collection<InvoiceMasterDTO>findAll();
	public abstract int updateCustomer(InvoiceMasterDTO invoiceMasterDTO);
	public abstract int deleteCustomerById(String customerId);
	public abstract int deleteCustomerByInvoiceNo(int invoiceNo);
	
}
