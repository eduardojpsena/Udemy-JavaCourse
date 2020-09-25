import javax.swing.JOptionPane;

public class Ex19_NumeroNoIntervalo {

	public static void main(String[] args) {
		
		String num_string = JOptionPane.showInputDialog("•Digite um valor•");
		float num = Float.parseFloat(num_string);
		
		if (num >= 0 && num <= 25) {
			JOptionPane.showMessageDialog(null, "O número encontra-se no intervalo [0 - 25]");
		} else if (num > 25 && num <= 50) {
			JOptionPane.showMessageDialog(null, "O número encontra-se no intervalo [25 - 50]");
		} else if (num > 50 && num <= 75) {
			JOptionPane.showMessageDialog(null, "O número encontra-se no intervalo [50 - 75]");
		} else if (num > 75 && num <= 100) {
			JOptionPane.showMessageDialog(null, "O número encontra-se no intervalo [75 - 100]");
		} else {
			JOptionPane.showMessageDialog(null, "O número encontra-se fora do intervalo [0 - 100]");
		}
	}
}
