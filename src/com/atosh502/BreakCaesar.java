package com.atosh502;

public class BreakCaesar {

    public void findPlainText(String cphText){

        CaesarCipher cph = new CaesarCipher();

        // brute force for all shift values from 0 to 95
        for (int i = 0; i < 95; ++i){
            System.out.println("Plaintext: " + cph.decryptUtil(cphText, i) + " Shift: " + i );
        }
    }
}
