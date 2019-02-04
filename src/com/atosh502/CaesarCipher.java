package com.atosh502;

public class CaesarCipher {

    private int shift;

    public CaesarCipher(){
        this.shift = 0;
    }

    public CaesarCipher(int sft){
        this.shift = sft;
    }

    public String encrypt(String pltxt){
        return encryptUtil(pltxt, shift);
    }

    public String encryptUtil(String pltxt, int shift){

        // ASCII from 32 to 126; total = 95

        shift = updateShift(shift);

        StringBuilder sbd = new StringBuilder();
        for (int i = 0; i < pltxt.length(); ++i){
            int enCh = (pltxt.charAt(i) + shift - 32) % 95 + 32;
            sbd.append((char) enCh);
        }

        return sbd.toString();
    }

    public String decryptUtil(String cphTxt, int shift){
        return encryptUtil(cphTxt, 95 - shift);
    }

    public String decrypt(String cphTxt){
        return encryptUtil(cphTxt, 95 - shift);
    }

    private int updateShift(int sft){
        while (sft < 0){
            sft += 95;
        }

        if (sft > 95){
            sft %= 95;
        }

        return sft;
    }
}
