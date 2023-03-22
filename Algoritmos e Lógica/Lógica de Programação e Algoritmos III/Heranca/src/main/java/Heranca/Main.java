package Heranca;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Vendedor v = new Vendedor();
        v.setNome("Gabi");
        v.setSalario(1000.0f);
        v.setCpf("654879841541");
        v.setDataNascimento(new Date()); //vem a data de hoje aqui, mas � s� ter uma info qualquer.
        v.setComissaoPorItem(10.0f);
        v.setTotalItensVendidos(10);

        System.out.println("O sal�rio do vendedor �: R$" + v.calcularSalario());

        Motorista m = new Motorista();
    }
}

/**
 * A heran�a � usada para n�o haver repeti��o de c�digo, como no caso da aula 4.w, onde vendedor e motorista t�m as mesmas
 * informa��es.
 * ao digitar 'v.' aqui na Main, consigo chamar os atribuitos de Funcionario para a classe Vendedor (por causa do super)
 * Quando usar a rela��o de Heran�a na POO? Sempre que voc� usar a frase "� um tipo de", como nesse caso. O motorista,
 * � um tipo de funcion�rio. O vendedor, � um tipo de funcion�rio. H� uma converg�ncia para um tipo em comum!
 */