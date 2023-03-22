package Heranca;

import java.util.Date;

public class Vendedor extends Funcionario {

    private int totalItensVendidos;
    private float comissaoPorItem;

    //Constructor
    public Vendedor() {
        super(); //me dá acesso a todos os atributos de funcionário aqui em vendedor. Sem isso não consigo chamar o obj na Main!
    }

    public float calcularSalario(){
        return super.getSalario() + (this.comissaoPorItem * totalItensVendidos);
    }

    //Getters and Setters
    public int getTotalItensVendidos() {
        return totalItensVendidos;
    }

    public void setTotalItensVendidos(int totalItensVendidos) {
        this.totalItensVendidos = totalItensVendidos;
    }

    public float getComissaoPorItem() {
        return comissaoPorItem;
    }

    public void setComissaoPorItem(float comissaoPorItem) {
        this.comissaoPorItem = comissaoPorItem;
    }
}

/**
 * O vendedor passa a ter todas as informações de Funcionário quando extendo a classe aqui para dentro!
 * Se eu tirar o super();, ele passa a não ter nenhum atributo além dos dois criados aqui na classe.
 * Quando coloco super.getSalario, estou pedindo permissão para a classe superior (no caso FUNCIONÁRIO), para pegar a
 * informação de lá e modificar aqui.
 */
