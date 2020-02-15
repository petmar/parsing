package sentence;

public class SentenceAnalyzer {
    // sentences containing comma
    // what about whitespace, and split, e.g. double, tabs, newline etc...
    // regular expression to split
    // words of same length, so first found of same length
    // Assumptions:
    // works only with english alphabet
    // my definition of a word is any String which is at least one word character long and is between non word characters
    // Ascii characters
    // I define words as all strings with at least one word character, only consisting of a sequence of 
    // 

    private static final String REGEX_NON_WORD_CHARACTER_ONE_OR_MORE = "\\W+";

    public static String getFirstLongestWord(String sentence) {
        String[] words = sentence.split(REGEX_NON_WORD_CHARACTER_ONE_OR_MORE);
        String longest = words[0];
        for (String word : words) {
            if (word.length() > longest.length())
                longest = word;
        }

        return longest;
    }

    public static String getFirstShortestWord(String sentence) {
        String[] words = sentence.split(REGEX_NON_WORD_CHARACTER_ONE_OR_MORE);
        String shortest = words[0];
        for (String word : words) {
            if (word.length() < shortest.length())
                shortest = word;
        }

        return shortest;
    }
}

