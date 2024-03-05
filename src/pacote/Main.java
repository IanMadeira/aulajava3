package pacote;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitorDeDados = new Scanner(System.in);

        System.out.println("Digite a idade do funcionário:");
        int idade = leitorDeDados.nextInt();

        System.out.println("Digite o salário:");
        double salario = leitorDeDados.nextDouble();

        System.out.println("Digite o sexo (M/F):");
        char sexo = leitorDeDados.next().charAt(0);

        System.out.println("O funcionário é casado?:");
        boolean casado = leitorDeDados.nextBoolean();

        System.out.println("Digite o nome do funcionário:");
        String nome = leitorDeDados.next();

        leitorDeDados.close();

        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Casado: " + casado);
        System.out.println("Nome: " + nome);
    }
}