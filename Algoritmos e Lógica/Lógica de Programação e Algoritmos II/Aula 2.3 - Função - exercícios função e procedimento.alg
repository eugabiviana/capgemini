algoritmo "Exerc�cios Fun��o/Procedimento"

var
   lado1, lado2, lado3: inteiro
   
   procedimento lerDados()
   inicio
         escreval("Lado 1: ")
         leia(lado1)
         escreval("Lado 2: ")
         leia(lado2)
         escreval("Lado 3: ")
         leia(lado3)
   fimprocedimento
   
   funcao verificarIntegridadeTriangulo(): logico
   inicio
         se (lado1 > lado2 + lado3) ou (lado2 > lado1 + lado3) ou lado3 > lado2 + lado1) entao
            retorne falso
         senao
            retorne verdadeiro
         fimse
   fimfuncao
   
   funcao verificarTipoTriangulo(): literal
   inicio
         se (lado1 = lado2) E (lado2 = lado3) entao
            retorne "Equil�tero"
         senao
              se (lado1 = lado2) ou (lado2 = lado3) ou (lado3 = lado1) entao
                 retorne "Is�sceles"
              senao
                 retorne "Escaleno"
              fimse
         fimse
   fimfuncao

inicio
   lerDados()
   se verificarIntegridadeTriangulo() entao
      escreval(verificarTipoTriangulo())
   senao
      escreval("N�o � tri�ngulo!")
   fimse
fimalgoritmo
