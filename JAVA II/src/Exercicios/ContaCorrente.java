package Exercicios;

class ContaCorrente extends Conta{

	//Metodos
	public void atualiza(double taxa){
		this.saldo += this.saldo * taxa * 2;
	}
}

