package in.co.rays.pstmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TestDynamicPSTMTInsert {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");

		PreparedStatement pstmt = conn.prepareStatement("insert into marksheet values(?,?,?,?,?,?,?)");

		pstmt.setInt(1, 13);
		pstmt.setInt(2, 113);
		pstmt.setString(3, "Jagjit");
		pstmt .setInt(4, 20);
		pstmt.setInt(5, 20);
		pstmt.setInt(6, 20);
		pstmt.setInt(7, 60);

		int i = pstmt.executeUpdate();

		System.out.println("data inserted=" + i);

	}

}
