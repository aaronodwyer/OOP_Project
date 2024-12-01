/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
/**
 *Class stores wordbank and returns a random word to be scrambled
 * @author Aaron
 */

public class WordBank {
    private List<String> words = Arrays.asList("example", "scramble", "guess", "challenge", "game");

    public String getRandomWord() {
        Random random = new Random();
        return words.get(random.nextInt(words.size()));
    }
}
