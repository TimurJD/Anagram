package com.timjd.anagram;

import java.util.StringTokenizer;

/**
 * @author Timur Berezhnoi
 */
class StringReverse implements Anagram {

    public String getAnagram(String sentance) {
        if(sentance == null) {
            return null;
        }

        String result = "";

        StringTokenizer token = new StringTokenizer(sentance);
        while (token.hasMoreTokens()){
            result += new StringBuffer(token.nextToken()).reverse();
        }

        return result;
    }
}