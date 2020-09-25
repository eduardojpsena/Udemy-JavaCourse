import java.util.Scanner;

//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

public class Ex14_NegativoOuPositivo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.print("Digite um número inteiro: ");
		num = sc.nextInt();
		
		if (num > 0) {
			System.out.printf("O número %d é POSITIVO.", num);
		}
		else if (num <0) {
			System.out.printf("O número %d é NEGATIVO.", num);
		}
		else {
			System.out.println("O número digitado é ZERO.");
		}
		
		sc.close();
	}
}
