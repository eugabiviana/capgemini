package Classes;
import Classes.Pessoa;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //criando uma variável não-primitiva:
        Pessoa objetoPessoa = new Pessoa(70.0f, 1.70f); //guardo na VARIÁVEL objetoPessoas as infos de Pessoa
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o peso da pessoa:");
        objetoPessoa.setPeso(leia.nextFloat());

        System.out.println("Digite a altura da pessoa:");
        objetoPessoa.setAltura(leia.nextFloat());

        System.out.println("IMC = " + objetoPessoa.calcularIMC());
    }
}
//dentro dos parênteses tenho PARÂMETROS.