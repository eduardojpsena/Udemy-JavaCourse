package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {

		String[]  lines = new String[] {"Good morning!", "Good afternoon!", "Good night!"};
		
		String path = "D:\\EscritaTeste.txt";
		
		//BufferedWriter bw = new BufferedWriter(new FileWriter(path)) → recria o arquivo com os dados escritos
		//BufferedWriter bw = new BufferedWriter(new FileWriter(path, true)) → acrescenta novas linhas no arquivo sem recria-lo
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
			
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
}