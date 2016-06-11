package com.timjd.anagram;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Timur Berezhnoi
 */
public class AnagramTest {

    private Anagram anagram;
    private String sentance;

    @Before
    public void setUp() {
        anagram = new StringReverse();
    }

    @Test
    public void should_return_null_if_sentace_null() {
        sentance = null;
        Assert.assertNull(anagram.getAnagram(sentance));
    }
}