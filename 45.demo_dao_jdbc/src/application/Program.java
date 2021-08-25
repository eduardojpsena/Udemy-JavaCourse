package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao dao = DaoFactory.createSellerDao();
		
		
		System.out.println("\n== Seller findById ==");
		Seller seller = dao.findById(2);
		
		System.out.println(seller);
		
		System.out.println("\n== Seller findByIdDepartment ==");
		Department dep = new Department(3, null);
		List<Seller> list = dao.findbyDepartment(dep);
		for (Seller s : list) {
			System.out.println(s);
		}
		
		System.out.println("\n== Seller findAll ==");
		list = dao.findAll();
		for (Seller s : list) {
			System.out.println(s);
		}
		
		System.out.println("\n== Seller insert ==");
		Seller newSeller = new Seller(null, "Carol Sun", "carol@gmail.com", new Date(), 4200.00, dep);
		dao.insert(newSeller);
		System.out.println("Inserted - new id: " + newSeller.getId());
		
		System.out.println("\n== Seller update ==");
		seller = dao.findById(1);
		seller.setBaseSalary(10000.00);
		dao.update(seller);
		System.out.println("Update completed");
		
		System.out.println("\n== Seller delete ==");
		dao.deleteById(10);
		System.out.println("Delete completed");
	}

}
