public class Ex11_FuncoesMatematicas {

	public static void main(String[] args) {

		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		
		//função matemática para raiz quadrada 
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25);
		System.out.println("A raiz quadrada de " + x + " = " + A);
		System.out.println("A raiz quadrada de " + y + " = " + B);
		System.out.println("A raiz quadrada de 25 = " + C);
		System.out.println();
		//função matemática para exponenciação
		A = Math.pow(x, y);
		B = Math.pow(x, 2);
		C = Math.pow(5, 2);
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " elevado ao quadrado = " + B);
		System.out.println("5 elevado ao quadrado = " + C);
		System.out.println();
		//função matemática para valor absoluto
		A = Math.abs(y);
		B = Math.abs(z);
		System.out.println("O valor absoluto de " + y + " = " + A);
		System.out.println("O valor absoluto de " + z + " = " + B);
		
	}

}
