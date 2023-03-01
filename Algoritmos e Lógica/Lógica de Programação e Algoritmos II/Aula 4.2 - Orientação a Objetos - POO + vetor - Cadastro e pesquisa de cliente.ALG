Algoritmo "Orientação a Objetos"

tipo
//isso é um objeto
cadastroCliente = registro
    nome: caractere
    rg: caractere
    idade: inteiro
fimregistro

Var

clientes: vetor[1..3] de cadastroCliente
opcao: caractere
i: inteiro
rgPesquisa: caractere

Inicio

repita
      Escreval("1 - Cadastrar")
      Escreval("2 - Pesquisar")
      Escreval("3 - Sair")
      leia(opcao)
      
      se opcao = "1" entao
           para i de 1 ate 3 faca
                se clientes[i].nome = "" entao
                  Escreval("Digite seu nome: ")
                  leia(cliente[i].nome)
                  Escreval("Digite seu RG: ")
                  leia(cliente[i].rg)
                  Escreval("Digite sua idade: ")
                  leia(cliente[i].idade)
                interrompa
                fimse
           fimpara
      senao
           se opcao = "2" entao
              Escreval("Digite o RG")
              leia(rgPesquisa)
                 para i de 1 ate 3 faca
                      se clientes[i].rg = rgPesquisa entao
                         Escreval(clientes[i].nome , " encontrado!")
                         interrompa
                      fimse
                 fimpara
           fimse
      fimse
ate opcao = "3"
Fimalgoritmo