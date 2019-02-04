package com.atosh502;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RandomListGenerator {

    private static Character[] toCharacterArray(String s) {

        if (s == null) {
            return null;
        }

        int len = s.length();
        Character[] array = new Character[len];
        for (int i = 0; i < len ; i++) {
            array[i] = s.charAt(i);
        }

        return array;
    }

    public static ArrayList generate(){

        ArrayList<Character> charArray = new ArrayList<>();
        for (int i = 32; i < 127; ++i){
            charArray.add((char)i);
        }

        Collections.shuffle(charArray);
        return charArray;
    }
}
