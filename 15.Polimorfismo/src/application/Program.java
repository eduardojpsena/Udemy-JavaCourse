package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		List<Employee> list = new ArrayList<Employee>();
 		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("\nEmployee #" + i + " data:");
			System.out.print("Outsoursed employee? [y/n]: ");
			char out = sc.next().toLowerCase().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hour = sc.nextInt();
			System.out.print("Value Per Hour: ");
			double valuePerHour = sc.nextDouble();
			
			if (out == 'y') {
				System.out.print("Additional charge: ");
				double addCharge = sc.nextDouble();
				list.add(new OutsourcedEmployee(name, hour, valuePerHour, addCharge));
			} else {
				list.add(new Employee(name, hour, valuePerHour));
			}
			
		}
		
		System.out.println("\nPAYMENTS: ");
		for (Employee e : list) {
			System.out.printf(e.getName() + " - $ %.2f%n", e.payment());
		}
		
		
		sc.close();

	}

}
