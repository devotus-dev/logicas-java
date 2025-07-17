package TiposVariaveisBasico;

import java.util.Scanner;

public class arrayNumeros {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o número " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }

        System.out.println("Os números digitados foram: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(numeros[i]);
        }
        teclado.close();
    }

}
