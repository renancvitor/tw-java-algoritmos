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

        // Busca Linear
//        System.out.println("**Busca linear**");
//        System.out.print("Digite o número a ser digitado: ");
//        int alvo = scanner.nextInt();
//        int posicaoResultado = -1;
//        for (int i = 0; i < numeros.length; i++) {
//            if (numeros[i] == alvo) {
//                posicaoResultado = i;
//                break;
//            }
//        }
//        if (posicaoResultado < 0) {
//            System.out.println("Elemento não foi encontrado.");
//        } else {
//            System.out.println(String.format("O número %d foi encontrado na posição %d", alvo, posicaoResultado));
//        }
        // FIm Busca Linear

        System.out.println("Vetor: ");
        imprimirArray(numeros);

        // Selection Sort
        for (int i = 0; i < numeros.length; i++) {
            int indiceMenor = i;
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[j] < numeros[indiceMenor]) {
                    indiceMenor = j;
                }
            }
            int temp =numeros[indiceMenor];
            numeros[indiceMenor] = numeros[i];
            numeros[i] = temp;
        }
        // Fim Selection Sort

        System.out.println("Vetor ordenado ");
        imprimirArray(numeros);

        // Busca Binária
        int resultado = -1;
        int inicio = 0;
        int fim = numeros.length - 1;
        int meio = 0;

        System.out.println("Digite o elemento a ser encontrado: ");
        int alvo = scanner.nextInt();

        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            if (numeros[meio] < alvo) {
                inicio = meio + 1;
            } else if (numeros[meio] > alvo) {
                fim = meio -1;
            } else if (numeros[meio] == alvo) {
                resultado = meio;
                break;
            }
        }

        if (resultado < 0) {
            System.out.println("Elemento não foi encontrado");
        } else {
            System.out.println(String.format("O número %d está na posição %d", alvo, resultado));
        }
        // Fim Busca Binária

        scanner.close();
    }

    private static void imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
