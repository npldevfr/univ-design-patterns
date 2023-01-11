package tp1.hash

class Program(var hash: ICrypter) {

    fun crypt(message: String): String {
        return hash(message)
    }
}