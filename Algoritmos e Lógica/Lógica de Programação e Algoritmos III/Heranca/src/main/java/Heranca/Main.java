package Heranca;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Vendedor v = new Vendedor();
        v.setNome("Gabi");
        v.setSalario(1000.0f);
        v.setCpf("654879841541");
        v.setDataNascimento(new Date()); //vem a data de hoje aqui, mas é só ter uma info qualquer.
        v.setComissaoPorItem(10.0f);
        v.setTotalItensVendidos(10);

        System.out.println("O salário do vendedor é: R$" + v.calcularSalario());

        Motorista m = new Motorista();
    }
}

/**
 * A herança é usada para não haver repetição de código, como no caso da aula 4.w, onde vendedor e motorista têm as mesmas
 * informações.
 * ao digitar 'v.' aqui na Main, consigo chamar os atribuitos de Funcionario para a classe Vendedor (por causa do super)
 * Quando usar a relação de Herança na POO? Sempre que você usar a frase "É um tipo de", como nesse caso. O motorista,
 * é um tipo de funcionário. O vendedor, é um tipo de funcionário. Há uma convergência para um tipo em comum!
 */