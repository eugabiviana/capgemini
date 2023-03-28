import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        //Leia dois valores para as variáveis A e B, e efetuar as trocas dos valores de forma que a variável A passe a
        // possuir o valor da variável B e a variável B passe a possuir o valor da variável A. Apresentar os valores
        // trocados;

        int valorA = 0;
        int valorB = 0;
        int valorC = 0;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um valor inteiro para A:");
        valorA = leia.nextInt();
        System.out.println("Digite um valor inteiro para B:");
        valorB = leia.nextInt();

        valorC = valorA;
        valorA = valorB;
        valorB = valorC;

        System.out.println("O valor de A agora é " + valorA + " e o valor de B agora é " +valorB);
    }
}
