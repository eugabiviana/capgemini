algoritmo "Estruturas condicionais"

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
      se media < 7 entao
         Escreval("Recuperação!")
      senao
           Escreval("Aprovado!")
      fimse
      
fimalgoritmo
