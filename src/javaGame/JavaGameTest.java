package javaGame;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JavaGameTest {

    @Test
    public void testGetRows() {

        //Arrange
        JavaGame myJavaGame = new JavaGame();

        //Act
        int actual = myJavaGame.getRows();

        //Assert
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void testAddRowsWhenAddingEmptyString() {

        //Arrange
        JavaGame myJavaGame = new JavaGame();

        //Act
        String addedSentence = "";
        myJavaGame.addRows(addedSentence);
        int actual = myJavaGame.getRows();

        //Assert
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void testAddRowsWhenAddingOneCharacterString() {

        //Arrange
        JavaGame myJavaGame = new JavaGame();

        //Act
        String addedSentence = "i";
        myJavaGame.addRows(addedSentence);
        int actual = myJavaGame.getRows();

        //Assert
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void testAddRowsWhenAddingStop() {

        //Arrange
        JavaGame myJavaGame = new JavaGame();

        //Act
        String addedSentence = "stop";
        myJavaGame.addRows(addedSentence);

        int actual = myJavaGame.getRows();

        //Assert
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void testAddRowsWhenAddingASentenceIncludingStop() {

        //Arrange
        JavaGame myJavaGame = new JavaGame();

        //Act
        String addedSentence = "hej stop";
        myJavaGame.addRows(addedSentence);

        int actual = myJavaGame.getRows();

        //Assert
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void testAddRowsWhenAddingMultipleRowsAndASentenceIncludingStop() {

        //Arrange
        JavaGame myJavaGame = new JavaGame();

        //Act
        String addedSentence = "Hello?";
        myJavaGame.addRows(addedSentence);
        addedSentence = "Buy, stop";
        myJavaGame.addRows(addedSentence);

        int actual = myJavaGame.getRows();

        //Assert
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    public void testGetCharacters() {

        //Arrange
        JavaGame myJavaGame = new JavaGame();

        //Act
        int actual = myJavaGame.getCharacters();

        //Assert
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void testAddCharactersEmptyString() {

        //Arrange
        JavaGame myJavaGame = new JavaGame();

        //Act
        String addedSentence = "";

        myJavaGame.addCharacters(addedSentence);
        int actual = myJavaGame.getCharacters();

        //Assert
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void testAddCharactersWhiteSpace() {

        //Arrange
        JavaGame myJavaGame = new JavaGame();

        //Act
        String addedSentence = " ";

        myJavaGame.addCharacters(addedSentence);
        int actual = myJavaGame.getCharacters();

        //Assert
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void testAddCharactersOneCharacter() {

        //Arrange
        JavaGame myJavaGame = new JavaGame();

        //Act
        String addedSentence = "H";

        myJavaGame.addCharacters(addedSentence);
        int actual = myJavaGame.getCharacters();

        //Assert
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void testAddCharactersOneSentence() {

        //Arrange
        JavaGame myJavaGame = new JavaGame();

        //Act
        String addedSentence = "Hello";

        myJavaGame.addCharacters(addedSentence);
        int actual = myJavaGame.getCharacters();

        //Assert
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    public void testAddCharactersStop() {

        //Arrange
        JavaGame myJavaGame = new JavaGame();

        //Act
        String addedSentence = "stop";
        myJavaGame.addCharacters(addedSentence);

        int actual = myJavaGame.getCharacters();

        //Assert
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void testAddCharactersBeforeLowerCaseStop() {

        //Arrange
        JavaGame myJavaGame = new JavaGame();

        //Act
        String addedSentence = "Hej stop,";
        myJavaGame.addCharacters(addedSentence);

        int actual = myJavaGame.getCharacters();

        //Assert
        int expected = 4;

        assertEquals(expected, actual);
    }

    @Test
    public void testAddCharactersSpecialCharacters() {

        //Arrange
        JavaGame myJavaGame = new JavaGame();

        //Act
        String addedSentence = "&&%¤";
        myJavaGame.addCharacters(addedSentence);

        int actual = myJavaGame.getCharacters();

        //Assert
        int expected = 4;

        assertEquals(expected, actual);
    }

    @Test
    public void testAddCharactersBeforeUpperCaseSTOP() {

        //Arrange
        JavaGame myJavaGame = new JavaGame();

        //Act
        String addedSentence = "Hej STOP";
        addedSentence = addedSentence.toLowerCase();
        myJavaGame.addCharacters(addedSentence);

        int actual = myJavaGame.getCharacters();

        //Assert
        int expected = 4;

        assertEquals(expected, actual);
    }

    @Test
    public void testAddCharactersBeforeMixedCaseStop() {

        //Arrange
        JavaGame myJavaGame = new JavaGame();

        //Act
        String addedSentence = "Hej Stop";
        addedSentence = addedSentence.toLowerCase();
        myJavaGame.addCharacters(addedSentence);

        int actual = myJavaGame.getCharacters();

        //Assert
        int expected = 4;

        assertEquals(expected, actual);
    }

    @Test
    public void testGetWords() {

        //Arrange
        JavaGame myJavaGame = new JavaGame();

        //Act
        int actual = myJavaGame.getWords();

        //Assert
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void testAddWordsEmptyString() {

        //Arrange
        JavaGame myJavaGame = new JavaGame();

        //Act
        String addedSentence = " ";
        myJavaGame.addWords(addedSentence);

        int actual = myJavaGame.getWords();

        //Assert
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void testAddWordsDoubleQuotes() {

        //Arrange
        JavaGame myJavaGame = new JavaGame();

        //Act
        String addedSentence = "";
        myJavaGame.addWords(addedSentence);

        int actual = myJavaGame.getWords();

        //Assert
        int expected = 1;

        assertEquals(expected, actual);
    }


    @Test
    public void testAddWordsOneSentence() {

        //Arrange
        JavaGame myJavaGame = new JavaGame();

        //Act
        String addedSentence = "What's your name?";
        myJavaGame.addWords(addedSentence);

        int actual = myJavaGame.getWords();

        //Assert
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    public void testNotToAddTheWordSTOP() {

        //Arrange
        JavaGame myJavaGame = new JavaGame();

        //Act
        String addedSentence = "stop";
        myJavaGame.addWords(addedSentence);

        int actual = myJavaGame.getWords();

        //Assert
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void testNotToAddTheWordSTOPMixedCases() {

        //Arrange
        JavaGame myJavaGame = new JavaGame();

        //Act
        String addedSentence = "sToP";
        addedSentence = addedSentence.toLowerCase();
        myJavaGame.addWords(addedSentence);

        int actual = myJavaGame.getWords();

        //Assert
        int expected = 0;

        assertEquals(expected, actual);
    }


    @Test
    public void testAddWordsTwoSentences() {

        //Arrange
        JavaGame myJavaGame = new JavaGame();

        //Act
        String addedSentence = "What's your name?";
        myJavaGame.addWords(addedSentence);

        addedSentence = "My name is Jennifer";
        myJavaGame.addWords(addedSentence);

        int actual = myJavaGame.getWords();

        //Assert
        int expected = 7;

        assertEquals(expected, actual);
    }

    @Test
    public void testGetLongestWord() {

        //Arrange
        JavaGame myJavaGame = new JavaGame();

        //Act
        String actual = myJavaGame.getLongestWord();

        //Assert
        String expected = "";

        assertEquals(expected, actual);
    }

    @Test
    public void testFindLongestWordInOneSentence() {

        //Arrange
        JavaGame myJavaGame = new JavaGame();

        //Act
        String addedSentence = "What's your name?";
        myJavaGame.findLongestWord(addedSentence);

        String actual = myJavaGame.getLongestWord();

        //Assert
        String expected = "What's";

        assertEquals(expected, actual);
    }

    @Test
    public void testFindLongestWordInTheFirstOfTwoSentences() {

        //Arrange
        JavaGame myJavaGame = new JavaGame();

        //Act
        String addedSentence = "My name is Jennifer";
        myJavaGame.findLongestWord(addedSentence);
        addedSentence = "What's your name?";
        myJavaGame.findLongestWord(addedSentence);

        String actual = myJavaGame.getLongestWord();

        //Assert
        String expected = "Jennifer";

        assertEquals(expected, actual);
    }

    @Test
    public void testFindLongestWordInTheSecondOfTwoSentences() {

        //Arrange
        JavaGame myJavaGame = new JavaGame();

        //Act
        String addedSentence = "What's your name?";
        myJavaGame.findLongestWord(addedSentence);
        addedSentence = "My name is Jennifer";
        myJavaGame.findLongestWord(addedSentence);

        String actual = myJavaGame.getLongestWord();

        //Assert
        String expected = "Jennifer";

        assertEquals(expected, actual);
    }

    @Test
    public void testFindLongestWordIgnoreSTOP() {

        //Arrange
        JavaGame myJavaGame = new JavaGame();

        //Act
        String addedSentence = "stop";
        myJavaGame.findLongestWord(addedSentence);

        String actual = myJavaGame.getLongestWord();

        //Assert
        String expected = "";

        assertEquals(expected, actual);
    }

    @Test
    public void testFindLongestWordOneCharacter() {

        //Arrange
        JavaGame myJavaGame = new JavaGame();

        //Act
        String addedSentence = "i";
        myJavaGame.findLongestWord(addedSentence);

        String actual = myJavaGame.getLongestWord();

        //Assert
        String expected = "i";

        assertEquals(expected, actual);
    }

    @Test
    public void testFindLongestWordInSTOPSentence() {

        //Arrange
        JavaGame myJavaGame = new JavaGame();

        //Act
        String addedSentence = "Now I'm done stop or what do you think?";
        myJavaGame.findLongestWord(addedSentence);

        String actual = myJavaGame.getLongestWord();

        //Assert
        String expected = "done";

        assertEquals(expected, actual);
    }

    @Test
    public void testFindLongestWordInSTOPCommaSentence() {

        //Arrange
        JavaGame myJavaGame = new JavaGame();

        //Act
        String addedSentence = "Now I'm! done !stop, or what do you think?";
        myJavaGame.findLongestWord(addedSentence);

        String actual = myJavaGame.getLongestWord();

        //Assert
        String expected = "I'm!";

        assertEquals(expected, actual);
    }

    @Test
    public void testFindStopWithStopWord() {

        //Arrange
        Player stopGame = new Player();

        //Act
        String addedSentence = "stop";

        Boolean actual = stopGame.findStop(addedSentence);

        //Assert
        assertEquals(true, actual);
    }

    @Test
    public void testFindStopWithSentenceNotContainingStop() {

        //Arrange
        Player stopGame = new Player();

        //Act
        String addedSentence = "Hello";

        Boolean actual = stopGame.findStop(addedSentence);

        //Assert
        assertEquals(false, actual);
    }

    @Test
    public void testFindStopWithSentenceContainingStop() {

        //Arrange
        Player sentence = new Player();

        //Act
        String addedSentence = "Hello stop";

        Boolean actual = sentence.findStop(addedSentence);

        //Assert
        assertEquals(true, actual);
    }

}
