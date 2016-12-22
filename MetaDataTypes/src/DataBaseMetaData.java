import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseMetaData {

		public static void main(String[] args) throws ClassNotFoundException,SQLException
		{
			// TODO Auto-generated method stub
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
	Statement st=conn.createStatement();
	DatabaseMetaData d=conn.getMetaData();
	System.out.println(d.getDatabaseProductVersion());
	System.out.println(d.getMaxRowSize());
ResultSet rs=st.executeQuery("select * from batch");
ResultSetMetaData rd=rs.getMetaData();
System.out.println(rd.getColumnCount());
System.out.println(rd.getColumnName(2));

	}

}
