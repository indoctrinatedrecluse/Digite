import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultDemo {
	public static void main(String[] args) {
		String sql = "SELECT * FROM customer WHERE LIMIT>2500";
		Connection conn = null;
		
		try {
			conn = JdbcFactory.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			ResultSetMetaData meta = rs.getMetaData();
			for (int i=1; i<=meta.getColumnCount(); i++)
				System.out.print(meta.getColumnLabel(i)+"\t");
			System.out.println();
			
			while (rs.next()) {
				for (int i=1; i<=meta.getColumnCount(); i++)
					System.out.print(rs.getString(i)+"\t");
				System.out.println();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
