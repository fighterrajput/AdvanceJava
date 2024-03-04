package in.co.rays.user;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TestUser {
	public static void main(String[] args) throws Exception {

		add();
		// update();
		// delete();
		// findByPk();
		// search();
		// searchDynamic();

	}

	private static void searchDynamic() throws Exception {
		UserBean bean = new UserBean();
		bean.setFirstName("a");

		UserModel model = new UserModel();

		List list = model.searchDynamic(bean, 1, 1);
		Iterator it = list.iterator();

		while (it.hasNext()) {
			bean = (UserBean) it.next();

			System.out.print(bean.getId());
			System.out.print("\t" + bean.getFirstName());
			System.out.print("\t" + bean.getLastName());
			System.out.print("\t" + bean.getLoginId());
			System.out.print("\t" + bean.getPassword());
			System.out.print("\t" + bean.getDob());
			System.out.println("\t" + bean.getAddress());

		}

	}

	private static void search() throws Exception {
		UserModel model = new UserModel();
		List list = model.search();

		Iterator it = list.iterator();

		while (it.hasNext()) {
			UserBean bean = (UserBean) it.next();
			System.out.print(bean.getId());
			System.out.print("\t" + bean.getFirstName());
			System.out.print("\t" + bean.getLastName());
			System.out.print("\t" + bean.getLoginId());
			System.out.print("\t" + bean.getPassword());
			System.out.print("\t" + bean.getDob());
			System.out.println("\t" + bean.getAddress());
		}

	}

	private static void findByPk() throws Exception {
		UserModel model = new UserModel();

		UserBean bean = model.findByPk(1);
		System.out.print(bean.getId());
		System.out.print("\t" + bean.getFirstName());
		System.out.print("\t" + bean.getLastName());
		System.out.print("\t" + bean.getLoginId());
		System.out.print("\t" + bean.getPassword());
		System.out.print("\t" + bean.getDob());
		System.out.println("\t" + bean.getAddress());

	}

	private static void delete() throws Exception {
		UserModel model = new UserModel();
		model.delete(2);
	}

	private static void update() throws Exception {
		UserBean bean = new UserBean();

		bean.setId(2);
		bean.setFirstName("Jay");
		bean.setLastName("Singh");
		bean.setLoginId("thakurjaysingh@gmail.com");
		bean.setPassword("123");
		bean.setDob(new Date());
		bean.setAddress("Singrauli");

		UserModel model = new UserModel();
		model.update(bean);
	}

	private static void add() throws Exception {
		UserBean bean = new UserBean();
		bean.setFirstName("aadhar");
		bean.setLastName("patil");
		bean.setLoginId("apatil@gmail.como");
		bean.setDob(new Date());
		bean.setAddress("indore");
		bean.setPassword("123");

		UserModel model = new UserModel();
		model.add(bean);

	}

}
