import scala.annotation.tailrec

val c1 = 1

val c2: Int = 3

2 + c1

34 * 90

def square(x: Int): Int = x * x

square(c2)

def lessThan(a: Int, b: Int): Boolean = {
  a < b
}

println(lessThan(5, 10))
println(lessThan(15, 5))


def and(x: Boolean, y: Boolean): Boolean = {
  if (x) y else false
}

def or(x: Boolean, y: Boolean): Boolean = {
  if (x) true else y
}

assert(and(true, true)==true)
assert(and(true, false)==false)
assert(and(false, true)==false)
assert(and(false, false)==false)
assert(or(false, false)==false)
assert(or(true, true)==true)
assert(or(true, false)==true)
assert(or(false, true)==true)
println("tests passed")

def sumDown(x: Int, sum: Int): Int = {
  if (x <= 0) sum
  else sumDown(x - 1, sum + x)
}

println(sumDown(5,0) == 15)


def nSymbol(i: Int, c: Char, s: String) : String = {
  if (i <= 0) s
  else nSymbol(i - 1, c, s + c)
}

assert(nSymbol(5, '*', "") == "*****")
nSymbol(5, '*', "")


def mult(x: Int, y: Int): Int = {
  if (x == 0 || y == 0) 0
  else if (y > 0) x + mult(x, y - 1)
  else -mult(x, -y)
}

assert(mult(4, 3) == 12)
assert(mult(0, 0) == 0)
assert(mult(0, 1) == 0)
assert(mult(1, 0) == 0)
assert(mult(-3, -3) == 9)
assert(mult(-3, 4) == -12)
assert(mult(3, -4) == -12)

//funcao do stor
def mult2(A: Int, B: Int): Int = {
  if (A == 0) {
    0
  }
  else if (A < 0) {
    -B - mult(A + 1, B)
  } else B + mult(A - 1, B)
}

assert(mult2(4, 3) == 12)
assert(mult2(0, 0) == 0)
assert(mult2(0, 1) == 0)
assert(mult2(1, 0) == 0)
assert(mult2(-3, -3) == 9)
assert(mult2(-3, 4) == -12)
assert(mult2(3, -4) == -12)

//funcao do stor tailRec
def mult3 (A: Int, B:Int): Int = {
  @tailrec
  def Mult_TR(A: Int, B: Int, acum: Int): Int = {
    if (a == 0) acum
    else if (a < 0) Mult_TR(A + 1, -B, -B - ACUM)
    else Mult_TR(A + 1, B, ACUM + B)
  }
  Mult_TR(A,B,0)
  }



