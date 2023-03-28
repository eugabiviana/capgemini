import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        //Faça um algoritmo que receba o preço de custo de um produto e mostre o valor de venda. Sabe-se que o preço de
        // custo receberá um acréscimo de acordo com um percentual informado pelo usuário;

        double custo;
        double venda;
        double percentual;
        String nomeProd;

        Scanner leia = new Scanner(System.in);

        System.out.println("Qual produto deseja cadastrar?");
        nomeProd = leia.nextLine();
        System.out.println("Qual o valor de custo do produto?");
        custo = leia.nextDouble();
        System.out.println("Qual a porcentagem acrescida ao valor de custo?");
        percentual = leia.nextDouble();

        venda = custo + (custo * percentual);

        System.out.println("O valor de venda de "+nomeProd+ " será R$" + venda);

    }
}
