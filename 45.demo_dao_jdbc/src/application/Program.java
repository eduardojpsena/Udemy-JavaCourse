package application;

import java.sql.Connection;

import db.DB;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.dao.impl.SellerDaoJDBC;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao dao = DaoFactory.createSellerDao();
		
		Seller seller = dao.findById(3);
		
		System.out.println(seller);
		
	}

}
