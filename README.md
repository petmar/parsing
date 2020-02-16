# parsing
Solution for rp - find longest and shortest word in a sentence

## Linguistical Assumptions
1. The sentence word parser only works with the english alphabet
2. Split method uses regular expression "\W+", matching all non-word characters, one or more occurrences.
3. Word characters are: [a-zA-Z_0-9]
4. So words are all strings that are at least one character long, where each character matches one of [a-zA-Z_0-9]
5. The parsing methods return the first shortest/longest word found, should there be several shortest/longest words of the same length in a sentence.

## Technical Assumptions
1. In Java it's not as straight forward as in other programming languages to return multiple values from a method. Possible ways to return the word and the length, to name a few, are: a String (has length property), a custom class to hold two values (Tuple2 implementations are also available as third party libraries), an array (can only hold same data type) , a Map (e.g HashMap<String, Integer>).
2. Both parsing methods return a String. Class String has a length field/property. By returning a String the length is implicitely returned.
3. As a consequence, the unit tests only test that the correct shortest/longest word has been returned. Testing the length property of Java's class Stirng is unnecessary.

## Run unit tests
1. Project is a simple maven project. You need to have maven set up on your machine: E.g. see installation instructions here (no guarantee that it works on your system): https://www.baeldung.com/install-maven-on-windows-linux-mac
2. Run tests from command line: Open console or terminal, and navigate to the root folder of the project. Then execute this: mvn test
3. Or run tests from IDE of your choice. You can run each unit test class in isolation, or again with maven (configure your IDE accordingly).
