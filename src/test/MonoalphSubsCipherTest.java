package test;

import com.atosh502.MonoalphSubsCipher;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class MonoalphSubsCipherTest {

    public MonoalphSubsCipherTest(){}

    @Test
    public void monoAlphabeticSubstitutionCipherTest(){
        MonoalphSubsCipher monoCph = new MonoalphSubsCipher();

        String plntxt = "I'm Batman.";
        String cipher = monoCph.encrypt(plntxt);
        assertEquals(plntxt, monoCph.decrypt(cipher), "Deciphered text and plain text must match");
    }

}