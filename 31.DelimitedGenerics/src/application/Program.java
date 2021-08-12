package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import model.entities.Product;
import model.services.CalculationService;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();

		
		list.add(new Product("Computer", 890.50));
		list.add(new Product("IPhone", 910.00));
		list.add(new Product("Tablet", 550.00));
				
			
		Product x = CalculationService.max(list);
		System.out.println("Most expensive:");
		System.out.println(x);

		
	}

}
