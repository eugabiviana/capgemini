import java.util.Scanner;


public class Exercicio22 {
    public static void main(String[] args) {
        /**
         * Faça um algoritmo que receba o preço de custo e o preço de venda de 40 produtos.
         * Mostre como resultado se houve lucro, prejuízo ou empate para cada produto.
         * Informe o valor de custo de cada produto, o valor de venda de cada produto, a média
         * de preço de custo e do preço de venda;
         */

        Scanner leia = new Scanner(System.in);

        String nomeProduto;
        float precoCusto;
        float precoVenda;

        float totalCusto;
        float totalVenda;

        for (int i = 0; i < 40; i++){
            System.out.println("Digite o nome do produto: ");
            nomeProduto = leia.nextLine();
            System.out.println("Digite o preço de custo do produto: ");
            precoCusto = leia.nextFloat();
            System.out.println("Digite o preço de venda do produto: ");
            precoVenda = leia.nextFloat();

            totalCusto = totalCusto + precoCusto;
            totalVenda = totalVenda + precoVenda;

            if (precoCusto == precoVenda){
                System.out.println("Houve um empate entre o preço de custo e venda!");

            } else {
                if (precoCusto > precoVenda){
                    System.out.println("Houve prejuízo!");
                } else {
                    System.out.println("Houve lucro!");
                }
            }
        }
    }
}
