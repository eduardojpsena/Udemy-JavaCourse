import java.util.Scanner;

//Fa�a um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses n�meros com uma
//mensagem explicativa, conforme exemplos

public class Ex09_Soma {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x, y, resultado;
		
		System.out.printf("Digite o primeiro valor: ");
		x = sc.nextInt();
		System.out.printf("%nDigite o segundo valor: ");
		y = sc.nextInt();
		resultado = x + y;
		System.out.printf("%n%d + %d = %d", x, y, resultado);
		
		sc.close();
	}

}
