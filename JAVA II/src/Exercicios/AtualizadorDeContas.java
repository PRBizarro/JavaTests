package Exercicios;

class AtualizadorDeContas {
	private double saldototal = 0;
	private double selic;

	// Construtores
	public AtualizadorDeContas(double selic){
		this.selic = selic;
	}

	//Getter and setters
	public double getSaldoTotal(){
		return this.saldototal;
	}

	//Metodos
	public void roda(Conta c){
		System.out.println("==================================="); 
		System.out.println("Saldo anterior:" + c.getSaldo());
		c.atualiza(this.selic);
		System.out.println("Saldo final:" + c.getSaldo());
		saldototal += c.getSaldo();
	}
}
