

fun main(args: Array<String>) {

  var p1 = Person("John")
  var p2 = Person("John")

  if(p1 === p2) {
    println("p1 == p2")
  }

  var s1 = "Hello"
  var s2 = "Hello"

  if(s1 === s2) {
    println("s1 === s2")
  }
}

class Person(val name: String) {
  fun foo(){
    println(name)
  }
}