package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import model.entities.Product;
import util.PriceUpdate;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		
//		list.forEach(new PriceUpdate()); //Implementação da interface Consumer
//		
//		list.forEach(Product::staticPriceUpdate); //reference method com metodo estatico
//		
//		list.forEach(Product::nomStaticPriceUpdate); //reference method com metodo nao estatico
		
		Consumer<Product> cons = p -> {
			p.setPrice(p.getPrice() * 1.1);
		};
		list.forEach(cons); //Consumer utilizando expressão lambda declarada
		

		list.forEach(System.out::println);
	}

}
