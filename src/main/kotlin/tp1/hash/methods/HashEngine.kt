package tp1.hash.methods

import java.security.MessageDigest


class HashProgram(engine: String) {

    private val hash = MessageDigest.getInstance(engine)

    fun hash(string: String): String {
        return hash.digest(string.toByteArray()).joinToString("") { "%02x".format(it) }
    }

}