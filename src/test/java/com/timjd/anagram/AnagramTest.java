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
    private String sentence;
    private String expected;

    @Before
    public void setUp() {
        anagram = new StringReverse();
    }

    @Test
    public void should_return_null_if_sentace_null() {
        // Given
        sentence = null;

        // When
        String result = anagram.getAnagram(sentence);

        // Then
        assertNull(result);
    }

    @Test
    public void should_return_anagram() {
        // Given
        setUpSentences("Java", "avaJ");

        // When
        String actual = anagram.getAnagram(sentence);

        // Then
        assertEquals(expected, actual);
    }

    @Test
    public void should_return_anagarma_with_space() {
        // Given
        setUpSentences("Anagram space", "marganA ecaps");

        // When
        String actual = anagram.getAnagram(sentence);

        // Then
        assertEquals(expected, actual);
    }

    @Test
    public void should_return_anagarma_with_two_spaces() {
        // Given
        setUpSentences("Anagram two space", "marganA owt ecaps");

        // When
        String actual = anagram.getAnagram(sentence);

        // Then
        assertEquals(expected, actual);
    }

    @Test
    public void  should_return_anagram_with_symbols() {
        // Given
        setUpSentences("Anagram!", "marganA!");

        // When
        String actual = anagram.getAnagram(sentence);

        // Then
        assertEquals(expected, actual);
    }

    @Test
    public void  should_not_apply_symbols() {
        // Given
        setUpSentences(" ,.!?@#$%^&*()-_=+<>/\\';:[]{}|~`\"", " ,.!?@#$%^&*()-_=+<>/\\';:[]{}|~`\"");

        // When
        String actual = anagram.getAnagram(sentence);

        // Then
        assertEquals(expected, actual);
    }

    public void setUpSentences(String sentence, String expected) {
        this.sentence = sentence;
        this.expected = expected;
    }
}