import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        //Escreva um algoritmo que leia dois valores inteiro distintos e informe qual é o maior;

        int num1;
        int num2;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro:");
        num1 = leia.nextInt();
        System.out.println("Digite o segundo número inteiro:");
        num2 = leia.nextInt();

        if (num1 > num2){
            System.out.println(num1+ " é maior do que " +num2+"!");
        } else if (num1 < num2) {
            System.out.println(num1+ " é menor do que " +num2+"!");

        }else {
            System.out.println(num1+ " é igual ao número " +num2+"!");
        }
    }
}
