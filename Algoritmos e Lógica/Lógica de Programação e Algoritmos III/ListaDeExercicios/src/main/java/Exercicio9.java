import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        //Faça um algoritmo que receba um valor que foi depositado e exiba o valor com rendimento após um mês.
        // Considere fixo o juro da poupança em 0,07% a. m;

        double deposito;
        double juros = 0.07;
        double rendimento;

        Scanner leia = new Scanner(System.in);

        System.out.println("Qual o valor você quer depositar?");
        deposito = leia.nextDouble();

        rendimento = deposito + (deposito * juros);

        System.out.println("Em um mês, você receberá R$" + rendimento + ".");
    }
}
