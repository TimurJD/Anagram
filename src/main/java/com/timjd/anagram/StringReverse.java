package com.timjd.anagram;

import java.util.StringTokenizer;

/**
 * @author Timur Berezhnoi
 * @see Anagram
 */
class StringReverse implements Anagram {

    private static final String DELIMITERS = " ,.!?@#$%^&*()-_=+<>/\\';:[]{}|~`\"";

    /**
     * Reverse string without applying delimiters.
     *
     * @param sentence sentence to be reversed
     * @return sentence or null if passed parametrs is null
     */
    public String getAnagram(String sentence) {
        if(sentence == null) {
            return null;
        }

        String result = "";

        StringTokenizer token = new StringTokenizer(sentence, DELIMITERS, true);
        while(token.hasMoreTokens()) {
            result += new StringBuffer(token.nextToken()).reverse();
        }

        return result;
    }
}