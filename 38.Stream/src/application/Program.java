package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import model.entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD", 80.90));
		list.add(new Product("Computer", 850.00));
		list.add(new Product("Monitor", 290.00));
		System.out.println("Products: " + Arrays.toString(list.toArray()));
		
		double avg = list.stream()
						.map(p -> p.getPrice())                 //mapeamento da lista por determinado parametro
						.reduce(0.0, (x,y) -> x + y) / list.size();  //realiza uma determinada operação com os valores mapeados
		System.out.println("\nAverage price: R$" + String.format("%.2f", avg));
		
		Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
		
		List<String> names = list.stream()
								.filter(p -> p.getPrice() < avg)
								.map(p -> p.getName())
								.sorted(comp.reversed())
								.collect(Collectors.toList());
		System.out.println("\n- Products below the average price -");
		names.forEach(System.out::println);
	}		
}
