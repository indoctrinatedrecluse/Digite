import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementDemo {
	public static void main(String[] args) {
		String sql = "INSERT INTO customer VALUES (303, 'Polo', 'Indore', 2500)";
		Connection conn = null;
		
		try {
			conn = JdbcFactory.getConnection();
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("Record Inserted!");
		} catch (SQLException e) {
			System.out.println("Insert failed due to ");
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
