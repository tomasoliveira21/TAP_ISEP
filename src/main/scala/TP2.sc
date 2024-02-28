import scala.annotation.tailrec

def somaNumeros(n: Int, inicio: Int): Int =
  @tailrec
  def looptr(i: Int, soma: Int): Int =
    if(i > n + inicio) soma
    else looptr(i + 1, soma + i)
  looptr(inicio, 0)

somaNumeros(2,3)

//utilizar desta forma, evitar o Reduce(funcao de baixo)
def somaNnumerosF(n: Int, inicio:Int): Int=
  (inicio to inicio + n).foldLeft(0)(_+_)

somaNnumerosF(50000,0)

def somaNnumerosFReduce(n: Int, inicio:Int)=
  (inicio to inicio + n).reduceOption(_+_)

somaNnumerosFReduce(50000,0)
somaNnumerosFReduce(-1,0)
