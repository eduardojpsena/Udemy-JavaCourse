import java.util.Scanner;

// Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas trabalhadas, o valor que recebe por
//hora e calcula o sal�rio desse funcion�rio. A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas casas
//decimais.
public class Ex07_ProcessamentoDeDados2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num, horas;
		double valorhora, salario;
		
		System.out.print("Informe o n�mero de ID do funcion�rio: ");
		num = sc.nextInt();
		System.out.print("Informe a quantidade de horas trabalhadas: ");
		horas = sc.nextInt();
		System.out.print("Informe o valor de cada hora trabalhada: U$ ");
		valorhora = sc.nextDouble();
		
		salario = horas * valorhora;
		
		System.out.printf("\nNUMBER: %d", num);
		System.out.printf("\nSALARY: U$ %.2f", salario);
		
		sc.close();
	}

}
