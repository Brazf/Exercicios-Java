package questoes_logica;

import java.util.Scanner;

public class Questao4 {
	
	public static void main(String[] args) {
		
		/*
		4 – Faça um programa que:
		• Leia o nome, a idade e o sexo de N pessoas
		• Escreva o nome da mulher mais velha
		• Escreva a idade do homem mais novo
		Obs: Crie um flag de parada. 
		*/
		
		int cont = 1;
		int idade_velha = 0;
		String nome_velha = "";
		int idade_novo = 100;
		String nome_novo = "";

		
		while(cont == 1) {
			
			Scanner input = new Scanner(System.in);
			System.out.println("Digite seu nome:");
			String nome = input.next();
			System.out.println("Digite sua idade:");
			int idade = input.nextInt();
			System.out.println("Digite seu sexo (M ou F):");
			String sexo = input.next();
			System.out.println("Para parar digite 000");
			cont = input.nextInt();
			
			if(idade > idade_velha) {
				idade_velha = idade;
				nome_velha = nome;
			}
			
			if(idade < idade_novo) {
				idade_novo = idade;
				nome_novo = nome;
			}
			
		}
		
		System.out.println("Nome da pessoa mais velha:" + nome_velha + " Idade: " + idade_velha);

		System.out.println("Nome da pessoa mais novo:" + nome_novo + " Idade: " + idade_novo);
		
	}
}
