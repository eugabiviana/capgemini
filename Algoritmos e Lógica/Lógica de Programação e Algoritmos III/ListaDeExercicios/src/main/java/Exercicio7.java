import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        //Leia uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de conversão é:
        // F=(9*C+160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius;

        double celsius;
        double fahrenheit;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a temperatura a ser convertida: ");
        celsius = leia.nextDouble();

        fahrenheit = (9 * celsius + 160)/5;

        System.out.println("A temperatura de " + celsius +"ºC em Fahrenheit é igual a " + fahrenheit + "ºF.");
    }
}
