algoritmo "Passo"
//Na l�gica do programa, j� fica implicito que o passo � um, para sobrescrever o padr�o, mudo o n�mero para o passo desejado.
//
var
i, w, start, end: inteiro
inicio
escreval("Impress�o de todos os n�meros entre 0 e 10:")
//Na l�gica do programa, j� fica implicito que o passo � 1.
   para i de 0 ate 10 faca
        escreval(i)
   fimpara
   escreval(" ")
   escreval("===================================================")
   escreval(" ")
   escreval("Impress�o de todos os n�meros PARES entre 0 e 10:")
//Para sobrescrever o padr�o, mudo o n�mero para o passo desejado, deixando expl�cito no c�digo.
   para i de 0 ate 10 passo 2 faca
        escreval(i)
   fimpara
   escreval(" ")
   escreval("===================================================")
   escreval(" ")
   escreval("Impress�o de todos os n�meros decrescentes entre 10 e 0:")
//Tamb�m posso inverter a ordem e colocar para escrever o n�mero decrescente.
   para i de 10 ate 0 passo -1 faca
        escreval(i)
   fimpara
   
//Sem valores fixos:
   escreval(" ")
   escreval("===================================================")
   escreval(" ")
   escreval("Impress�o de n�meros solicitados ao usu�rio:")
   escreval(" ")
   escreval("Come�o em: ")
   leia(start)
   escreval("Fim em: ")
   leia(end)
   escreval("Decremento de: ")
   leia(w)
   
   para i de start ate end passo w faca
        escreval(i)
   fimpara
fimalgoritmo
