import java.util.Scanner;

//Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
// Multiplos", indicando se os valores lidos s�o m�ltiplos entre si. Aten��o: os n�meros devem poder ser 
// digitados em ordem crescente ou decrescente.

public class Ex16_NumerosMultiplos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.print("Digite o primeiro n�mero: ");
		num1 = sc.nextInt();
		System.out.print("Digite o segundo n�mero: ");
		num2 = sc.nextInt();
		
		if (num1 % num2 == 0 || num2 % num1 == 0) {
			System.out.printf("Os n�meros %d e %d S�O MULTIPLOS.", num1, num2);
		}
		else {
			System.out.printf("Os n�meros %d e %d N�O S�O MULTIPLOS.", num1, num2);
		}
		
		sc.close();
	}
}
