package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> list = new ArrayList<Shape>();
		
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("\nShape #" + i + " data:");
			System.out.print("Rectangle or Circle? [r/c]: ");
			char out = sc.next().toLowerCase().charAt(0);
			
			System.out.print("Color [BLACK/RED/BLUE]: ");
			sc.nextLine();
			Color color = Color.valueOf(sc.nextLine().toUpperCase());
			
			if (out == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				list.add(new Rectangle(color, width, height));
				
			} else {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				list.add(new Circle(color, radius));
				
			}
		}
		
		
		System.out.println("\nSHAPE AREAS: ");
		for (Shape s : list) {
			System.out.println(String.format("%.2f", s.area()));
		}
		
		
		sc.close();
	}

}
