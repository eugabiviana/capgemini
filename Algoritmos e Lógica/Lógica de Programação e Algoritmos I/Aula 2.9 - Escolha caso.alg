algoritmo "Escolha"

var
voto: literal

inicio
      Escreval("Digite o seu voto.")
      Leia(voto)
      
      Escolha voto
      Caso "20"
           Escreval("Você votou em: Naruto.")
      Caso "30"
           Escreval("Você votou em: Sasuke.")
      Caso "40"
           Escreval("Você votou em: Sakura.")
      outrocaso
           Escreval("Voto nulo!")
      fimescolha

fimalgoritmo
