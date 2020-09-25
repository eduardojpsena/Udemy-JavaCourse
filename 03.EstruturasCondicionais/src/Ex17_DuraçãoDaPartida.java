import java.util.Scanner;

//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
// começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

public class Ex17_DuraçãoDaPartida {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int hora1, hora2, tempo;
		
		System.out.print("Digite a hora inicial do jogo: ");
		hora1 = sc.nextInt();
		System.out.print("Digite a hora final do jogo: ");
		hora2 = sc.nextInt();
		
		if (hora1 < hora2) {
			tempo = Math.abs(hora2 - hora1);
			System.out.printf("O jogo durou %d Hora(s).", tempo);
		}
		else {
			hora2 = hora2 + 24;
			tempo = hora2 - hora1;
			System.out.printf("O jogo durou %d Hora(s).", tempo);
		}
		
		sc.close();
	}
}
