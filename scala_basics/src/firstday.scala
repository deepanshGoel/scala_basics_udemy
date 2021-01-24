

object firstday extends App {
  println("variable declarartion")
  val ab:Int= 25
  val ab1=24
  println(ab+"\t"+ab1)
  
  val str1:String="testing peace"
  var str2=str1
  println(str2)  //testing peace
  str2=str1 + " and harmony " + str2
  println(str2)  //testing peace and harmony testing peace
  var ab2=10
  ab2=ab2*12
  println(ab2)  //120
  
  val t="Tcs"
  val t2=s"$t is tata"
  println(t2) //Tcs is tata
  
  //val vs var
  var x=100
  x=x-(5*2)
  println(x)
}