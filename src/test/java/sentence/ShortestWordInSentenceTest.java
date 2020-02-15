package sentence;

import org.junit.Test;
import sentence.SentenceAnalyzer;

import static org.junit.Assert.*;

public class ShortestWordInSentenceTest {

    @Test
    public void shouldReturnEmptyString() {
        String word = SentenceAnalyzer.getFirstShortestWord("");
        assertEquals("", word);
    }

    @Test
    public void shouldReturnFirstShortestWord() {
        String word = SentenceAnalyzer.getFirstShortestWord("The cow jumped over one moon.");
        assertEquals("The", word);
    }

    @Test
    public void shouldIgnorePunctuation() {
        String word = SentenceAnalyzer.getFirstShortestWord("The, cow jumped over the moon.");
        assertEquals("The", word);
    }

    @Test
    public void shouldNotReturnEmptyStringWhenSeveralNonWordCharactersInSequence() {
        String word = SentenceAnalyzer.getFirstShortestWord("The              cow jumped over a moon.");
        assertEquals("a", word);
    }

    @Test
    public void shouldTreatNumbersAsWords() {
        String word = SentenceAnalyzer.getFirstShortestWord("1.5 cows jumped over the moon.");
        assertEquals("1", word);
    }

}