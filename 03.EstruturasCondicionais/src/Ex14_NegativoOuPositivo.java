import java.util.Scanner;

//Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero � negativo ou n�o.

public class Ex14_NegativoOuPositivo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.print("Digite um n�mero inteiro: ");
		num = sc.nextInt();
		
		if (num > 0) {
			System.out.printf("O n�mero %d � POSITIVO.", num);
		}
		else if (num <0) {
			System.out.printf("O n�mero %d � NEGATIVO.", num);
		}
		else {
			System.out.println("O n�mero digitado � ZERO.");
		}
		
		sc.close();
	}
}
