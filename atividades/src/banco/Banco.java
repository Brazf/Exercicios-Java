package banco;

public class Banco {
	public static void main(String[] args) {
		
		iConta clPoupanca = new ContaPoupanca("1", "Fábio", "12345");
		iConta clCorrente = new ContaCorrente("2", "João", "56789");
		
		System.out.println("Conta Poupança");
		System.out.println(clPoupanca);
		clPoupanca.depositarDinheiro(1500);
		System.out.println("Saldo conta poupança"+ clPoupanca.getSaldo());
		
		System.out.println();
		
		System.out.println("Conta Corrente");
		System.out.println(clCorrente);
		clCorrente.depositarDinheiro(1500);
		System.out.println("Saldo conta corrente"+ clCorrente.getSaldo());
		
		System.out.println();
		
		System.out.println("Transferência de valor entre contas:");
		
		clPoupanca.transferirDinheiro(clCorrente, 100);
		System.out.println("Saldo conta poupança: "+ clPoupanca.getSaldo());
		System.out.println("Saldo conta corrente: "+ clCorrente.getSaldo());
		
	}
}
