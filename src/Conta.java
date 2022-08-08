public abstract class Conta {
    protected static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    protected int agencia;
    protected int numero;
    protected double saldo;


    public Conta() {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    protected void imprimirExtrato(){

    }
    public void sacar(double valor){
        this.saldo -= valor;
    }

    protected void  depositar(double valor){
        this.saldo += valor;
    }

    protected void tranferir(double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected int getAgencia() {
        return agencia;
    }

    protected int getNumero() {
        return numero;
    }

    protected double getSaldo() {
        return saldo;
    }

    protected void imprimirInfosComuns(){
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Número: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}
