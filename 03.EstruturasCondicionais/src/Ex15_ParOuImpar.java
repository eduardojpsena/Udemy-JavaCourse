import java.util.Scanner;

//Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou �mpar.

public class Ex15_ParOuImpar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.print("Digite um n�mero inteiro: ");
		num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.printf("O n�mero %d e PAR.", num);
		}
		else {
			System.out.printf("O n�mero %d � IMPAR.", num);
		}
		
		sc.close();
	}
}
