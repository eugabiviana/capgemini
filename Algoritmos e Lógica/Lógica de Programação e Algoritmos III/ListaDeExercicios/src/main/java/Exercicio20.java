import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        /**
         * A concessionária de veículos ?CARANGO VELHO? está vendendo os seus veículos com desconto. Faça um algoritmo
         * que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente de vários carros. O desconto deverá
         * ser calculado de acordo com o ano do veículo. Até 2000 - 12% e acima de 2000 - 7%. O sistema deverá perguntar
         * se deseja continuar calculando desconto até que a resposta seja: ?(N) Não?. Informar total de carros com ano
         * até 2000 e total geral;
         */

        int anoFabricacao = 0;
        float valorVeiculo = 0.0f;
        float porcentagemDesconto = 0.0f;
        float valorDesconto = 0.0f;
        float valorPagar = 0.0f;

        int totalCarrosSemiNovos = 0;
        int totalCarros = 0;


        Scanner leia = new Scanner(System.in);

        char desejaRepetir = 's';

        while (desejaRepetir == 's' || desejaRepetir == 'S'){

            System.out.println("Digite o ano de fabricação do carro:");
            anoFabricacao = leia.nextInt();
            System.out.println("Digite o valor do carro:");
            valorVeiculo = leia.nextFloat();

            if (anoFabricacao <= 2000){
                porcentagemDesconto = 0.12f;
            } else {
                porcentagemDesconto = 0.07f;
                totalCarrosSemiNovos++;
            }
            totalCarros++;

            valorDesconto = valorVeiculo * porcentagemDesconto;
            valorPagar = valorVeiculo - valorDesconto;

            System.out.println("O valor do desconto foi de R$" + valorDesconto);
            System.out.println("O valor a ser pago será de R$" + valorPagar);

            System.out.println("Deseja fazer mais cadastro? S - Sim/ N - Não");
            desejaRepetir = leia.next().charAt(0); //aqui ele lê só a primeira letra digitada

        }

        System.out.println("O total de carros semi novos: " + totalCarrosSemiNovos);
        System.out.println("O total de carros cadastrados: " + totalCarros);
    }
}
