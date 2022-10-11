package banco;

public class Cliente extends Pessoa {
	private int nrConta;
	private double saldo;
	
	public int getNrConta() {
		return nrConta;
	}
	public void setNrConta(int nrConta) {
		this.nrConta = nrConta;
	}
	
	public void sacar(double valor) {
		if(valor <= this.saldo) {
			this.saldo -= valor;
		}
	}
	
	public void depositar(double valor) {
		this.saldo += valor; 
	}
	
	public double mostarSaldo() {
		return this.saldo;
	}
	
}
