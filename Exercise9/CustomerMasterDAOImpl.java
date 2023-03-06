package Exercise9;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import daoproject.DBUtility;

public class CustomerMasterDAOImpl extends CustomerMasterDAO{
	private static CustomerMasterDAOImpl customerMasterDao;
	public static CustomerMasterDAOImpl getCustomerDAOImplObject()
	{
		if(customerMasterDao==null)
		{
			customerMasterDao=new CustomerMasterDAOImpl();
			return customerMasterDao;
		}
		else
		{
			return customerMasterDao.createClone(); 
		}
	}
	private CustomerMasterDAOImpl createClone()
	{
		if(customerMasterDao!=null)
		{
			try
			{
				return (CustomerMasterDAOImpl)super.clone();
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
	private CustomerMasterDAOImpl()
	{
		
	}
	public CustomerMasterDTO findById(String customerId)
	{
		try
		{
			Connection con=DBUtility.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from CustomerMaster where customerId=?");
			ps.setString(1, customerId);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				CustomerMasterDTO dto = new CustomerMasterDTO();
				dto.setCustomerId(customerId);
				dto.setCustomerName(rs.getString("customerName"));
				dto.setCustomerAddress(rs.getString("customerAddress"));
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
	public CustomerMasterDTO findByName(String customerName)
	{
		try
		{
			Connection con=DBUtility.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from CustomerMaster where customerName=?");
			ps.setString(1, customerName);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				CustomerMasterDTO dto = new CustomerMasterDTO();
				dto.setCustomerId(rs.getString("customerId"));
				dto.setCustomerName(customerName);
				dto.setCustomerAddress(rs.getString("customerAddress"));
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
	public Collection<CustomerMasterDTO> findAll() {
		try
		{
			Connection con=DBUtility.getConnection();
			Statement ps=con.createStatement();
			ResultSet rs=ps.executeQuery("select * from CustomerMaster");
			List<CustomerMasterDTO> CMaster=new ArrayList<CustomerMasterDTO>();
			while(rs.next())
			{
				CustomerMasterDTO dto = new 	CustomerMasterDTO();
				dto.setCustomerId(rs.getString("customerId"));
				dto.setCustomerName(rs.getString("customerName"));
				dto.setCustomerAddress(rs.getString("customerAddress"));
				CMaster.add(dto);
				
				
			}
			return CMaster;
		}
		catch(Exception e)
		{
			DBUtility.closeConnection(e);
			return null;
		}
	}
	public int updateCustomer(CustomerMasterDTO customerMasterDTO)
	{
		try
		{
			Connection con=DBUtility.getConnection();
			String customerId=customerMasterDTO.getCustomerId();
			PreparedStatement ps=con.prepareStatement("select * from CustomerMaster where customerId=?");
			ps.setString(1, customerId);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				ps=con.prepareStatement("update CustomerMaster set customerName=?,customerAddress=? where customerId=?");
				ps.setString(1, customerMasterDTO.getCustomerName());
				ps.setString(2, customerMasterDTO.getCustomerAddress());
				ps.setString(3, customerMasterDTO.getCustomerId());
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
			PreparedStatement ps=con.prepareStatement("delete from CustomerMaster where customerId=?");
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
	public int deleteCustomerByName(String customerName)
	{
		try
		{
			Connection con=DBUtility.getConnection();
			PreparedStatement ps=con.prepareStatement("delete from CustomerMaster where customerName=?");
			ps.setString(1, customerName);
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
		customerMasterDao =new CustomerMasterDAOImpl();
		System.out.println(customerMasterDao.findById("c003"));
		
		System.out.println(customerMasterDao.findByName("ghu"));
		
		
		CustomerMasterDTO cmd=customerMasterDao.findById("c002");
		cmd.setCustomerName("rat");
		cmd.setCustomerAddress("chennai");
//		
        int n=customerMasterDao.updateCustomer(cmd);
//    	System.out.println(n);
       System.out.println(customerMasterDao.deleteCustomerById("c004"));
	}
		
	
	
	
	
	
	
	

}
