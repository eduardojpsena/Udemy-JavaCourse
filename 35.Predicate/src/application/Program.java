package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import model.entities.Product;
import util.ProductPredicate;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

//		list.removeIf(new ProductPredicate()); //Implementação da interface Predicate
//		
//		list.removeIf(Product::staticProductPredicate); //reference method com metodo estatico
//		
//		list.removeIf(Product::nomStaticProductPredicate); //reference method com metodo não estatico
//		
//		Predicate<Product> pred = p -> p.getPrice() >= 100.0;
//		list.removeIf(pred);                              //Predicate utilizando expressão lambda declarada
		
		
		list.removeIf(p -> p.getPrice() >= 100.0);        //Predicate utilizando expressão lambda inline

		for (Product p : list) {
			System.out.println(p);
		}
	}

}
