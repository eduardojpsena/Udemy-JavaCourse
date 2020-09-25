import java.util.Locale;
import java.util.Scanner;

public class Ex05_EntradaDeDados {

	public static void main(String[] args) {

		//Para fazer entrada de dados em java, primeiro � necess�rio importar o java.util.Scanner, criar um
		// objeto do tipo Scanner e declarar uma variavel atribuida a esse objeto em seguida do comando
		// de input "new Scaner(System.in) para associar o objeto ao teclado no modo console.
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Para ler uma palavra(texto sem espa�o)
		String x;
		x = sc.next();
		System.out.println("Voc� digitou: " + x);
		
		//Para ler um n�mero inteiro
		int y;
		y = sc.nextInt();
		System.out.printf("Voc� digitou: %d%n", y);
		
		//Para ler um n�mero flutuante
		double z;
		z = sc.nextDouble();
		System.out.printf("Voc� digitou: %.2f%n", z);
		
		//Para ler um caractere
		char w;
		w = sc.next().charAt(0);	//o 0 � para pegar apenas o primeiro caracter da string digitada
		System.out.println("Voc� digitou: " + w);

		//Para ler varios dados da mesma linha
		String a;
		int b;
		double c;
		a = sc.next();
		b = sc.nextInt();
		c = sc.nextDouble();
		System.out.println("Dados digitados:");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		sc.close(); //deve ser escrito essa linha de c�digo para encerrar o recurso de entrada de dados
	}

}
