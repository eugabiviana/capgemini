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


        Scanner leia = new Scanner(System.in);

        boolean desejaRepetir = true;

        while (desejaRepetir == true){

            System.out.println("Digite o ano de fabricação do carro:");
            anoFabricacao = leia.nextInt();
            System.out.println("Digite o valor do carro:");
            valorVeiculo = leia.nextFloat();

            if (anoFabricacao <= 2000){
                porcentagemDesconto = 0.12f;
                valorVeiculo = valorVeiculo - (valorVeiculo * porcentagemDesconto);
            } else {
                porcentagemDesconto = 0.07f;
                valorVeiculo = valorVeiculo - (valorVeiculo * porcentagemDesconto);
            }

            System.out.println("Deseja fazer mais cadastro? S - Sim/ N - Não");

        }

        System.out.println("O valor final do veículo de ano " + anoFabricacao + ", com desconto de "
                + porcentagemDesconto + "%, é de: R$" + valorVeiculo + ".");
    }
}
