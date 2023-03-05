package Exercise9;

import java.util.Collection;

public abstract class InvoiceTransDAO {
	public abstract InvoiceTransDTO findById(String itemNo);
	public abstract InvoiceTransDTO findByNo(int invoiceNo);
	public abstract Collection<InvoiceTransDTO>findAll();
	public abstract int updateInvoice(InvoiceTransDTO invoiceTransDto);
	public abstract int deleteInvoiceById(String itemNo);
	public abstract int deleteCustomerByNo(int invoiceNo);

}
