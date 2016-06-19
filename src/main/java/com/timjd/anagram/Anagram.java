package com.timjd.anagram;

/**
 * @author Timur Berezhnoi
 */
interface Anagram {

    /**
     * Reverse string without applying delimiters.
     *
     * @param sentence sentence to be reversed
     * @return sentence or null if passed parametrs is null
     */
    String getAnagram(String sentence);
}