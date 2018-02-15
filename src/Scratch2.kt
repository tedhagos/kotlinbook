package tlb


open class Person(val name: String) {

  internal val what: String = "The fuck"

  fun walk() = println("$name talking")
}

class Employee(name:String)  : Person(name) {

}

fun main(args: Array<String>) {
  var p: Person = Employee("John Doe")
  p.walk()
  println(p.what)
}