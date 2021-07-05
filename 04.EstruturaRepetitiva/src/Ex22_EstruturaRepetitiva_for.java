import java.util.Scanner;

public class Ex22_EstruturaRepetitiva_for {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o numero de repetições: ");
		int n = sc.nextInt();
		int soma = 0;
		
		for (int i = 0; i < n; i++) {
			System.out.print("digite um valor: ");
			int x = sc.nextInt();
			soma += x;
		}
		
		System.out.println("valor da soma é: " + soma);
		sc.close();
	}

}
