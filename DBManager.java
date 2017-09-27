import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager 
{
	Connection connect;
	String url = "";
	
	DBManager()
	{
		try 
		{
			connect = DriverManager.getConnection(url);
	        System.out.println(url + "  connected...");
	    }
	    catch(SQLException ex) 
		{
	        System.err.println("SQL Exception: " + ex.getMessage());
	    }
	}
}
