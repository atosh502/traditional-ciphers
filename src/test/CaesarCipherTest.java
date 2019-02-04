package test;

import com.atosh502.CaesarCipher;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CaesarCipherTest {

    public CaesarCipherTest(){}

    @Test
    public void encryptTest() {
        CaesarCipher cph = new CaesarCipher(49);
        assertEquals("SyAIQKAGQ6A;@9pS", cph.encrypt("\"How you doing?\""), "Encryption test");
    }

    @Test
    public void decryptTest(){
        CaesarCipher cph = new CaesarCipher(345);
        assertEquals("I'm Batman.", cph.decrypt("&cJ\\~>QJ>Kj"), "Decryption test");
    }
}