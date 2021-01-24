

object codeBlock extends App {
  val b1={
    val y=2
    val z=y+2
    if(z>2) "hi" else "bye"
  }
  println(b1)
  
  val b2={
    2<3
  }
  println(b2)
  
  val b3={
    if(b2) 2000 else 3000
    42
  } 
  println(b3)
  
  
}