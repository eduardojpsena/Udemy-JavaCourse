package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory);
		
		System.out.println("FOLDERS:");
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		File[] files = path.listFiles(File::isFile);
		
		System.out.println("FILES:");
		for (File file : files) {
			System.out.println(file);
		}
		
		boolean success = new File(strPath + "\\subdir").mkdir();
		System.out.println("Directory created successfully: " + success);		
		
		System.out.println("----------------------------");
		//Caminho completo do arquivo + nome
		System.out.println("getPath: " + path.getPath());
		//Apenas o caminho do arquivo
		System.out.println("getParent: " + path.getParent());
		//Nome do arquivo
		System.out.println("getName: " + path.getName());
		
		sc.close();
		
	}

}
