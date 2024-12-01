/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import javax.swing.*;
import Logic.GameLogic;
import java.awt.event.ActionEvent;


/**
 * Game GUI class for the design and visual aspect of my game
 * @author Aaron
 */

public class GameGUI extends JFrame {
    private GameLogic gameLogic;
    private JLabel scrambledWordLabel;
    private JTextField guessTextField;
    private JLabel scoreLabel;

    public GameGUI() {
        gameLogic = new GameLogic();
        gameLogic.initializeGame();
        initComponents();
    }

    private void initComponents() {
        setTitle("Word Scramble Game");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel headingLabel = new JLabel("Word Scramble Game");
        headingLabel.setBounds(100, 10, 200, 30);
        add(headingLabel);

        JLabel instructionsLabel = new JLabel("Unscramble the word below:");
        instructionsLabel.setBounds(20, 50, 200, 20);
        add(instructionsLabel);

        scrambledWordLabel = new JLabel(gameLogic.getScrambledWord());
        scrambledWordLabel.setBounds(20, 80, 200, 20);
        add(scrambledWordLabel);

        JLabel guessLabel = new JLabel("Your Guess:");
        guessLabel.setBounds(20, 120, 100, 20);
        add(guessLabel);

        guessTextField = new JTextField();
        guessTextField.setBounds(120, 120, 150, 25);
        add(guessTextField);

        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(20, 160, 100, 30);
        submitButton.addActionListener(this::handleSubmit);
        add(submitButton);

        JButton closeButton = new JButton("Close");
        closeButton.setBounds(140, 160, 100, 30);
        closeButton.addActionListener(e -> System.exit(0));
        add(closeButton);

        JLabel scoreTextLabel = new JLabel("Score:");
        scoreTextLabel.setBounds(20, 200, 100, 20);
        add(scoreTextLabel);

        scoreLabel = new JLabel("0");
        scoreLabel.setBounds(120, 200, 100, 20);
        add(scoreLabel);
    }

    private void handleSubmit(ActionEvent e) {
        String guess = guessTextField.getText();
        if (gameLogic.checkGuess(guess)) {
            JOptionPane.showMessageDialog(this, "Correct! A new word will appear.");
            gameLogic.initializeGame();
            scrambledWordLabel.setText(gameLogic.getScrambledWord());
        } else {
            JOptionPane.showMessageDialog(this, "Incorrect. Try again!");
        }
        scoreLabel.setText(String.valueOf(gameLogic.getCurrentScore()));
        guessTextField.setText("");
    }
}