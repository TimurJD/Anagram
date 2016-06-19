package com.timjd.anagram;

import java.util.StringTokenizer;

/**
 * @author Timur Berezhnoi
 * @see Anagram
 */
class StringReverse implements Anagram {

    public static final String DELIMITERS = " ";

    public String getAnagram(String sentence) {
        if(sentence == null) {
            return null;
        }

        String result = "";

        StringTokenizer token = new StringTokenizer(sentence, DELIMITERS, true);
        while (token.hasMoreTokens()){
            result += new StringBuffer(token.nextToken()).reverse();
        }

        return result;
    }
}