package org.desafios;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo número:");
        int num2 = sc. nextInt();

        try{
            Count(num1, num2);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
    static void Count(int num1, int num2) throws IllegalArgumentException{
        if (num2 <= num1){
            throw new IllegalArgumentException("O segundo parâmetro (" + num2 + ") deve ser maior que o primeiro parâmetro (" + num1 + ")");
        }else {
            for (int i = num1; i <= num2; i++) {
                System.out.printf("Imprimindo o número %d\n", i);

            }
        }
    }
}
