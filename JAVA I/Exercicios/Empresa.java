class Empresa {
        private String nome;
        Funcionario[] empregados;
        private String cnpj;
        int tamanhoArray;
        int livre = 0;  


        //Getters and Setters

        public String getNome(){
            return this.nome;
        }

        public void setNome(String nome){
            this.nome = nome;
        }

        public String getcnpj(){
            return this.cnpj;
        }

        public void setcnpj(String cnpj){
            this.cnpj = cnpj;
        }

        public Funcionario getFuncionario(int posicao){
            return this.empregados[posicao];
        }






        // Métodos

        void adicionar(Funcionario f){
            this.empregados[this.livre] = f;
            this.livre++;
        }

        void mostraEmpregados(){
            for(int i = 0; i < this.livre; i++){
                System.out.println("Funcionario:" + i);
                System.out.println("Salario:" + this.empregados[i].getSalario());
            }
        }

        void mostraTodasAsInformacoes(){
            for(int i = 0; i < this.livre; i++){
                System.out.println("Nome:" + this.empregados[i].getNome() + "Salario:" + this.empregados[i].getSalario());
            }
        }

        boolean contem(Funcionario f) {
            for (int i = 0; i < this.livre; i++) {
                if (f == this.empregados[i]) {
                    return true;
                }
            }
            return false;
        }
}