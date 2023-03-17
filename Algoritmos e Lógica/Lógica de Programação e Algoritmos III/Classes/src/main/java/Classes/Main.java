package Classes;
import Classes.Pessoa;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //criando uma variável não-primitiva:
        Pessoa objetoPessoa = new Pessoa(); //guardo na VARIÁVEL objetoPessoas as infos de Pessoa
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o peso da pessoa:");
        objetoPessoa.peso = leia.nextFloat();

        System.out.println("Digite a altura da pessoa:");
        objetoPessoa.altura = leia.nextFloat();

        System.out.println("IMC = " + objetoPessoa.calcularIMC());
    }
}
