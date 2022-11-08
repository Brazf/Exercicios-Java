package lambdas;

public class CalculoTeste {
	public static void main(String[] args) {
		
		iCalculo somar = new Soma();
		iCalculo multi = new Multiplicar();
		
		System.out.println(somar.executar(10,20)-multi.executar(2, 4));
	}
}
