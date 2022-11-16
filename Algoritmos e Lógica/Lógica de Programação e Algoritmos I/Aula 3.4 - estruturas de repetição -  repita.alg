algoritmo "Repita"

var
   i: inteiro
   senha, resposta: literal
   
inicio
  Escreval("Primeiro exemplo")
   i <- 0
   
   repita
   Escreval(i)
   i <- i + 1
   ate i > 10
   
   Escreval(" ")
   Escreval("========================")
   Escreval("Segundo exemplo")
   Escreval(" ")
   Escreval("Escreva a senha: ")
   leia(senha)
   limpatela
   
   repita
         Escreval("Digite a senha para sair do programa!")
         leia(resposta)
   ate resposta = senha
   

fimalgoritmo
