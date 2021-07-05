import java.util.Scanner;

public class Ex20_EstruturaRepetitiva_while {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		int x = sc.nextInt();
		
		while (x !=0) {
			System.out.print("Digite um valor: ");
			x = sc.nextInt();
		}
		
		System.out.println("Programa finalizado");
		
		sc.close();
	}

}
