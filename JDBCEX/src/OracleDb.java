import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleDb {

	public static void main(String[] args)throws ClassNotFoundException,SQLException
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
		Statement stmt=conn.createStatement();
		stmt.executeUpdate("insert into table1 values(400,'fatima')");
		
		System.out.print("row inserted");
		// TODO Auto-generated method stub

	}

}
