




//fun main(args: Array<String>) {
//  var a = 12
//  var b = 10
//  var rem = 1
//
//  while ((rem = a % b) != 0) {
//    a = b
//    b = rem
//  }
//  println(b)
//}

fun main(args: Array<String>) {

  var a = 12
  var b = 10
  var rem = 1
  var foundGcf = false

  while(!foundGcf) {
    rem = a % b
    if (rem !=  0) {
      a = b
      b = rem
    }
    else {
      foundGcf = true
    }
  }
  println(b)
}

