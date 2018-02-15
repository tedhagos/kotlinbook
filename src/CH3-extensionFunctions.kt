

fun main(args: Array<String>) {
  val msg = "My name is Maximus Decimus Meridius"
//  println(homerify(msg))
//  println(chanthofy(msg))
//  println(terminatorify(msg))

//  val util = StringUtil()
//  println(util.homerify(msg))
//  println(util.chanthofy(msg))
//  println(util.terminatorify(msg))

  println(msg.homerify())

}

fun String.homerify() = "$this -- woohoo!"

//class StringUtil {
//  fun homerify(msg: String) = "$msg -- woohoo!"
//  fun chanthofy(msg:String) = "Chan, $msg , tho"
//  fun terminatorify(msg: String) = "$msg -- I'll be back"
//}
//
//fun homerify(msg: String) = "$msg -- woohoo!"
//fun chanthofy(msg:String) = "Chan, $msg , tho"
//fun terminatorify(msg: String) = "$msg -- I'll be back"

