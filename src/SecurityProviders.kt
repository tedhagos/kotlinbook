import java.security.Provider
import java.security.Security


fun main(args: Array<String>) {

  val providers = getProviders()

  for (i in providers) {
    println(i.name)
    i.forEach { key, value -> println("\t$key : $value")}
  }
}

fun getProviders() : List<Provider> {
  val providers = Security.getProviders()
  return providers.asList()
}