package questoes_logica;

import java.util.Scanner;

public class Questao9 {
	
	/*
 9 – Em uma pesquisa realizada pela Sony, os jogos para PlayStation que tiveram maior volume 
de vendas para o foram: Metal Gear Solid, Driver, Crash Bandicoot, Crash Bandicoot, Warped, 
Tekken 3, Crash Bandicoot, Cortex Strikes Back, Final Fantasy VIII, Gran Turismo 2, Final 
Fantasy VII e Gran Turismo. No entanto, essa pesquisa não chegou aos estudantes do primeiro 
período de engenharia do IFPE campus Belo jardim. Vamos corrigir isso? Faça um programa 
que possa pesquisar, entre os jogos citados, qual é o favorito da turma. Lembrando que essa 
turma é composta por 35 alunos
	 */

	public static void main(String[] args) {
		
		int MetalGearSolid = 0;
		int Driver = 0;
		int CrachBandicoot = 0;
		int Warped = 0;
		int Tekken = 0;
		int CortexStrikeBack = 0;
		int FinalFantasy8 = 0;
		int GranTurismo2 = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Escolha um dos jogos Disponíveis: \n Metal Gear Solid: [1] \n Driver: [2] \n Crash Bandicoot: [3] \n Warped: [4] \n Tekken 3: [5] \n Cortex Strikes Back: [6] \n Final Fantasy VIII: [7] \n Gran Turismo 2: [8] \n");
		for (int i = 0; i < 3; i++) {
			System.out.println("Digite o número correspondente ao seu jogo favorito:");
			int escolha = input.nextInt();
			
			switch (escolha) {
			case 1:
				MetalGearSolid++;
				break;
			
			case 2:
				Driver++;
				break;
			
			case 3:
				CrachBandicoot++;
				break;
				
			case 4:
				Warped++;
				break;
				
			case 5:
				Tekken++;
				break;
				
			case 6:
				CortexStrikeBack++;
				break;
				
			case 7:
				FinalFantasy8++;
				break;
				
			case 8:
				GranTurismo2++;
				break;
			default:
				System.out.print("Opção Errada");
				break;
			}
		}
		
		if((MetalGearSolid > Driver) && (MetalGearSolid > CrachBandicoot) && (MetalGearSolid > Warped) && 
				(MetalGearSolid > Tekken) && (MetalGearSolid > CortexStrikeBack) && (MetalGearSolid > FinalFantasy8) && (MetalGearSolid > GranTurismo2)) {
			System.out.println("Metal Gear Solid, Campeão");
		}
		else {
			System.out.println("Outro jogo ganhou!");
		}
		
		
	}
}
