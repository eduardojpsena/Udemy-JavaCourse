import java.util.Scanner;

/*Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.*/

public class Ex18_PagarConta {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int opcao;
		float total = 0;
		
		sb.append("[1] Cachorro quente \n");
		sb.append("[2] X-Salada \n");
		sb.append("[3] X-Bacon \n");
		sb.append("[4] Torrada simples \n");
		sb.append("[5] Refrigerante \n");
		sb.append("Selecione a opção: ");
		
		System.out.print(sb.toString());
		opcao = sc.nextInt();
		
		if (opcao == 1) {
			System.out.print("Informe a quantidade [Cachorro quente]: ");
			total = sc.nextFloat() * 4f;
		} else if (opcao == 2 ) {
			System.out.print("Informe a quantidade de [X-Salada]: ");
			total = sc.nextFloat() * 4.5f;
		} else if (opcao == 3) {
			System.out.print("Informe a quantidade [X-Bacon]: ");
			total = sc.nextFloat() * 5f;
		} else if (opcao == 4) {
			System.out.print("Informe a quantidade [Torrada simples]: ");
			total = sc.nextFloat() * 2f;
		} else if (opcao == 5) {
			System.out.print("Informe a quantidade [Refrigerante]: ");
			total = sc.nextFloat() * 1.5f;
		} else {
			System.out.println("Opção inválida.");
		}
		
		System.out.printf("Total: R$ %.2f", total);
		
		sc.close();
	}
}
