import java.util.Locale;

public class Ex02_PrintVariaveis {

	public static void main(String[] args) {
		
		int y = 32;
		double x = 10.35652;
		
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		//Configurando a localiza��o para mudar de virgula para ponto
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n", x);
		//Concatenando elementos
		System.out.println("Resultado = " + x + " metros");
		System.out.printf("Resultado = %.2f metros\n", x);
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e recebe R$ %.2f reais por m�s.%n", nome, idade, renda);
		//%s para formatar texto, %d para n�meros inteiros, %f para n�meros flutuantes, %n quebra de linha
	}

}

//printf � utilizado para formatar a vari�vel, %.2f para formatar para 2 casas decimais 
// e %n ou \n para realizar a quebra de linha no ponto indicado.
//Locale � usado para que o programa possa reconhecer o idioma para a localiza��o escolhida e dessa forma
// poder atribuir um "ponto" no lugar da "virgula" quando realizar o printf.