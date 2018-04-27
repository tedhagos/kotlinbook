package tlb.higherorder

fun main(args: Array<String>) {
  executioner(doThis)
}

//val doThis:() -> Unit  = {
//  println("action")
//}

val doThis = {
  println("doThis")
}

fun executioner(action:() -> Unit) {
  action.invoke()
}
