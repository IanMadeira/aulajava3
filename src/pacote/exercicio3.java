package pacote;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner leitorDeDados = new Scanner(System.in);
        System.out.println("digite um numero");
        int n1 = leitorDeDados.nextInt();
        int numeroantes = n1 - 1;
        int numerodepois = n1 + 1;

        System.out.println(numeroantes);
        System.out.println(numerodepois);

    }
}
