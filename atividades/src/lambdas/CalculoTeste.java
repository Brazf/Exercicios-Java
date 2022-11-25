package lambdas;

public class CalculoTeste {
	public static void main(String[] args) {
		
		System.out.println("VALORES USADOS: 14+15, 14+15, 14*15");

		System.out.println("CLASSE P.O.O");
		
		// PADRÃO USANDO P.O.O
		iCalculo somar = new Soma();
		iCalculo multi = new Multiplicar();
		
		System.out.println(somar.executar(14,15));
		
		
		System.out.println("FUNÇÃO LAMBDA");
		
		// PADRÃO USANDO FUNÇÕES LAMBDAS
		
		// AQUI EU CRIEI UM OBJETO, "QUE NA TEÓRIA DEVERIA TER UMA CLASSE SÓ PRA CRIAR ESSE MÉTODO"
		iCalculo soma = (x, y) -> {
			return x + y; 
		};
		
		System.out.println(soma.executar(14, 15));
		
		System.out.println("FUNÇÃO LAMBDA SUBESCREVIDA");
		
		// EU SUBESCREVEI A FUNÇÃO LAMBDA SAMA CRIADA USANDO A INTERFACE LOGO ACIMA. 
		soma = (x, y) -> {
			return x * y; 
		};
		
		System.out.println(soma.executar(14, 15));
		
		
	}
}
