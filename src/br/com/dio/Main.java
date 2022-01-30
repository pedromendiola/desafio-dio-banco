package br.com.dio;


public class Main {

    public static void main(String[] args) {

        Cliente pedro = new Cliente();
        pedro.setNome("Pedro");

        Conta cc = new ContaCorrente(pedro);
        Conta poupanca = new ContaPoupanca(pedro);

        cc.depositar(1000);
        cc.transferir(1000, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
