package tlb.higherorder

fun main(args: Array<String>) {
  executor(doThis)
}

//val doThis:() -> Unit  = {
//  println("action")
//}

val doThis = {
  println("doThis")
}

fun executor(action:() -> Unit) {
  action.invoke()
}
