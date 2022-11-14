algoritmo "Exercícios - Condicionais I"

var
   velVeiculo, velLeve, velMedia, velGrave, velGravissima: real

inicio
      velLeve <- 50 * 1.1
      velMedia <- 70
      velGrave <- 90
      velGravissima <- 110
      
      EscrevaL("Informe a sua velocidade: ")
      Leia(velVeiculo)

      Se velVeiculo <= velLeve entao
         EscrevaL("Você está dentro da velocidade permitida!")
      senao
           se velVeiculo <= velMedia entao
              Escreval("Você está na velocidade média da via!")
            senao
                 se velVeiculo <= velGrave entao
                    Escreval("Infração grave! Multa mais 3 pontos na carteira.")
                 senao
                      se velVeiculo <= velGravissima entao
                         Escreval("Infração gravíssima! Multa mais 5 pontos na carteira!")
                      senao
                           EscrevaL("7 pontos na carteira mais suspensão da mesma!")
                      fimse
                 fimse
            fimse
      fimse


fimalgoritmo
