package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao dao = DaoFactory.createDepartmentDao();
		
		System.out.println("\n=== TEST department insert =======");
		Department newDepartment = new Department(null, "Music");
		dao.insert(newDepartment);
		System.out.println("Inserted! New id: " + newDepartment.getId());
		
		System.out.println("\n=== TEST department findById =======");
		Department dep = dao.findById(1);
		System.out.println(dep);
		
		System.out.println("\n=== TEST department update =======");
		Department dep2 = dao.findById(1);
		dep2.setName("Food");
		dao.update(dep2);
		System.out.println("Update completed");
		
		System.out.println("\n=== TEST department findAll =======");
		List<Department> list = dao.findAll();
		for (Department d : list) {
			System.out.println(d);
		}
		
		System.out.println("\n=== TEST department delete =======");
		dao.deleteById(7);
		System.out.println("Delete completed");
	}

}
