object for_attr extends App{
  // attributes of for loop
  for(i <- 1 to 5) println(i)
  println("-------------")
  for(i <- 1 until 5) println(i)
  println("-------------")
  for(i <- 1 to 10 by 2) println(i)
  
  //for with condition
  println("-------------")
  for(i <- 1 to 6 if(i%2==0)) println(i)
  println("-------------")
  
  //yield
  val a1 = for (i <- 1 to 6 if (i % 2 == 0)) yield (i)
  println(a1)
  println("-------------")
  val a2 = for (i <- 1 to 6) yield { if (i % 2 == 0) i }
  println(a2)
  println("-------------")
  
  //nested looping
  for (i <- 1 to 2; j <- 3 to 4)
    println(s"i=$i, j=$j")

}