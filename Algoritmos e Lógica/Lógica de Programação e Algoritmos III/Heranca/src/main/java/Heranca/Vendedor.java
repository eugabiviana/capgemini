package Heranca;

import java.util.Date;

public class Vendedor extends Funcionario {

    private int totalItensVendidos;
    private float comissaoPorItem;

    //Constructor
    public Vendedor() {
        super(); //me dá acesso a todos os atributos de funcionário aqui em vendedor. Sem isso não consigo chamar o obj na Main!
    }
}

//O vendedor passa a ter todas as informações de Funcionário quando extendo a classe aqui para dentro!
