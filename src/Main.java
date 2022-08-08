public class Main {
    public static void main(String[] args) {
        Conta cCorrente = new ContaCorrente();
        Conta cPoupanca = new ContaPoupanca();


        cCorrente.imprimirExtrato();
        cPoupanca.imprimirExtrato();

        cCorrente.depositar(100);
        cCorrente.imprimirExtrato();
        cCorrente.tranferir(80, cPoupanca);

        cCorrente.imprimirExtrato();
        cPoupanca.imprimirExtrato();


    }
}
