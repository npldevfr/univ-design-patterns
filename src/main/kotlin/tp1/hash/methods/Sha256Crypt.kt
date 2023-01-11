package tp1.hash.methods

import tp1.hash.ICrypter

class Sha256Crypt : ICrypter {

    override fun invoke(message: String): String {
        return HashProgram("SHA-256").hash(message)
    }
}