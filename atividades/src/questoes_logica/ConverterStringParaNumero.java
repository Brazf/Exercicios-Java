package questoes_logica;

import javax.swing.JOptionPane;

public class ConverterStringParaNumero {

	public static void main(String[] args) {
		
		String valor1 = JOptionPane.showInputDialog( "Digite o primeiro número: ");

		String valor2 = JOptionPane.showInputDialog( "Digite o segundo número: ");
		
		System.out.println(valor1+valor2);
		
		System.out.println();
		
		double num1 = Double.parseDouble(valor1);

		double num2 = Double.parseDouble(valor2);
		
		System.out.println(num1+num2);
	}
}
