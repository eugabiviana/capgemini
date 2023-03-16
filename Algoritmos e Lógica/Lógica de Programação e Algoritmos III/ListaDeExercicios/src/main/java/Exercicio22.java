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

        float totalCusto = 0.0f; //se eu não iniciar a variável aqui, terei um erro na conta dentro do for*
        float totalVenda = 0.0f; //e se não colocar o f, dá erro na execução!

        int i = 0; //criando o índice aqui fora para não dar erro fora do laço!*
        for (; i < 3; i++){
            System.out.println("Digite o nome do produto: ");
            nomeProduto = leia.next();
            System.out.println("Digite o preço de custo do produto: ");
            precoCusto = leia.nextFloat();
            System.out.println("Digite o preço de venda do produto: ");
            precoVenda = leia.nextFloat();

            totalCusto = totalCusto + precoCusto; //*dá erro aqui e nessa linha de baixo!
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

            System.out.println(nomeProduto + ": preço de custo = " + precoCusto + ", preço de venda = " + precoVenda);
        }

        System.out.println("A média do preço de custo é de: " + (totalCusto/i)); //*Daria erro aqui!
        System.out.println("A média do preço de venda é de: " + (totalVenda/i));
    }
}
