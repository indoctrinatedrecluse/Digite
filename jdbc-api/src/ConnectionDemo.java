import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

public class ConnectionDemo {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			conn = JdbcFactory.getConnection();
			System.out.println("Completed successfully!");
			
			DatabaseMetaData meta = conn.getMetaData();
			System.out.println("DB Name: "+meta.getDatabaseProductName());
			System.out.println("DB Version: "+meta.getDatabaseProductVersion());
			System.out.println("Driver Name: "+meta.getDriverName());
			System.out.println("Driver Version: "+meta.getDriverVersion());
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
