

data class Assistant(val firstName:String,
                   val email:String,
                   val phoneNumber: String)

fun main(args: Array<String>) {
  val martha = Assistant("Martha Jones", "martha@torchwood.com", "07911 123456")
  println(martha)
  println(printAssistant(martha, ","))
}

fun printAssistant(asst: Assistant, separator: String = "|" ) : String {
  val (x,y,z) = asst
  return "name: $x $separator email: $y  $separator phone: $z"
}