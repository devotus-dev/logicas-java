package meuprojetojava;

import java.util.Scanner;

public class imparPar {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número e vamos comparar se é ímpar ou par!");
        int numero = teclado.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número é par!");
        } else {
            System.out.println("O número é impar!");
        }
        teclado.close();
    }
}