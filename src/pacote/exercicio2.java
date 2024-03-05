package pacote;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner leitorDeDados = new Scanner(System.in);

        System.out.println("digite o nome do funcionario");
        String nome = leitorDeDados.nextLine();

        System.out.println("digite o salário do funcionário");
        double salario = leitorDeDados.nextDouble();
        leitorDeDados.close();
        double reajuste = salario + (salario  * 0.01);

        System.out.println("olá "+nome+" seu novo salário é : "+reajuste);

    }
}
