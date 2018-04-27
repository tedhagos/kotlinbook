package tlb.classes

class Person {
  val email: String = ""
  var name: String = ""
    set(value){
      field = value + " Jane Doe"
    }

  val isHomo: Boolean
    get() {
      return true
    }
}

fun main(args: Array<String>) {
  var p = Person()
  p.name = "John Doe"
  println(p.name)
  println(p.isHomo)
}
