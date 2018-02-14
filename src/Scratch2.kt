package tlb

fun main(args: Array<String>) {
  println("The quick brown fox".homerify())
}

fun String.homerify() : String {
  return "$this -- woohoo!"
}


//
//fun main(args: Array<String>) {
//  val p = Employee("John")
//  p saySomething "ano yon"
//  println("That would be rude".Chantho())
//}
//
//class Employee(val name: String) {
//
//  infix fun saySomething(msg: String) {
//    println(" ${this.toString()} saying $msg")
//  }
//
//  override fun toString() : String {
//    return this.name
//  }
//}
//
//fun String.Chantho() : String {
//  return "Chan, $this, tho"
//}