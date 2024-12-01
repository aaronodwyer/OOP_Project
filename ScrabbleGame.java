/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;


import GUI.GameGUI;

/**
 * This class is to run the entire game
 * @author Aaron
 */
public class ScrabbleGame {
    public static void main(String[] args) {
         java.awt.EventQueue.invokeLater(() -> new GameGUI().setVisible(true));
        
    }
}

