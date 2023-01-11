package tp1.hash

import tp1.hash.methods.MD5Crypt
import kotlin.test.Test
import kotlin.test.assertEquals

class ProgramTest {

    @Test
    fun crypt() {
        val program = Program(MD5Crypt())
        assertEquals("098f6bcd4621d373cade4e832627b4f6", program.crypt("test"))
    }
}