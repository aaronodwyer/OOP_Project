/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

import java.util.Random;

/**
 * This class scrambles the word
 *@author Aaron
 */
public class WordScrambler {
    public String scrambleWord(String word) {
        char[] scrambled = word.toCharArray();
        Random random = new Random();
        for (int i = scrambled.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            char temp = scrambled[i];
            scrambled[i] = scrambled[j];
            scrambled[j] = temp;
        }
        return new String(scrambled);
    }
}

