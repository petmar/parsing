# parsing
Solution for rp - find longest and shortest word in a sentence

## Linguistical Assumptions
1. The sentence word parser only works with the english alphabet
2. Split uses regular expression "\W+", matching all non-word characters
3. word characters are: [a-zA-Z_0-9]
4. Words might be anything that is at least one character long, and matches one of [a-zA-Z_0-9]
5. The parsing methods return the first shortest/longest word found, should there be several shortest/longest words in a sentence.

## Technical Assumptions
1. Both parsing methods return a String. Class String has a length field/property. By returning a String the length is implicitely returned.
2. The unit tests only test correctness of word/String.
3. The length of a word is not unit tested, as this is an implicit property of class String. Correctness of Java system library classes should not be unit tested.

## Run unit tests
1. Project is a simple maven project. So you need to have maven set up.
2. Run tests from command line: Open console or terminal, and navigate to the root folder of the project. Then execute this: mvn test
3. Or run tests from IDE of your choice.




