
class TestaFuncionario{
	public static void main(String[] args){

		Gerente joaquim = new Gerente();
		joaquim.setSalario(2000.0);
		System.out.println(joaquim.getBonus());

		TotalizadorDeBonus totalizador = new TotalizadorDeBonus();
		totalizador.adiciona(joaquim);
		joaquim.cobraEntrega();

		System.out.println("Total:" + totalizador.getTotal());
	}
}