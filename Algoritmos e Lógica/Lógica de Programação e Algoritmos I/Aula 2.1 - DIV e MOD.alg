algoritmo "MOD e DIV"

var
   x, y: inteiro
   w: real
  //real, porque se fizer uma divisão, pode dar número quebrado.
  a, b, c: inteiro

inicio
      x <- 10
      y <- 2
      w <- x / y
      EscrevaL(w)
      
      a <- 10
      b <- 3
      c <- a DIV b
      EscrevaL(c)
      //o DIV pega APENAS a parte inteira da divisão.
      
      //MOD é a mesma coisa que usar %
      se x % 2 = 0 entao
         EscrevaL("Numero par")
      senao
           Escreval("Numero impar")
      fimse
      

fimalgoritmo
