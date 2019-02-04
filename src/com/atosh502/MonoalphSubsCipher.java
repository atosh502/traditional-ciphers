package com.atosh502;

import java.util.ArrayList;

public class MonoalphSubsCipher {

    private ArrayList plnAr;
    private ArrayList cphAr;

    public MonoalphSubsCipher(){
        this.plnAr = RandomListGenerator.generate();
        this.cphAr = RandomListGenerator.generate();
    }

    public MonoalphSubsCipher(ArrayList plnAr, ArrayList cphAr){
        assert plnAr.size() == cphAr.size(): "length of cipher text and plain text must match";
        this.plnAr = plnAr;
        this.cphAr = cphAr;
    }

    public String encryptUtil(String plnTxt, ArrayList plnAr, ArrayList cphAr){

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < plnTxt.length(); ++i){
            char c = plnTxt.charAt(i);
            int idx = plnAr.indexOf(c);
            sb.append(cphAr.get(idx));
        }
        return sb.toString();
    }

    public String encrypt(String plnTxt){
        return encryptUtil(plnTxt, plnAr, cphAr);
    }

    public String decrypt(String cphTxt){
        return encryptUtil(cphTxt, cphAr, plnAr);
    }

    public String decrypt(String cphTxt, ArrayList plnAr, ArrayList cphAr){
        return encryptUtil(cphTxt, cphAr, plnAr);
    }
}
