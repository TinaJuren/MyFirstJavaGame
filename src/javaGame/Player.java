package javaGame;

public class Player {

    private boolean stopGame;

    public Player() {
        stopGame = false;
    }

    public Boolean findStop(String addedSentence) {
        if(!addedSentence.contains("stop")) {
            stopGame = false;
        }
        else if(addedSentence.contains("stop")) {
            stopGame = true;
        }
        return stopGame;
    }
}
