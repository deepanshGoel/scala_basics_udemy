

object curry extends App {
   def n_divides_m(n: Int)(m: Int): Boolean = n % m == 0
   println(n_divides_m(4)(2))

  def is_even(n: Int) = n_divides_m(n)(2)

  println(is_even(5)) 
  println(is_even(6))

  def is_odd(n: Int) = !n_divides_m(n)(2)

  println(is_odd(5))
  println(is_odd(6))

}

//true
//false
//true
//true
//false