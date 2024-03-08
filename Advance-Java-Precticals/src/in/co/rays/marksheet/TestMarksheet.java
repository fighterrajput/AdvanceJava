package in.co.rays.marksheet;

import java.util.Iterator;
import java.util.List;

public class TestMarksheet {
	public static void main(String[] args) throws Exception {

		// testFindByPk();
		// testSearch();
		// testDelete();
		// testUpdate();
		// testAdd();
		testSearchDyanamic();
		// testNextPk();
	}

	public static void testNextPk() throws Exception {
		MarksheetModel model = new MarksheetModel();
		int pk = model.nextPk();
		System.out.println("pk=" + pk);
	}

	public static void testFindByPk() throws Exception {
		MarksheetModel model = new MarksheetModel();
		MarksheetBean bean = model.findByPk(1);

		System.out.print("\t" + bean.getId());
		System.out.print("\t" + bean.getRollNo());
		System.out.print("\t" + bean.getName());
		System.out.print("\t" + bean.getPhysics());
		System.out.print("\t" + bean.getChemistry());
		System.out.print("\t" + bean.getMaths());
		System.out.println("\t" + bean.getTotal());

	}

	public static void testSearch() throws Exception {
		MarksheetModel model = new MarksheetModel();
		model.search();

	}

	public static void testSearchDyanamic() throws Exception {
		MarksheetBean bean = new MarksheetBean();
		// bean.setId(6);
		bean.setName("'ankit'");

		MarksheetModel model = new MarksheetModel();
		List list = model.testSearchDynamic(bean, 1, 2);

		Iterator it = list.iterator();
		while (it.hasNext()) {
			bean = (MarksheetBean) it.next();
			System.out.print(bean.getId());
			System.out.print("\t" + bean.getRollNo());
			System.out.print("\t" + bean.getName());
			System.out.print("\t" + bean.getPhysics());
			System.out.print("\t" + bean.getChemistry());
			System.out.print("\t" + bean.getMaths());
			System.out.println("\t" + bean.getTotal());
		}
	}

	public static void testDelete() throws Exception {
		MarksheetModel model = new MarksheetModel();
		model.delete(12);
	}

	public static void testUpdate() throws Exception {
		MarksheetBean bean = new MarksheetBean();
		bean.setId(7);
		bean.setRollNo(107);
		bean.setName("Jay");
		bean.setPhysics(100);
		bean.setChemistry(100);
		bean.setMaths(100);
		bean.setTotal(300);

		MarksheetModel model = new MarksheetModel();
		model.update(bean);

	}

	public static void testAdd() throws Exception {
		MarksheetBean bean = new MarksheetBean();
		bean.setId(14);
		bean.setRollNo(114);
		bean.setName("Adarsh");
		bean.setPhysics(70);
		bean.setChemistry(70);
		bean.setMaths(70);
		bean.setTotal(210);

		MarksheetModel model = new MarksheetModel();
		model.add(bean);

	}
}
