algoritmo "Tipos de variaveis"

var
   num1, num2, num3, soma, sub, mult: inteiro
   divisao: real
   sucesso: logico
inicio
      Escreval("N1")
      Leia(num1)
      Escreval("N2")
      Leia(num2)
      soma <- num1 + num2
      sub <- num1 - num2
      mult <- num1 * num2
      divisao <- num1 / num2
      
      //Logico diz se a info é V ou F
      Escreval("N3")
      Leia(num3)
      sucesso <- num3 > 10
      Escreval(sucesso)
      
fimalgoritmo
