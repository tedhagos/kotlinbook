package tlb.lambda

fun main(args: Array<String>) {
  executor({ arg:String ->
    println("Hello $arg")
  })
}


fun executor(foo:(m:String) -> Unit) {
  println("begin")
  foo("World")
  println("end")
}