algoritmo "Estruturas condicionais II"

var
   nota1, nota2, nota3, media: real

inicio
      Escreval("Informe a nota 1: ")
      Leia(nota1)
      Escreval("Informe a nota 2: ")
      Leia(nota2)
      Escreval("Informe a nota 3: ")
      Leia(nota3)
      media <- (nota1 + nota2 + nota3)/3
      se media >= 7 entao
         Escreval("Voc� passou com a m�dia: ", media)
      senao
           se  media < 5 entao
             Escreval("Voc� reprovou com a m�dia: ", media)
             senao
                  Escreval("Voc� est� de recupera��o com a m�dia: ", media)
             fimse
      fimse
      
fimalgoritmo
