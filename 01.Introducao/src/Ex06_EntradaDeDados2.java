import java.util.Scanner;

public class Ex06_EntradaDeDados2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//Para ler um texto até a quebra de linhas
		String s1, s2, s3;
		int x;
		
		x = sc.nextInt();
		sc.nextLine();	//Esse nextline() extra serve para consumir a quebra de linha pendente após a atribuição 
		// da variável x
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Dados digitados: ");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		sc.close();
	}

}
