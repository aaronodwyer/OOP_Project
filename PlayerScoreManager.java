/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

/**
 * This class manages the players score
 * @author Aaron
 */
public class PlayerScoreManager {
    private int score = 0;

    public int incrementScore() {
        score += 10; // Add 10 points for a correct guess
        return score;
    }
    public int getScore() {
        return score;
    }
}

