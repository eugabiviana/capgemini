import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        //Elabore um algoritmo que efetue a apresentação do valor da conversão em real (R$) de um valor lido em
        // dólar (US$). O algoritmo deverá solicitar o valor da cotação do dólar e também a quantidade de dólares
        // disponíveis com o usuário.

        double dolar;
        double real = 0;
        double cotacao;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite seu valor em Dólar:");
        dolar = leia.nextDouble();
        System.out.println("Digite a cotação do dia:");
        cotacao = leia.nextDouble();

        real = cotacao * dolar;

        System.out.println("O valor de US$" + dolar + " em reais, é igual a R$" + real + ".");
    }
}
