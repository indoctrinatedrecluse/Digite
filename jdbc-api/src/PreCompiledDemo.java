import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreCompiledDemo {
	public static void main(String[] args) {
		String sql = "INSERT INTO customer VALUES (?,?,?,?)";
		Connection conn = null;
		
		try {
			conn = JdbcFactory.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, Integer.parseInt(args[0]));
			stmt.setString(2, args[1]);
			stmt.setString(3, args[2]);
			stmt.setDouble(4, Double.parseDouble(args[3]));
			stmt.executeUpdate();
			System.out.println("Record inserted!");
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
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
