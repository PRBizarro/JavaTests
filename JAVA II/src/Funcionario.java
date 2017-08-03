abstract class Funcionario {
	private String nome;
	protected double salario;

	//Getters and Setters
	public void setSalario(double salario){
		this.salario = salario;
	}

	public abstract double getBonus();
}

