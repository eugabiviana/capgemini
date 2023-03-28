import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        //O custo de um carro novo ao consumidor é a soma do custo de fábrica mais o percentual do distribuidor e dos
        // impostos aplicados (primeiro os impostos são aplicados sobre o custo de fábrica, e depois o percentual do
        // distribuidor sobre o resultado). Supondo que o percentual do distribuidor seja de 28% e os impostos 45%,
        // escreva um algoritmo que leia o custo de fábrica de um carro e informe o custo ao consumidor do mesmo.

        double carroNovo;
        double custoFabrica;
        double percDistribuidor = 0.28;
        double percImpostos = 0.45;
        double custoConsumidor;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o valor do custo de fábrica do carro: ");
        custoFabrica = leia.nextDouble();

        carroNovo = custoFabrica + ((custoFabrica + (custoFabrica * percImpostos)) * percDistribuidor);

        System.out.println("O valor do carro novo para o consumidor será R$" + carroNovo);
    }
}
