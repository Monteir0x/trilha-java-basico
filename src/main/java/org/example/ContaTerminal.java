package org.example;

import java.util.Scanner;
// TODO: Implementar transferências, saques, criar um loop para várias contas.
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
       String decision;
        System.out.println("Bem vindo ao terminal bancário");
        System.out.println("Deseja criar sua conta? (Y/N)");
        decision = sc.nextLine();
        if (decision.equalsIgnoreCase("Y")) {
            ContaTerminal.createAccount();
        } else {
            if (!decision.equalsIgnoreCase("N")) {
                System.out.println("Digite uma opção válida");
            }
        }
    }

    public static void createAccount() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome completo:");
        String name = sc.nextLine();
        System.out.println("Digite o numero da agencia de preferencia");
        int agency = sc.nextInt();
        System.out.println("Digite o numero da sua conta");
        int numberAccount = sc.nextInt();
        System.out.println("Quanto deseja depositar?");
        double accountBalance = sc.nextDouble();

        System.out.println("Conta criada com sucesso!!");
        System.out.println("Olá, " + name + ", obrigado por criar uma conta em nosso banco, sua agência é " + agency + " conta " + numberAccount + " e seu saldo no momento é " + accountBalance + " disponível para saque.");

    }
}





