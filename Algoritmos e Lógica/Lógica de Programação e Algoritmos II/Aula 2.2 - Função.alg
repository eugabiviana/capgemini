algoritmo "Fun��o"

var

   funcao somar(a, b: inteiro): inteiro
   inicio
         retorne a + b
   fimfuncao
   
   funcao testar(): inteiro
   inicio
         retorne somar(50,50) + 40
   
   fimfuncao

inicio

   escreval("Fun��o somar:", somar(10, 20))
   escreval("Fun��o testar, que chama a fun��o somar:",testar())

fimalgoritmo
