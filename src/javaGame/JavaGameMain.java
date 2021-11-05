package javaGame;

import java.util.Scanner;

public class JavaGameMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        JavaGame myJavaGame = new JavaGame();

        System.out.println("""
                Welcome to The Java Game.
                This game counts the rows, characters, and words you add. It also prints out the longest sentence. If you want to end the counting simply write the word 'stop'.\r
                Please, start by writing a word or a sentence of your choice:\s""");

        String addedSentence = sc.nextLine();
        addedSentence = addedSentence.toLowerCase();

        Player stopGame = new Player();

        while (!addedSentence.equals("stop")) {
            myJavaGame.addRows(addedSentence);
            myJavaGame.addCharacters(addedSentence);
            myJavaGame.addWords(addedSentence);
            myJavaGame.findLongestWord(addedSentence);

            if (!stopGame.findStop(addedSentence)) {
                System.out.println("Please, add another word or sentence to continue: ");
                addedSentence = sc.nextLine();
                addedSentence = addedSentence.toLowerCase();
            } else {
                stopGame.findStop(addedSentence);
            }
        }
        System.out.println("In total, you added:" + "\r\n" + "Number of rows: " + myJavaGame.getRows() + "\r\n" + "Number of characters: " + myJavaGame.getCharacters() + "\r\n" + "Number of words: " + myJavaGame.getWords() + "\r\n" + "The longest word you added was: " + myJavaGame.getLongestWord());
    }

}