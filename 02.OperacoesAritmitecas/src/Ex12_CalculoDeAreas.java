import java.util.Locale;
import java.util.Scanner;

//Fazer um programa que leia tr�s valores com ponto flutuante de dupla precis�o: A, B e C. Em seguida,
// calcule e mostre:
//a) a �rea do tri�ngulo ret�ngulo que tem A por base e C por altura.
//b) a �rea do c�rculo de raio C. (pi = 3.14159)
//c) a �rea do trap�zio que tem A e B por bases e C por altura.
//d) a �rea do quadrado que tem lado B.
//e) a �rea do ret�ngulo que tem lados A e B.

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
		
		System.out.printf("\n�REA TRI�NGULO: %.3f%n", triag);
		System.out.printf("�REA CIRCULO: %.3f%n", circ);
		System.out.printf("�REA TRAP�ZIO: %.3f%n", trap);
		System.out.printf("�REA QUADRADO: %.3f%n", quad);
		System.out.printf("�REA RET�NGULO: %.3f%n", ret);
		
		sc.close();
	}

}
