package tp1.hash

import tp1.hash.methods.MD5Crypt
import tp1.hash.methods.Sha256Crypt
import tp1.hash.methods.Sha512Crypt

fun main() {

    val stringToHash = "Mon Hash"

    // MD5
    val program = Program(MD5Crypt())
    println(program.crypt(stringToHash))

    // Sha512
    program.hash = Sha512Crypt()
    println(program.crypt(stringToHash))

    // Sha256
    program.hash = Sha256Crypt()
    println(program.crypt(stringToHash))






}