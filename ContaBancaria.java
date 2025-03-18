public class ContaBancaria {
    private String titular;
    private String numeroConta;
    private double saldo;
    public ContaBancaria (){}
    public ContaBancaria (String titular, String numeroConta){
        this.titular=titular;
        this.numeroConta=numeroConta;
    }

    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(doubleSaldo){
        this.saldo=saldo;
    }

    public void depositar (double valor) throws Exception{
        it(valor <=0){
            throw newException();
        }
    }
    

}