package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao dao = DaoFactory.createSellerDao();
		
		
		System.out.println("\n== Seller teste findById ==");
		Seller seller = dao.findById(2);
		
		System.out.println(seller);
		
		System.out.println("\n== Seller teste findByIdDepartment ==");
		Department dep = new Department(1, null);
		List<Seller> list = dao.findbyDepartment(dep);
		for (Seller s : list) {
			System.out.println(s);
		}
		
		System.out.println("\n== Seller teste findAll ==");
		list = dao.findAll();
		for (Seller s : list) {
			System.out.println(s);
		}
	}

}
