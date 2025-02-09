package tw.algoritmos;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int[] numeros = new int[5];
        numeros[0] = 30;

        System.out.println("Hello world");
        System.out.println("Digite um número: ");

        for (int i = 0; i < numeros.length; i++) {
            int numero = scanner.nextInt();
            numeros[i] = numero;
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        scanner.close();
    }
}
