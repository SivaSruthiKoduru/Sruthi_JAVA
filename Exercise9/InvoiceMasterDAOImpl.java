package Exercise9;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import daoproject.DBUtility;
import daoproject.UserDAO;
import daoproject.UserDAOImpl;
import daoproject.UserDTO;

public class InvoiceMasterDAOImpl extends InvoiceMasterDAO {
	private static InvoiceMasterDAOImpl invoiceMasterDao;
	public static InvoiceMasterDAOImpl getCustomerDAOImplObject()
	{
		if(invoiceMasterDao==null)
		{
			invoiceMasterDao=new InvoiceMasterDAOImpl();
			return invoiceMasterDao;
		}
		else
		{
			return invoiceMasterDao.createClone();
		}
	}
	private InvoiceMasterDAOImpl createClone()
	{
		if(invoiceMasterDao!=null)
		{
			try
			{
				return (InvoiceMasterDAOImpl)super.clone();
			}
			catch(Exception e)
			{
				e.printStackTrace();
				return null;
			}
		
		}
		else
		{
			return null;
		}
	}
	private InvoiceMasterDAOImpl()
	{
		
	}
	public InvoiceMasterDTO findByNo(int invoiceNo)
	{
		try
		{
			Connection con=DBUtility.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from InvoiceMaster where invoiceNo=?");
			ps.setInt(1, invoiceNo);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				InvoiceMasterDTO dto = new InvoiceMasterDTO();
				dto.setInvoiceNo(invoiceNo);
				dto.setCustomerId(rs.getString("customerId"));
				dto.setDate(rs.getString("date"));
				return dto;
			}
			else
			{
				return null;
			}
			
		}
		catch(Exception e)
		{
			DBUtility.closeConnection(e);
			return null;
		}
	}
	public InvoiceMasterDTO findById(String customerId)
	{
		try
		{
			Connection con=DBUtility.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from InvoiceMaster where customerId=?");
			ps.setString(1, customerId);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				InvoiceMasterDTO dto = new InvoiceMasterDTO();
				dto.setInvoiceNo(rs.getInt("invoiceNo"));
				dto.setCustomerId(customerId);
				dto.setDate(rs.getString("date"));
				return dto;
			}
			else
			{
				return null;
			}
			
		}
		catch(Exception e)
		{
			DBUtility.closeConnection(e);
			return null;
		}
		
	}
	public Collection<InvoiceMasterDTO> findAll() {
		try
		{
			Connection con=DBUtility.getConnection();
			Statement ps=con.createStatement();
			ResultSet rs=ps.executeQuery("select * from InvoiceMaster");
			List<InvoiceMasterDTO> iMaster=new ArrayList<InvoiceMasterDTO>();
			while(rs.next())
			{
				InvoiceMasterDTO dto = new InvoiceMasterDTO();
				dto.setInvoiceNo(rs.getInt("invoiceNo"));
				dto.setCustomerId(rs.getString("customerId"));
				dto.setDate(rs.getString("date"));
				iMaster.add(dto);
				
				
			}
			return iMaster;
		}
		catch(Exception e)
		{
			DBUtility.closeConnection(e);
			return null;
		}
	}
	public int updateCustomer(InvoiceMasterDTO invoiceMasterDTO)
	{
		try
		{
			Connection con=DBUtility.getConnection();
			int invoiceNo=invoiceMasterDTO.getInvoiceNo();
			PreparedStatement ps=con.prepareStatement("select * from InvoiceMaster where invoiceNo=?");
			ps.setInt(1, invoiceNo);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				ps=con.prepareStatement("update InvoiceMaster set customerId=?,date=? where invoiceNo=?");
				ps.setString(1, invoiceMasterDTO.getCustomerId());
				ps.setString(2, invoiceMasterDTO.getDate());
				ps.setInt(3, invoiceMasterDTO.getInvoiceNo());
				int n=ps.executeUpdate();
				DBUtility.closeConnection(null);
				return n;
			}
			else {
				return 0;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			DBUtility.closeConnection(e);
			return 0;
		}
	}
	public int deleteCustomerById(String customerId) 
	{
		try
		{
			Connection con=DBUtility.getConnection();
			PreparedStatement ps=con.prepareStatement("delete from InvoiceMaster where customerId=?");
			ps.setString(1, customerId);
			int n=ps.executeUpdate();
			DBUtility.closeConnection(null);
			return n;
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			DBUtility.closeConnection(e);
			return 0;
		}
	}
	public int deleteCustomerByInvoiceNo(int invoiceNo)
	{
		try
		{
			Connection con=DBUtility.getConnection();
			PreparedStatement ps=con.prepareStatement("delete from InvoiceMaster where invoiceNo=?");
			ps.setInt(1, invoiceNo);
			int n=ps.executeUpdate();
			return n;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			DBUtility.closeConnection(e);
			return 0;
		}
	}
	public static void main(String[] args) 
	{
		InvoiceMasterDAO invoiceMasters=new InvoiceMasterDAOImpl();
		System.out.println(invoiceMasters.findById("c002"));
		
		//System.out.println(invoiceMasters.findByNo(3));
		
		
		InvoiceMasterDTO imd=invoiceMasters.findByNo(3);
		imd.setDate("12-12-2003");
		imd.setCustomerId("c006");
		
        int n=invoiceMasters.updateCustomer(imd);
    	System.out.println(n);
//		System.out.println(invoiceMasters.deleteCustomerById("c005"));
		
	}

}






