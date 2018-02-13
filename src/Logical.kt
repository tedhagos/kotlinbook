


fun main(args: Array<String>) {
  if (coo() && boo()) {
    println("boo and coo")
  }
}

fun boo() : Boolean {
  println("boo")
  return true
}

fun coo() : Boolean {
  println("coo")
  return false
}

