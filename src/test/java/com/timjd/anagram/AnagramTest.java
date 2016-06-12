package com.timjd.anagram;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * @author Timur Berezhnoi
 */
public class AnagramTest {

    private Anagram anagram;

    @Before
    public void setUp() {
        anagram = new StringReverse();
    }

    @Test
    public void should_return_null_if_sentace_null() {
        // Given
        String sentance = null;

        // When
        String result = anagram.getAnagram(sentance);

        // Then
        assertNull(result);
    }

    @Test
    public void should_return_anagram() {
        // Given
        String sentance = "Java";
        String expexted = "avaJ";

        // When
        String actual = anagram.getAnagram(sentance);

        // Then
        assertEquals(expexted, actual);
    }
}