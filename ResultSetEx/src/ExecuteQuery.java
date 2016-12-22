import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExecuteQuery
{

	public static void main(String[] args)throws ClassNotFoundException,SQLException
	{
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
		Statement stmt=conn.createStatement();
		ResultSet rs=stmt.executeQuery("select * from table1");
	
		System.out.println("id:"+"\t"+"name");
		
		System.out.println("--------------------------");
		while(rs.next())
		{
		System.out.println(rs.getInt(1)+"\t"+rs.getString("name"));
		}
	}

}