/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

/**
 *Class ontains the game logic my game
 *@author Aaron
 */
public class GameLogic {
    private WordBank wordBank = new WordBank();
    private PlayerScoreManager playerScoreManager = new PlayerScoreManager();
    private String currentWord;
    private String scrambledWord;

    public void initializeGame() {
        currentWord = wordBank.getRandomWord();
        WordScrambler wordScrambler = new WordScrambler();
        scrambledWord = wordScrambler.scrambleWord(currentWord);
    }

    public String getScrambledWord() {
        return scrambledWord;
    }

    public boolean checkGuess(String guess) {
        if (guess.equalsIgnoreCase(currentWord)) {
            playerScoreManager.incrementScore();
            return true;
        }
        return false;
    }

    public int getCurrentScore() {
        return playerScoreManager.getScore();
    }
}
