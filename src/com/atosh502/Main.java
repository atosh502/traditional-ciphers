package com.atosh502;

import com.sun.deploy.util.ArrayUtil;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import test.CaesarCipherTest;
import test.MonoalphSubsCipherTest;
import test.VigenereTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

//        String plntxt = "\"How you doing?\"";
        String plntxt = "I'm Batman.";

//        CaesarCipher cph = new CaesarCipher(49);
//        System.out.println("----------------------Caesar Cipher---------------------");
//        System.out.println("Plain text: " + plntxt);
//        System.out.println("Cipher text: " + cph.encrypt(plntxt));
//        System.out.println();

        Result result = JUnitCore.runClasses(VigenereTest.class, MonoalphSubsCipherTest.class, CaesarCipherTest.class);
        System.out.println(result.getFailures().toString());    // empty list means all tests passed...

        System.out.println("------Trying to break the Caesar Cipher: BruteForce------");
        BreakCaesar bc = new BreakCaesar();
        bc.findPlainText("&cJ\\~>QJ>Kj");   // breaks at 60 shift
        System.out.println();
    }
}
