import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        //Faça um algoritmo que receba um número e mostre uma mensagem caso este número seja maior que 10;

        int num;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um  número inteiro:");
        num = leia.nextInt();

        if (num > 10){
            System.out.println(num + " é maior do que 10!");
        } else {
            System.out.println(num + " é menor do que 10!");
        }
    }
}
