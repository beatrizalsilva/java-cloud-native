package dio.bootcampbradesco.modulo02.bancodigital;

public class Main {
    public static void main(String[] args) {
        Cliente beatriz = new Cliente();
        beatriz.setNome("Beatriz");

        Conta cc = new ContaCorrente(beatriz);
        Conta poupanca = new ContaPoupanca(beatriz);

        cc.depositar(1090);
        cc.transferir(500, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}