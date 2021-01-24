

object formating extends App {
  val a = 1000.55555f
  println(s"total is $a")
  println(f"total is $a%2.1f")
  //raw prints symbols within string 
  println(raw"total is $a%.4f")
  //way2
  println(s"Total is $a%.")
  
}

//total is 1000.55554
//total is 1000.6
//total is 1000.55554%.4f
//Total is 1000.55554%.