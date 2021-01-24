object Expressions extends App {
  println(1+2)  //3
  val a=12;val b=13
  println(s"$a+$b")  //12+13
  println(s"$a"+s"$b")  //1213
  val c = s"$a" + s"$b"
  println(c)  //1213
  println(s"$c")  //1213
  println(a+b)  //25
  println(a+5)  //17
  
  println(12==a)    //true
  
  var i=0
  while(i<3){
    println(i)
    i+=1
    }            // 0 1 2
  
  val a5 = (i=9)
  println(a5)    //()
  
}