package selenium;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.UUID;

import org.apache.commons.dbcp2.BasicDataSource;

public class DataBaseUtility 
{
	private static BasicDataSource dataSource;
	private static UUID uuid=UUID.randomUUID();
	private static BasicDataSource getDataSource()
	{
		if(dataSource==null)
		{
			BasicDataSource ds=new BasicDataSource();
			ds.setDriverClassName("org.postgresql.Driver");
			ds.setUrl("jdbc:postgresql://localhost/waterlabs");
			ds.setUsername("waterlabs");
			ds.setPassword("waterlabs");
			ds.setMinIdle(5);
			ds.setMaxIdle(10);
			ds.setMaxOpenPreparedStatements(100);
			dataSource=ds;
		}
		return dataSource;
		
	}
	public void insert(boolean error_any, String error_detail_notes, String accession_id, String subscriber_id, 
					String notes, String user_processed, String insurance_carrier, String process_id, String service_id)
					throws SQLException
	{
		BasicDataSource dataSource=DataBaseUtility.getDataSource();
		try(Connection connection=dataSource.getConnection();
				PreparedStatement pstmt=(connection).prepareStatement(
				"INSERT INTO \"xifinLasit_xifinevlasitreport\" (id, error_any,error_detail_notes,accession_id,subscriber_id,"
						+"notes, user_processed, insurance_carrier, processed_id, service_id, created_on) VALUES('"
						+ uuid + "','"+error_any+"','"+error_detail_notes+"','"+accession_id+"','"+subscriber_id+"','"+notes+"','"+user_processed+"','"+insurance_carrier+"','"+process_id+"','"+service_id+"','"
								+new Timestamp(System.currentTimeMillis())+ "')");)
		{
			System.out.println("The connection object is of class:" +connection.getClass());
			try
			{
				int resultSet=pstmt.executeUpdate();
			}
			catch (Exception e)
			{
				System.err.println("Exception occurred!!! :" +e.getMessage());
				e.printStackTrace();
			}
		}
	}
	public void insertLogEvents(String description, String dwId, String serviceId)throws SQLException
	{
		BasicDataSource dataSource=DataBaseUtility.getDataSource();
		try(
				Connection connection=dataSource.getConnection();
				PreparedStatement pstmt=connection.prepareStatement(
						"INSERT INTO \"xifinLasit_logevents\"(id,description,dw_id,service_id,created_on) VALUES ('"
								+uuid+"','"+description+"','"+dwId+"','"+serviceId
								+new Timestamp(System.currentTimeMillis())+"')");)
		{
			System.out.println("The Connection Object is of Class:" +connection.getClass());
			try
			{
				int resultSet = pstmt.executeUpdate();
			}
			catch (Exception e)
			{
				System.err.println("Exception occurred!!!"+e.getMessage());
				e.printStackTrace();
			}
		}
		
	}
	public void updateTaskErrorCount(String id) throws SQLException
	{
		BasicDataSource dataSource=DataBaseUtility.getDataSource();
		try(
				Connection connection=dataSource.getConnection();
				PreparedStatement pstmt=connection.prepareStatement(
						"UPDATE \"watelabs_newtasks\" set erro_count=error_count+1 where id="))
		{
			System.out.println("The connection object of class:" +connection.getClass());
			try
			{
				int resultSet=pstmt.executeUpdate();
			}
			catch(Exception e)
			{
				connection.rollback();
				System.err.println("Recored update failed.");
				e.printStackTrace();
			}
		}
		
	}
	public void updateNewTask(String id, String taskStatusTop, String taskStatusBottom, String completedCount,String errorCount)throws SQLException
	{
		uuid=UUID.randomUUID();
		String sqlUpdate="UPDATE \"waterlabs_newtasks\"" + "SET task_status_top=?," + "task_status_bottom=?," +"cmpleted_count=?," + "error_count=?" + "WHERE id::text=?";
		BasicDataSource dataSource=DataBaseUtility.getDataSource();
		try(Connection connection=dataSource.getConnection();
				PreparedStatement pstmt=connection.prepareStatement(sqlUpdate);)
		{
			pstmt.setString(1, taskStatusTop);
			pstmt.setString(2, taskStatusBottom);
			pstmt.setString(3, completedCount);
			pstmt.setString(4, errorCount);
			pstmt.setString(5, id);
			int queryStatus=pstmt.executeUpdate();
			System.out.println(queryStatus);
		}
		catch (Exception e)
		{
			System.err.println("Exception occured:" +e.getMessage());
			e.printStackTrace();
		}
	}
	public static void main(String arg[])
	{
		DataBaseUtility dataBaseUtility=new DataBaseUtility();
		try
		{
			dataBaseUtility.insert(false, "3245234", "3245234", "3245234", "3245234", "3245234", "3245234", "3245234", "3245234");
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}
