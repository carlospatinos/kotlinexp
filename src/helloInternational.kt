fun main(args: Array<String>){
    val language = if (args.isEmpty()) "EN" else args[0]
    println(when (language) {
      "EN" -> "Hello"
      "FR" -> "Salut"
      "IT" -> "Ciao"
      "ES"  -> "Hola"
      else -> "Sorry, I dont have a greeting in $language yet"
    })
}