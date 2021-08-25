package application;

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
		
	}

}
