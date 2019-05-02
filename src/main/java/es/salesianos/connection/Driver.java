package es.salesianos.connection;
import java.sql.*;
import java.util.TimeZone;

public class Driver {
	public static void main(String[] args) {
		Connection myConn = null;
		try {
			TimeZone.getDefault();
			myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/TFG", "root", "IVSZ2h12");
			//?useLegacyDatetimeCode=false
			//?verifyServerCertificate=false
			Statement myStmnt = myConn.createStatement();
			ResultSet myRs = myStmnt.executeQuery("select * from AVION");
			while (myRs.next()) {
				System.out.println(myRs.getString("idAVION") + ", " + myRs.getString("AVIONcol"));				
				
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
}
