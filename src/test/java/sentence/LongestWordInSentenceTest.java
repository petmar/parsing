package sentence;

import org.junit.Test;
import sentence.SentenceAnalyzer;

import static org.junit.Assert.*;

public class LongestWordInSentenceTest {

    @Test
    public void shouldReturnEmptyString() throws Exception {
        String word = SentenceAnalyzer.getFirstLongestWord("");
        assertEquals("", word);
    }

    @Test
    public void shouldReturnFirstLongestWord() throws Exception {
        String word = SentenceAnalyzer.getFirstLongestWord("The bigger cows jumped over the moon.");
        assertEquals("bigger", word);
    }

    @Test
    public void shouldIgnorePunctuation() throws Exception {
        String word = SentenceAnalyzer.getFirstLongestWord("The cow jumped, over the moon");
        assertEquals("jumped", word);
    }

    @Test
    public void shouldHandleSubsequentNonWordCharacters() throws Exception {
        String word = SentenceAnalyzer.getFirstLongestWord("The              cow jumped over a moon");
        assertEquals("jumped", word);
    }

    @Test
    public void shouldTreatNumbersAsWords() throws Exception {
        String word = SentenceAnalyzer.getFirstLongestWord("7777777 cows jumped over the moon.");
        assertEquals("7777777", word);
    }

    @Test
    public void shouldTreatApostrophesAsNonWordCharacter() throws Exception {
        String word = SentenceAnalyzer.getFirstLongestWord("Baird's cows jumped over the moon.");
        assertEquals("jumped", word);
    }
}