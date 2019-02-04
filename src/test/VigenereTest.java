package test;

import com.atosh502.Vigenere;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VigenereTest {

    public VigenereTest(){}

    @Test
    public void testVigenere(){
        Vigenere vig = new Vigenere();
        String plain = "Hakuna Matata";
        String key = "moomin";
        assertEquals(plain, vig.decrypt(vig.encrypt(plain, key), key), "Encrypted and decrypted strings must match");
    }

}