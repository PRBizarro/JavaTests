class TesteModificador {
    public static void main(String args[]){

        Conta joao = new Conta(123, 100.0);
        //joao.numero = 123;
        joao.setLimite(100.0);

        joao.deposita(500.0);
        joao.saca(100.0);

        System.out.println(joao.getSaldo());
    }
}