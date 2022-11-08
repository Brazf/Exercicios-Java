package banco;

public interface iConta {
	
	void transferirDinheiro(iConta conta, double valor);
	double getSaldo();
	void sacarDinheiro(double valor);
	void depositarDinheiro(double valor);
	void ativarConta();
	void desativarConta();
}
