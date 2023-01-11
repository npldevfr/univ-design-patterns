package tp1.hash.methods

import tp1.hash.ICrypter

class Sha512Crypt: ICrypter {

    override fun invoke(message: String): String {
        return HashProgram("SHA-512").hash(message)
    }
}