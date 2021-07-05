import java.util.Scanner;

public class Ex23_EstruturaRepetitiva_doWhile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		char resp;
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			double C = sc.nextDouble();
			double F = 9.0 * C / 5.0 + 32;
			System.out.printf("A temperatura em Fahrenheit é %.1f%n", F);
			System.out.print("deseja continuar? [s/n]: ");
			resp = sc.next().charAt(0);
		} while (resp != 'n');
		
		sc.close();
	}
}
