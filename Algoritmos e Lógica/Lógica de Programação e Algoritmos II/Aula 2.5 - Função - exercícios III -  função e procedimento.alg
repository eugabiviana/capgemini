algoritmo "Exerc�cio Fun��o/Procedimento III"

var
   gabarito: vetor[1..10] de literal
   opcaoMenu: literal
   notaFinal: inteiro
   
procedimento mostrarMenu()
inicio
      Escreval("1 - Cadastrar gabarito")
      Escreval("2 - Cadastrar prova")
      Escreval("3 - Sair")
      leia(opcaoMenu)
fimprocedimento

procedimento cadastrarGabarito()
var
   i: inteiro
inicio
      para i de 1 ate 10 faca
           Escreval("Informe a resposta da quest�o: ", i)
           leia(gabarito[i])
      fimpara
fimprocedimento

funcao cadastrarProva(): inteiro
var
   i, nota: inteiro
   resposta: literal
inicio
      nota <- 0
      para i de 1 ate 10 faca
           Escreval("Informe a resposta da quest�o: ", i)
           leia(resposta)
           se resposta = gabarito[i] entao
              nota <- nota + 1
           fimse
           retorne nota
      fimpara
fimfuncao

funcao verificarSituacao(nota: inteiro): literal
inicio
      se nota >= 7 entao
         retorne "APROVADO!"
      senao
         retorne "REPROVADO!"
      fimse
fimfuncao

inicio
      repita
            mostrarMenu()
            escolha opcaoMenu
            caso "1"
               cadastrarGabarito()
            caso "2"
               notaFinal <- cadastrarProva()
                   escreval(verificarSituacao(notaFinal))
            outrocaso
                Escreval("Op��o inv�lida!")
            fimescolha
      ate opcaoMenu = "3"

fimalgoritmo
