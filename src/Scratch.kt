

data class Assistant(val firstName:String,
                   val email:String,
                   val phoneNumber: String)

fun main(args: Array<String>) {
  val martha = Assistant("Martha Jones", "martha@torchwood.com", "07911 123456")
  println(martha)
  println(printAssistant(martha, ","))
  println(printAssistant(martha, separator = "|" ))

  connectToDb()
  connectToDb("mycomputer",username = "root", password = "")

}

fun printAssistant(asst: Assistant, separator: String = "|" ) : String {
  val (x,y,z) = asst
  return "name: $x $separator email: $y  $separator phone: $z"
}

//fun printAssistant(asst: Assistant, separator: String, x: String = "X") : String {
//  return "Printing assistant " + asst + x
//}

fun connectToDb(hostname: String = "localhost",
                username: String = "mysql",
                password:String = " ") {
}

class Big() {

  fun foo() {
    println("foo")
  }

  fun foo(name: String) {
    println("foo " + name )
  }

}