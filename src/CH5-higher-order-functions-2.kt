package tlb.higherorder2


fun main(args: Array<String>) {
  executioner(::doThis)
}

val foo:()-> Unit = {
  for (i in 0..100) {
    println("foo : $i")
  }
}

fun boo() {
  println("boo")
}

fun doWork(action: () -> Unit) {
  println("Beginning")
  action()
  println("ending")
}

fun doThis() {
  println ("action function")
}

//val doThis:() -> Unit  = {
//  println("action property")
//}

fun executioner(action:() -> Unit) {
  action.invoke()
}