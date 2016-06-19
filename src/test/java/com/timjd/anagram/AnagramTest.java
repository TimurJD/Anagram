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
        String sentence = null;

        // When
        String result = anagram.getAnagram(sentence);

        // Then
        assertNull(result);
    }

    @Test
    public void should_return_anagram() {
        // Given
        String sentence = "Java";
        String expexted = "avaJ";

        // When
        String actual = anagram.getAnagram(sentence);

        // Then
        assertEquals(expexted, actual);
    }

    @Test
    public void should_return_anagarma_with_space() {
        // Given
        String sentence = "Anagram space";
        String expected = "marganA ecaps";

        // When
        String actual = anagram.getAnagram(sentence);

        // Then
        assertEquals(expected, actual);
    }

    @Test
    public void should_return_anagarma_with_two_spaces() {
        // Given
        String sentence = "Anagram two space";
        String expected = "marganA owt ecaps";

        // When
        String actual = anagram.getAnagram(sentence);

        // Then
        assertEquals(expected, actual);
    }
}