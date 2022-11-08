package banco;

import java.util.Objects;

public class ContaCorrente implements iConta{

	String numConta;
	String nome;
	String cpf;
	double saldo;
	boolean status;
	
	public ContaCorrente(String conta, String nome, String cpf) {
		this.saldo = 0;
		this.cpf = cpf;
		this.nome = nome;
		this.numConta = conta;
		this.status = true;
	}
	@Override
	public void transferirDinheiro(iConta conta, double valor) {
		if (conta instanceof ContaCorrente) {
			ContaCorrente corrente = (ContaCorrente) conta;
			this.saldo -= valor;
			corrente.saldo += valor;
		}
		else {
			ContaPoupanca poupanca = (ContaPoupanca) conta;
			this.saldo -= valor;
			poupanca.saldo += valor;
		}
	}

	@Override
	public double getSaldo() {
		return this.saldo;
	}

	@Override
	public void sacarDinheiro(double valor) {
		// TODO Auto-generated method stub
		if(this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("Saque realizado!");
		}else {
			System.out.println("Saque não realizado!");
		}
	}

	@Override
	public void depositarDinheiro(double valor) {
		this.saldo += valor;
		System.out.println("Valor de deposito:" + valor);
	}
	
	@Override
	public void ativarConta() {
		this.status = true;
	}

	@Override
	public void desativarConta() {
		this.status = false;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cpf);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContaCorrente other = (ContaCorrente) obj;
		return Objects.equals(cpf, other.cpf);
	}
	@Override
	public String toString() {
		return "ContaCorrente [numConta=" + numConta + ", nome=" + nome + ", cpf=" + cpf + ", saldo=" + saldo
				+ ", status=" + status + "]";
	}
	
	
}
