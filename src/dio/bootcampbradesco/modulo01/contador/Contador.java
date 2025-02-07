package dio.bootcampbradesco.modulo01.contador;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro parâmetro: ");
        int parametroUm = input.nextInt();
        System.out.print("Digite o segundo parâmetro: ");
        int parametroDois = input.nextInt();

        try {
            contar(parametroUm, parametroDois);
        }catch (ParametrosInvalidosException exception) {
            System.out.print("Erro: O segundo parâmetro deve ser maior que o primeiro.");
        }

    }

    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++) {
            System.out.print("Número: " + i + " ");
        }
    }
}
