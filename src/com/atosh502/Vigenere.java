package com.atosh502;

import java.util.ArrayList;

public class Vigenere {

    private Character[][] ar;
    private ArrayList random;

    public Vigenere(){
        random = RandomListGenerator.generate();
        ar = new Character[random.size()][random.size()];

        for (int i = 0; i < random.size(); ++i){
            for (int j = 0; j < random.size(); ++j){
                ar[i][j] = (Character) random.get((i+j) % random.size());
            }
        }

//        for (int i = 0; i < random.size(); ++i){
//            for (int j = 0; j < random.size(); ++j){
//                System.out.print(ar[i][j] + " ");
//            }
//            System.out.println();
//        }
    }

    private String repeat(String s, int k){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; ++i){
            sb.append(s);
        }
        return sb.toString();
    }

    private String updateKeyLength(String plnTxt, String key){
        if (plnTxt.length() <= key.length()){
            return key;
        }

        int keyLen = key.length();
        int txtLen = plnTxt.length();

        int rem = txtLen % keyLen;
        int quo = txtLen / keyLen;

        StringBuilder keyBuilder = new StringBuilder();
        keyBuilder.append(repeat(key, quo));
        keyBuilder.append(key.substring(0, rem));

        return keyBuilder.toString();
    }

    public String encrypt(String plnTxt, String key){
        key = updateKeyLength(plnTxt, key);

        StringBuilder encBuilder = new StringBuilder();
        for (int i = 0; i < plnTxt.length(); ++i){
            char plnChar = plnTxt.charAt(i);
            char keyChar = key.charAt(i);

            int keyIdx = random.indexOf(keyChar); // row number
            int plnIdx = random.indexOf(plnChar); // col number

            encBuilder.append(ar[keyIdx][plnIdx]);
        }

        return encBuilder.toString();
    }

    public String decrypt(String cphTxt, String key){
        key = updateKeyLength(cphTxt, key);

        StringBuilder decBuilder = new StringBuilder();
        for (int i = 0; i < cphTxt.length(); ++i){
            char keyChar = key.charAt(i);
            char cphChar = cphTxt.charAt(i);

            int keyIdx = random.indexOf(keyChar); // row number
            int plnIdx = 0;
            for (int j = 0; j < random.size(); ++j){
                if (ar[keyIdx][j].equals(cphChar)){
                    plnIdx = j;
                    break;
                }
            }
            decBuilder.append(random.get(plnIdx));
        }

        return decBuilder.toString();
    }
}
