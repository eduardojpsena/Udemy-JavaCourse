package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Enter product data");
		System.out.print("Name: ");
		product.setName(sc.nextLine());
		System.out.print("Price: ");
		product.setPrice(sc.nextDouble());
		System.out.print("Quantity in stock: ");
		product.setQuantity(sc.nextInt());
		
		System.out.println(product);
		
		sc.close();
	}

}
