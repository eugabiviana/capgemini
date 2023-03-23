import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        //Escreva um algoritmo para determinar o consumo médio de um automóvel sendo fornecida a distância total
        // percorrida pelo automóvel e o total de combustível gasto;

        double distancia = 0;
        double combustivel = 0;
        double consumoMedio = 0;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a distância percorrida:");
        distancia = leia.nextDouble();
        System.out.println("Digite a quantidade de combustível gasto:");
        combustivel = leia.nextDouble();

        consumoMedio = distancia / combustivel;

        System.out.println("O consumo médio de combustível é de " + consumoMedio + "km por litro.");
    }
}
