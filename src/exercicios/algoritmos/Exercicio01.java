package exercicios.algoritmos;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Quantos metros o terreno possui de frente: ");
        double frente = teclado.nextDouble();
        System.out.printf("Quantos metros o terreno possui na lateral: ");
        double lateral = teclado.nextDouble();
        System.out.printf("Informe o valor do metro ao quadrado: ");
        double quadrado = teclado.nextDouble();


        double soma = frente * lateral;
        double resultado = soma * quadrado;
        System.out.println("\nArea total do terreno de " + frente + "Metros de frente com " + lateral +
                " metros de lateral e " + soma +
                " metros");
        System.out.printf("o valor deste terreno e: R$ %.2f", resultado );
    }
}