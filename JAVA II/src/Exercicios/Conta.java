package Exercicios;

public abstract class Conta{
	protected double saldo;

	//Getters and Setters
	public double getSaldo(){
		return this.saldo;
	}

	//Metodos
	public void deposita(double valor){
		this.saldo += valor;
	}

	public void saca(double valor){
		this.saldo -= valor;
	}

	public abstract void atualiza(double taxa);
}