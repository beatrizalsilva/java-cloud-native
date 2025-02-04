package dio.bootcampbradesco.modulo01.contabancaria;

import java.util.Scanner;

public class AberturaDeConta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nomeCliente, agencia;
        int numeroConta;
        float saldoInicial;

        System.out.println("Bem-vindo(a) ao JavaBank! Para garantir uma experiência segura e personalizada, por favor, insira seus dados conforme solicitado.");

        System.out.print("\nDigite seu nome: ");
        nomeCliente = input.nextLine();

        System.out.print("Digite o número da agência: ");
        agencia = input.next();

        System.out.print("Digite o número da conta: ");
        numeroConta = input.nextInt();

        System.out.print("Digite o saldo inicial: ");
        saldoInicial = input.nextFloat();
        input.close();

        System.out.printf("\nOlá %s, obrigado por criar uma conta em nosso banco. Sua agência é %s, conta %d e seu" +
                "saldo de R$ %.2f já está disponível para saque.%n", nomeCliente, agencia, numeroConta, saldoInicial);
    }
}
