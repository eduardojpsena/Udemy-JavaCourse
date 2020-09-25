import java.util.Scanner;

//Fazer um programa para ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, o valor unit�rio de cada pe�a 1,
// o c�digo de uma pe�a 2, o n�mero de pe�as 2 e o valor unit�rio de cada pe�a 2. Calcule e mostre o valor
// a ser pago.

public class Ex08_ProcessamentoDeDados3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int cod1, cod2, quant1, quant2;
		double valor1, valor2, valortotal;
		
		System.out.print("Digite o c�digo do produto 1: ");
		cod1 = sc.nextInt();
		System.out.print("Digite a quantidade de itens do produto 1: ");
		quant1 = sc.nextInt();
		System.out.print("Digite o valor unit�rio do produto 1: R$ ");
		valor1 = sc.nextDouble();
		
		System.out.printf("\nDigite o c�digo do produto 2: ");
		cod2 = sc.nextInt();
		System.out.print("Digite a quantidade de itens do produto 2: ");
		quant2 = sc.nextInt();
		System.out.print("Digite o valor unit�rio do produto 2: R$ ");
		valor2 = sc.nextDouble();
		
		valortotal = (quant1 * valor1) + (quant2 * valor2);
		System.out.printf("\n--Resumo da compra--\n");
		System.out.println("Produtos: " + cod1 + ", " + cod2);
		System.out.printf("VALOR TOTAL: R$ %.2f", valortotal);
		
		sc.close();
	}

}
