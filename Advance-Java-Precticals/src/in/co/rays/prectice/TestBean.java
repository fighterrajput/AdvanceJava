package in.co.rays.prectice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import in.co.rays.user.UserBean;
import in.co.rays.user.UserModel;

public class TestBean {
	public static void main(String[] args) throws Exception {
		// search();
		searchDynamic();
	}

	private static void searchDynamic() throws Exception {
		UserBean bean = new UserBean();
		bean.setFirstName("a");

		BeanModel model = new BeanModel();
		List list = model.searchDynamic(bean, 1, 3);

		Iterator it = list.iterator();

		while (it.hasNext()) {
			bean = (UserBean) it.next();
			System.out.println(bean.getId());
			System.out.println(bean.getFirstName());
			System.out.println(bean.getLastName());
			System.out.println(bean.getLoginId());
			System.out.println(bean.getPassword());
			System.out.println(bean.getDob());
			System.out.println(bean.getAddress());
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

}