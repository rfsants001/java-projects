package DesafioArray;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantas notas: ");

        int qtdNotas = input.nextInt();

        double[] notas = new double[qtdNotas];

        for(int i = 0; i < notas.length; i++) {
            System.out.print("Informe a nota " + (i + 1) + ": ");
            notas[i] = input.nextDouble();
        }

        double total = 0;
        for(double nota: notas){
            total += nota;
        }

        double media = total / notas.length;
        System.out.println("A média é " + String.format("%.2f", media));
        input.close();
    }
}
