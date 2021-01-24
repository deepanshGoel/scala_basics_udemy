

object multiline extends App {
   val mL =
    "This is the next line."
   val mL1 =
     "next \n line"
   val mL2 = """
   This is a multiline String.
   Starts and ends at different lines.
   """
   val mL3 = """
   |This is a multiline String.
   |Starts and ends at different lines.
   """.stripMargin('|')
   println(mL+"\n\n"+mL1+"\n"+mL2+"\n"+mL3)
}