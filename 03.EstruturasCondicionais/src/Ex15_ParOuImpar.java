import java.util.Scanner;

//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

public class Ex15_ParOuImpar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.print("Digite um número inteiro: ");
		num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.printf("O número %d e PAR.", num);
		}
		else {
			System.out.printf("O número %d é IMPAR.", num);
		}
		
		sc.close();
	}
}
