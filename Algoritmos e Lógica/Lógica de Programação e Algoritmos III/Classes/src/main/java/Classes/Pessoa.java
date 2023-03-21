package Classes;

public class Pessoa {

    //atributos
    private float peso; //<- atributo
    private float altura;

    //Construtor -> serve para inserir o valor do parâmetro ao atributo peso/altura
    public Pessoa(float peso, float altura){
        this.peso = peso; //<-parâmetro
        this.altura = altura;
    }


    //métodos (sempre colocar o nome dos métodos no infinitivo)
    public float calcularIMC(){
        float imc = peso / (altura * altura);
        return imc;
    }

    //Métodos de acesso (getters and setters)
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public float getPeso() {
        return peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getAltura() {
        return altura;
    }
}

/**
 * Pelo princípio do encapsulamento, o método MAIN não pode modificar ou acessar informações do objeto diretamente e sem
 * autorização. Por isso colocamos private ao criar as variáveis, e depois damos acesso de motificar e pegar infos com
 * getters e setters.
 */