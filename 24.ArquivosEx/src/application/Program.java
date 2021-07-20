package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<Product>();
		
		System.out.print("Enter file path: ");
		String sourceFileStr = sc.nextLine(); //Caminho + nome do arquivo em string
		
		File sourceFile = new File(sourceFileStr);
		String sourceFolderStr = sourceFile.getParent(); //Caminho do arquiv em string
		
		boolean success = new File(sourceFolderStr + "\\out").mkdir(); //Cria uma pasta com nome out dentro da pasta do arquivo
		
		String targetFileStr = sourceFolderStr + "\\out\\summary.csv"; //Nome do arquivo csv que será criado com as saídas
		
		try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))){
			
			String itemCsv = br.readLine();
			while(itemCsv != null) {
				
				String[] fields = itemCsv.split(",");
				String name = fields[0];
				double price = Double.parseDouble(fields[1]);
				int quantity = Integer.parseInt(fields[2]);
				
				list.add(new Product(name, price, quantity));
				
				itemCsv = br.readLine();
				
			}
			
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))){
				
				for (Product product : list) {
					bw.write(product.getName() + "," + product.total());
					bw.newLine();
				}
				
				System.out.println(targetFileStr + " CREATED!");
				
			} catch (IOException e) {
				System.out.println("Error writing file: " + e.getLocalizedMessage());
			}
		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}
	
		sc.close();
	}

}
