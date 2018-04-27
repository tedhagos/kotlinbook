package tlb.lambda

fun main(args: Array<String>) {
  executor({
    it:String -> println(it)
  })
}


fun executor(m:(args:String) -> Unit) {
  m(args)
}