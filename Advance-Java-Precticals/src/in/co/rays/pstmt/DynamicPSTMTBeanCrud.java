package in.co.rays.pstmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;

public class DynamicPSTMTBeanCrud {
	public static void main(String[] args) throws Exception {
		BeanBean bean = new BeanBean();
		bean.setId(15);
		bean.setRollNo(115);
		bean.setName("PSTMTBean");
		bean.setPhysics(20);
		bean.setChemistry(20);
		bean.setMaths(30);
		bean.setTotal(70);

		// testInsert(bean);
		// testUpdate("thakur jay", 7);
		// testDelete(15);
		testRead(bean);

	}

	public static void testInsert(BeanBean bean) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");

		PreparedStatement ps = conn.prepareStatement("insert into marksheet values(?,?,?,?,?,?,?)");

		ps.setInt(1, bean.getId());
		ps.setInt(2, bean.getRollNo());
		ps.setString(3, bean.getName());
		ps.setInt(4, bean.getPhysics());
		ps.setInt(5, bean.getChemistry());
		ps.setInt(6, bean.getMaths());
		ps.setInt(7, bean.getTotal());

		int i = ps.executeUpdate();
		System.out.println("data inserted=" + i);

	}

	public static void testUpdate(String name, int id) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");

		PreparedStatement ps = conn.prepareStatement("update marksheet set name =? where id =?");
		ps.setString(1, name);
		ps.setInt(2, id);

		int i = ps.executeUpdate();
		System.out.println("data updated=" + i);

	}

	public static void testDelete(int id) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");

		PreparedStatement ps = conn.prepareStatement("delete from marksheet where id =?");
		ps.setInt(1, id);

		int i = ps.executeUpdate();
		System.out.println("data deleted=" + i);

	}

	public static void testRead(BeanBean bean) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");

		PreparedStatement ps = conn.prepareStatement("select * from marksheet");
		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			System.out.print(rs.getInt(1));
			System.out.print("\t" + rs.getInt(2));
			System.out.print("\t" + rs.getString(3));
			System.out.print("\t" + rs.getInt(4));
			System.out.print("\t" + rs.getInt(5));
			System.out.print("\t" + rs.getInt(6));
			System.out.println("\t" + rs.getInt(7));
		}

	}

}
