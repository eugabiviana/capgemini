algoritmo "Exerc�cios - Condicionais I"

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
         EscrevaL("Voc� est� dentro da velocidade permitida!")
      senao
           se velVeiculo <= velMedia entao
              Escreval("Voc� est� na velocidade m�dia da via!")
            senao
                 se velVeiculo <= velGrave entao
                    Escreval("Infra��o grave! Multa mais 3 pontos na carteira.")
                 senao
                      se velVeiculo <= velGravissima entao
                         Escreval("Infra��o grav�ssima! Multa mais 5 pontos na carteira!")
                      senao
                           EscrevaL("7 pontos na carteira mais suspens�o da mesma!")
                      fimse
                 fimse
            fimse
      fimse


fimalgoritmo
