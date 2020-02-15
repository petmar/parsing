package sentence;

import org.junit.Test;
import sentence.SentenceAnalyzer;

import static org.junit.Assert.*;

public class ShortestWordInSentenceTest {

    @Test
    public void shouldReturnEmptyStringWhenSentenceEmpty() {
        String word = SentenceAnalyzer.getFirstShortestWord("");
        assertEquals("", word);
    }

    @Test
    public void shouldReturnFirstShortestWordWhenSeveralWordsSameLength() {
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
        String word = SentenceAnalyzer.getFirstShortestWord("12.5 cows jumped over the moon.");
        assertEquals("5", word);
    }

    @Test
    public void shouldTreatUnderscoreAsWordCharacter() throws Exception {
        String word = SentenceAnalyzer.getFirstShortestWord("The cows jumped over the @???_&&**@ moon.");
        assertEquals("_", word);
    }

}