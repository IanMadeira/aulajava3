package pacote;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner leitorDeDados = new Scanner(System.in);

        System.out.println("digite um numero");
        int n1=leitorDeDados.nextInt();

        System.out.println("digite um numero");
        int n2=leitorDeDados.nextInt();

        System.out.println("digite um numero");
        int n3 =leitorDeDados.nextInt();

        leitorDeDados.close();
        double result = (n1 + n2 + n3) /3 ;
        double resultmult = n1 * n2 * n3 ;
        System.out.println(result);
        System.out.println(resultmult);






    }
}
