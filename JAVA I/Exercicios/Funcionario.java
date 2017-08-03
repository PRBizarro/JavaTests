class Funcionario {
    private String nome;
    private double salario;
    private String departamento;
    private String dataEntrada;
    private String rg;
    private int identificador;

    private static int proximoFuncionario = 0;





    //Construtores

    public Funcionario(String nome){
        this.nome = nome;
        this.identificador = ++proximoFuncionario;
    }

    Funcionario(){ }




    // Getters and Setters 

    public int getIdentificador(){
        return this.identificador;
    }

    public double getSalario(){
        return this.salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getDepartamento(){
        return this.departamento;
    }

    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }

    public String getRg(){
        return this.rg;
    }

    public void setRg(String rg){
        this.rg = rg;
    }

    public String getdataEntrada(){
        return this.dataEntrada;
    }

    public void setDataEntrada(String data){
        this.dataEntrada = data;
    }






    // Metodos
    
    public void recebeAumento(double aumento){

    }

    public double calculaGanhoAnual(){
        return this.salario + 12;
    }

    public void mostra(){

    }
}