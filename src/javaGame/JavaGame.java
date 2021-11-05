package javaGame;

public class JavaGame {

    private int rows, characters, addedCharacters, words, addedWords;
    private String longestWord;

    public JavaGame() {
        rows = 0;
        characters = 0;
        addedCharacters = 0;
        words = 0;
        addedWords = 0;
        longestWord = "";
    }

    public int getRows() {
        return rows;
    }

    public void addRows(String addedSentence) {
        if (!addedSentence.equals("stop") && !addedSentence.equals("")) {
            rows++;
        }
    }

    public int getCharacters() {
        return characters;
    }
    public void addCharacters(String addedSentence) {

        if(addedSentence.contains("stop")) {
            int i = addedSentence.indexOf("stop");
            String subString = addedSentence.substring(0, i);
            addedCharacters = subString.length();
        } else {
            addedCharacters = addedSentence.length();
        }
        characters += addedCharacters;
    }

    public int getWords() {
        return words;
    }

    public void addWords(String addedSentence) {
        if(addedSentence.contains("stop") && !addedSentence.equals("stop")) {
            int i = addedSentence.indexOf("stop");
            addedSentence = addedSentence.substring(0, i);
            String[] splitSentence = addedSentence.split(" ");
            addedWords = splitSentence.length;
        } else if(addedSentence.equals("stop")) {
            addedWords = 0;
        } else {
            String[] splitSentence = addedSentence.split(" ");
            addedWords = splitSentence.length;
        }
        words += addedWords;
    }

    public String getLongestWord() {
        return longestWord;
    }

    public void findLongestWord(String addedSentence) {

        String trueStopSentence = addedSentence;
        //stopSentence = stopSentence.replaceAll("[^A-Za-z0-9]", " ");

        if(trueStopSentence.contains("stop")) {
            int i = trueStopSentence.indexOf("stop");
            trueStopSentence = trueStopSentence.substring(0, i);
            //System.out.println(trueStopSentence);
            addedSentence = trueStopSentence;
        }

        String[] splitWord = addedSentence.split(" "); //This is an array of the words in the sentence.
        String newLongestWord = "";

        for(String s : splitWord) {
            if(s.length() > newLongestWord.length()) {
                newLongestWord = s;
            }
            if(newLongestWord.length() > longestWord.length()) {
                longestWord = newLongestWord;
            }
        }

    }

}
