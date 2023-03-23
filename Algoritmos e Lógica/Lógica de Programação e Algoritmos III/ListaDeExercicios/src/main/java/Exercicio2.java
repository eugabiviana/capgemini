import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        //Faça um algoritmo que receba dois números e ao final mostre a soma, subtração, multiplicação e a divisão dos
        // dois números lidos;

        double num1 = 0;
        double num2 = 0;
        double resultadoSoma = 0;
        double resultadoSub = 0;
        double resultadoDiv = 0;
        double resultadoMult = 0;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número:");
        num1 = leia.nextDouble();
        System.out.println("Digite outro número:");
        num2 = leia.nextDouble();

        resultadoSoma = num1 + num2;
        resultadoSub = num1 - num2;
        resultadoMult = num1 * num2;
        resultadoDiv = num1 / num2;

        System.out.println("O resultado da soma: " + num1 + " + " + num2 + " = " + resultadoSoma + ".");
        System.out.println("O resultado da subtração: " + num1 + " - " + num2 + " = " + resultadoSub + ".");
        System.out.println("O resultado da multiplicação: " + num1 + " x " + num2 + " = " + resultadoMult + ".");
        System.out.println("O resultado da divisão: " + num1 + " / " + num2 + " = " + resultadoDiv + ".");
    }
}
