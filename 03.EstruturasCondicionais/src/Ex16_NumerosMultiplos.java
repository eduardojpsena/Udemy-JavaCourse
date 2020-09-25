import java.util.Scanner;

//Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
// Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser 
// digitados em ordem crescente ou decrescente.

public class Ex16_NumerosMultiplos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.print("Digite o primeiro número: ");
		num1 = sc.nextInt();
		System.out.print("Digite o segundo número: ");
		num2 = sc.nextInt();
		
		if (num1 % num2 == 0 || num2 % num1 == 0) {
			System.out.printf("Os números %d e %d SÃO MULTIPLOS.", num1, num2);
		}
		else {
			System.out.printf("Os números %d e %d NÃO SÃO MULTIPLOS.", num1, num2);
		}
		
		sc.close();
	}
}
