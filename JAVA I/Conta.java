class Conta {
    int numero;
    Cliente titular;
    private double saldo;
    private double limite;
    
    private static int numeroIncremental = 1;

    // Construtores
    public Conta(int numero, double limite){
        this(numero, limite, 0);
    }

    public Conta(int numero, double limite, double saldoInicial){
        this.numero = numero;
        this.limite = limite;
        this.saldo = saldoInicial;
    }

    public Conta(){
        this.numero = numeroIncremental;
        numeroIncremental++;
    }

    //Métodos
    public void saca(double valor){
        if(valor>this.saldo + this.limite){
            System.out.println("Saque invalido");
        } else {
            this.saldo = this.saldo - valor;
        }
    }

    public void deposita(double valor){
        this.saldo = this.saldo +valor;
    }


    //Getters and Setters
    public double getSaldo(){
        return this.saldo;
    }

    public void setLimite(double novoLimite){
        this.limite = novoLimite;
    }
}