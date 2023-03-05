package Exercise9;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import daoproject.DBUtility;

public class ItemMasterDAOImpl extends ItemMasterDAO{
	private static ItemMasterDAOImpl itemMasterDao;
	public static ItemMasterDAOImpl getItemDaoObject()
	{
		if(itemMasterDao==null)
		{
			itemMasterDao=new ItemMasterDAOImpl();
			return itemMasterDao;
		}
		else
		{
			return itemMasterDao.createClone();
		}
	}
	private ItemMasterDAOImpl createClone()
	{
		if(itemMasterDao!=null)
		{
			try
			{
				return (ItemMasterDAOImpl)super.clone();
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
	private ItemMasterDAOImpl()
	{
		
	}
	
	public ItemMasterDTO findById(String itemNo) {
		try
		{
			Connection con=DBUtility.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from ItemMaster where itemNo=?");
			ps.setString(1, itemNo);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				ItemMasterDTO dto = new ItemMasterDTO();
				dto.setItemNo(itemNo);
				dto.setItemPrice(rs.getInt("itemPrice"));
				dto.setItemUnit(rs.getString("itemunit"));
				dto.setItemDescription(rs.getString("itemDescription"));
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

	public Collection<ItemMasterDTO> findAll() {
		try
		{
			Connection con=DBUtility.getConnection();
			Statement ps=con.createStatement();
			ResultSet rs=ps.executeQuery("select * from ItemMaster");
			List<ItemMasterDTO> ITrans=new ArrayList<ItemMasterDTO>();
			while(rs.next())
			{
				ItemMasterDTO dto = new ItemMasterDTO();
				dto.setItemNo(rs.getString("itemNo"));
				dto.setItemPrice(rs.getInt("itemPrice"));
				dto.setItemUnit(rs.getString("itemUnit"));
				dto.setItemDescription(rs.getString("itemDescription"));
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

	
	public int updateItem(ItemMasterDTO itemMasterDto) {
		try
		{
			Connection con=DBUtility.getConnection();
			String itemNo=itemMasterDto.getItemNo();
			PreparedStatement ps=con.prepareStatement("select * from ItemMaster where itemNo=?");
			ps.setString(1, itemNo);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				ps=con.prepareStatement("update ItemMaster set itemPrice=?,itemDescription=?,itemUnit=? where itemNo=?");
				ps.setInt(1, itemMasterDto.getItemPrice());
				ps.setString(2, itemMasterDto.getItemDescription());
				ps.setString(3, itemMasterDto.getItemUnit());
				ps.setString(4, itemMasterDto.getItemNo());
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
	
	public int deleteItemById(String itemNo) {
		try
		{
			Connection con=DBUtility.getConnection();
			PreparedStatement ps=con.prepareStatement("delete from ItemMaster where itemNo=?");
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
	public static void main(String[] args) 
	{
		ItemMasterDAO itemMaster=new ItemMasterDAOImpl();
		System.out.println(itemMaster.findById("i002"));
		
		
		
		ItemMasterDTO imd=itemMaster.findById("i003");
		imd.setItemPrice(50);
		imd.setItemDescription("in stock");
		imd.setItemUnit("Kgs");
		
        int n=itemMaster.updateItem(imd);
    	//System.out.println(n);
       System.out.println(itemMaster.deleteItemById("i005"));
	}

}
