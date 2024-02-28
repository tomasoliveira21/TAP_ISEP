//Exercice 1

println("---------------------------- Exercicio 1 ----------------------------")
def lessThan(x: Int, y:Int): Boolean = {
 x < y
}
lessThan(1,2)
lessThan(2,1)

println("---------------------------- Exercicio 2 ----------------------------")
def and(x: Boolean, y:Boolean): Boolean = {
 if(x) y else false
}

and(true, true)
and(true, false)
and(false, true)
and(false, false)

def or(x: Boolean, y:Boolean): Boolean = {
 if(x) true else y
}

or(true, true)
or(true, false)
or(false, true)
or(false, false)

println("---------------------------- Exercicio 3 ----------------------------")
def sumDown(x: Int, sum: Int): Int = {
 if (x <= 0) sum
 else sumDown(x - 1, sum + x)
}

sumDown(5,0)

println("---------------------------- Exercicio 4 ----------------------------")
def nSymbol(i: Int, c: Char, s: String) : String = {
 if (i <= 0) s
 else nSymbol(i - 1, c, s + c)
}

nSymbol(5,'*',"")
nSymbol(2,'#',"")
nSymbol(3,'?',"")
nSymbol(10,'+',"")
nSymbol(1,'!',"")

println("---------------------------- Exercicio 5 ----------------------------")
def mult(x: Int, y: Int): Int = {
 if (x == 0 || y == 0) {
  0
 } else if (x < 0 && y < 0) {
  -y - mult(x + 1, -y)
 } else if (x < 0) {
  -y + mult(x + 1, y)
 } else y + mult(x - 1, y)
}

mult(4, 3)
/*
= 3 + mult(3, 3)
= 3 + (3 + mult(2, 3))
= 3 + (3 + (3 + mult(1, 3)))
= 3 + (3 + (3 + (3 + mult(0, 3))))
= 3 + (3 + (3 + (3 + 0)))
= 3 + (3 + (3 + 3))
= 3 + (3 + 6)
= 3 + 9
= 12
*/
mult(0, 0)
/*
= 0
*/
mult(0, 1)
/*
= 0
*/
mult(1, 0)
/*
= 0
*/
mult(-3, -3)
/*
= -3 + mult(-2, -3)
= -3 - 3 + mult(-1, -3)
= -3 - 3 - 3 + mult(0, -3)
= -3 - 3 - 3 - 3 + 0
= 9
*/
mult(-3, 4)
/*
= -4 + mult(-2, 4)
= -4 + (-4 + mult(-1, 4))
= -4 + (-4 + (-4 + mult(0, 4)))
= -4 + (-4 + (-4 + 0))
= -4 + (-4 + (-4))
= -4 + (-8)
= -12
*/
mult(3, -4)
/*
= -4 + mult(2, -4)
= -4 + (-4 + mult(1, -4))
= -4 + (-4 + (-4 + mult(0, -4)))
= -4 + (-4 + (-4 + 0))
= -4 + (-4 + (-4))
= -4 + (-8)
= -12
*/

println("---------------------------- Exercicio 6 ----------------------------")
