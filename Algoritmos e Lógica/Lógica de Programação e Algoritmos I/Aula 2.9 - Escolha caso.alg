algoritmo "Escolha"

var
voto: literal

inicio
      Escreval("Digite o seu voto.")
      Leia(voto)
      
      Escolha voto
      Caso "20"
           Escreval("Voc� votou em: Naruto.")
      Caso "30"
           Escreval("Voc� votou em: Sasuke.")
      Caso "40"
           Escreval("Voc� votou em: Sakura.")
      outrocaso
           Escreval("Voto nulo!")
      fimescolha

fimalgoritmo
