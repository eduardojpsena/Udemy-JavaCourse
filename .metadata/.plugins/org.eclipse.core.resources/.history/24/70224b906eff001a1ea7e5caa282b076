import java.util.Locale;
import java.util.Scanner;

//Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida,
// calcule e mostre:
//a) a área do triângulo retângulo que tem A por base e C por altura.
//b) a área do círculo de raio C. (pi = 3.14159)
//c) a área do trapézio que tem A e B por bases e C por altura.
//d) a área do quadrado que tem lado B.
//e) a área do retângulo que tem lados A e B.

public class Ex12_CalculoDeAreas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		double A, B, C, pi = 3.14159; 
		double triag, circ, trap, quad, ret;
		
		System.out.print("Digite o valor do ponto A: ");
		A = sc.nextDouble();
		System.out.print("Digite o valor do ponto B: ");
		B = sc.nextDouble();
		System.out.print("Digite o valor do ponto C: ");
		C = sc.nextDouble();

		triag = (A * C) / 2;
		circ = pi * Math.pow(C, 2);
		trap = ((A + B) * C) / 2;
		quad = Math.pow(B, 2);
		ret = A * B;
		
		System.out.printf("\nÁREA TRIÂNGULO: %.3f%n", triag);
		System.out.printf("ÁREA CIRCULO: %.3f%n", circ);
		System.out.printf("ÁREA TRAPÉZIO: %.3f%n", trap);
		System.out.printf("ÁREA QUADRADO: %.3f%n", quad);
		System.out.printf("ÁREA RETÂNGULO: %.3f%n", ret);
		
		sc.close();
	}

}
