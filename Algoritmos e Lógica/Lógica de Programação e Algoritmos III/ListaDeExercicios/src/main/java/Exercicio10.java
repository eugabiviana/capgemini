import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        //A Loja Mamão com Açúcar está vendendo seus produtos em 5(cinco) prestações sem juros. Faça um algoritmo que
        // receba um valor de uma compra e mostre o valor das prestações;

        double prestacao;
        double valorTotal;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o valor total da sua compra:");
        valorTotal = leia.nextDouble();

        prestacao = valorTotal / 5;

        System.out.println("O valor da prestação sua compra, dividida em 5x sem juros, será R$" + prestacao);
    }
}
