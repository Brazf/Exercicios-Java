package questoes_logica;

import java.util.Scanner;

public class ExercicioConversao {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Primeiro Salario:");
		String salario1 = input.nextLine().replace(",", ".");
		System.out.println("Segundo Salario:");
		String salario2 = input.nextLine().replace(",", ".");
		System.out.println("Terceiro Salario:");
		String salario3 = input.nextLine().replace(",", ".");
		
		
		double sal1 = Double.parseDouble(salario1);
		double sal2 = Double.parseDouble(salario2);
		double sal3 = Double.parseDouble(salario3);
		
		double mediaSalarios = (sal1+sal2+sal3)/3;
		
		System.out.println("Média Salarial:" + mediaSalarios);
	}
}
