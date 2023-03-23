import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        //Faça um algoritmo que receba dois números e exiba o resultado da sua soma;

        int num1 = 0;
        int num2 = 0;
        int resultado = 0;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número:");
        num1 = leia.nextInt();
        System.out.println("Digite outro número:");
        num2 = leia.nextInt();

        resultado = num1 + num2;

        System.out.println("O resultado da soma: " + num1 + " + " + num2 + " = " + resultado + ".");
    }
}
