package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import model.entities.Product;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

//		List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList()); //Implementação da interface Function
//
//		List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList()); //reference method com metodo estatico
//		
//		List<String> names = list.stream().map(Product::nomStaticUpperCaseName).collect(Collectors.toList()); //reference method com metodo nao estatico
//		
//		Function<Product, String> func = p -> p.getName().toUpperCase();
//		List<String> names = list.stream().map(func).collect(Collectors.toList()); //Consumer utilizando expressão lambda declarada
		
		List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList()); //Consumer utilizando expressão lambda inline

		names.forEach(System.out::println);
	}

}
