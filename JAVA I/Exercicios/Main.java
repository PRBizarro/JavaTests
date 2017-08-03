class TestaEmpresa{
      public static void main(String[] args) {
            Empresa empresa1 = new Empresa();
            empresa1.empregados = new Funcionario[10];
            
            Funcionario f1 = new Funcionario();
            f1.setSalario(1000);
            f1.setNome("Marcio");
            empresa1.adicionar(f1);

            Funcionario f2 = new Funcionario();
            f2.setSalario(2000);
            f2.setNome("Pedro");
            empresa1.adicionar(f2);
           
            empresa1.mostraEmpregados();
            empresa1.mostraTodasAsInformacoes();

     }
}