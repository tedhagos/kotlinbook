

fun main(args: Array<String>) {

  val str = "The quick brown fox"
  for (i in str) println(i)

  val a = String(arrayOf('a','b').toCharArray())


  var rawStr = """ Amy Pond, there’s something you’d
    better understand about me ‘cause it’s important,
    and one day your life may depend on it:
    I am definitely a mad man with a box!
    """

  var i = 10;
  var j = i.toString() + ""
  var x = 10.toString()
  println(x)

  println(str[2])

  var name = "John Doe"
  var email = "john.doe@gmail.com"
  var phone = "(01)777-1234"
  System.out.printf("Hello %s\n", name)
  println("Hello $name")

  var concat = "name: $name | email: $email | phone: $phone"
  println(concat)

  var concatToo = String.format("name: %s | email: %s | phone: %s", name, email, phone)
  println(concatToo)

  println("Hello ${foo()}")

  var temp = "Hello world"
  println("The string '$temp' is ${temp.length} characters long")

}

fun foo(): String {
  return "Boo"
}



