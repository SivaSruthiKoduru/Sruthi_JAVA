package Exercise9;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import daoproject.DBUtility;

public class InvoiceTransDAOImpl extends InvoiceTransDAO{
	private static InvoiceTransDAOImpl invoiceTransDao;
	public static InvoiceTransDAOImpl getInvoiceTransDAaoImplObject()
	{
		if(invoiceTransDao==null)
		{
			invoiceTransDao=new InvoiceTransDAOImpl();
			return invoiceTransDao;
		}
		else
		{
			return invoiceTransDao.createClone();
		}
	}
	private InvoiceTransDAOImpl createClone()
	{
		if(invoiceTransDao!=null)
		{
			try
			{
				return (InvoiceTransDAOImpl)super.clone();
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
	private InvoiceTransDAOImpl()
	{
		
	}


	public InvoiceTransDTO findById(String itemNo) {
		try
		{
			Connection con=DBUtility.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from InvoiceTrans where itemNo=?");
			ps.setString(1, itemNo);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				InvoiceTransDTO dto = new InvoiceTransDTO();
				dto.setItemNo(itemNo);
				dto.setInvoiceNo(rs.getInt("invoiceNo"));
				dto.setItemQty(rs.getInt("itemQty"));
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

	
	public InvoiceTransDTO findByNo(int invoiceNo) {
		try
		{
			Connection con=DBUtility.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from InvoiceTrans where invoiceNo=?");
			ps.setInt(1, invoiceNo);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				InvoiceTransDTO dto = new InvoiceTransDTO();
				dto.setItemNo(rs.getString("itemNo"));
				dto.setInvoiceNo(invoiceNo);
				dto.setItemQty(rs.getInt("itemQty"));
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

		
	

	
	public Collection<InvoiceTransDTO> findAll() {
		try
		{
			Connection con=DBUtility.getConnection();
			Statement ps=con.createStatement();
			ResultSet rs=ps.executeQuery("select * from InvoiceTrans");
			List<InvoiceTransDTO> ITrans=new ArrayList<InvoiceTransDTO>();
			while(rs.next())
			{
				InvoiceTransDTO dto = new 	InvoiceTransDTO();
				dto.setInvoiceNo(rs.getInt("invoiceNo"));
				dto.setItemNo(rs.getString("itemNo"));
				dto.setItemQty(rs.getInt("itemQty"));
				ITrans.add(dto);
				
				
			}
			return ITrans;
		}
		catch(Exception e)
		{
			DBUtility.closeConnection(e);
			return null;
		}
		
	}

	
	public int updateInvoice(InvoiceTransDTO invoiceTransDto) {
		try
		{
			Connection con=DBUtility.getConnection();
			int invoiceNo=invoiceTransDto.getInvoiceNo();
			PreparedStatement ps=con.prepareStatement("select * from InvoiceTrans where invoiceNo=?");
			ps.setInt(1, invoiceNo);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				ps=con.prepareStatement("update InvoiceTrans set itemQty=?,itemNo=? where invoiceNo=?");
				ps.setInt(1, invoiceTransDto.getItemQty());
				ps.setString(2, invoiceTransDto.getItemNo());
				ps.setInt(3, invoiceTransDto.getInvoiceNo());
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

	public int deleteInvoiceById(String itemNo) {
		try
		{
			Connection con=DBUtility.getConnection();
			PreparedStatement ps=con.prepareStatement("delete from InvoiceTrans where itemNo=?");
			ps.setString(1, itemNo);
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


	public int deleteInvoiceByNo(int invoiceNo) {
		try
		{
			Connection con=DBUtility.getConnection();
			PreparedStatement ps=con.prepareStatement("delete from InvoiceTrans where invoiceNo=?");
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
		InvoiceTransDAO invoiceTrans=new InvoiceTransDAOImpl();
		System.out.println(invoiceTrans.findById("i002"));
		
		System.out.println(invoiceTrans.findByNo(4));
		
		
		InvoiceTransDTO itd=invoiceTrans.findByNo(3);
		itd.setItemNo("i006");
		itd.setItemQty(6);
		
        int n=invoiceTrans.updateInvoice(itd);
////    	System.out.println(n);
//		System.out.println(invoiceTrans.deleteInvoiceById("i001"));
		
	}
	

}
