package tp1.hash.methods

import tp1.hash.ICrypter

class MD5Crypt: ICrypter {

    override fun invoke(message: String): String {
        return HashProgram("MD5").hash(message)
    }
}