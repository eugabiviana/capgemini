import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        //Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele
        // no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o
        // seu nome, o salário fixo e salário no final do mês;

        String nome;
        double salario;
        double comissao = 0.15;
        double salarioFinal;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o nome do vendedor:");
        nome = leia.nextLine();
        System.out.println("Digite o valor do salário:");
        salario = leia.nextDouble();

        salarioFinal = salario + (salario * comissao);

        System.out.println("O salário do vendedor " + nome + " + a comissão é igual a: " + salarioFinal);

    }
}
