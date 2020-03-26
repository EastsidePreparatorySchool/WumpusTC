/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.eastsideprep.huntthewumpus;

import org.eastsideprep.htw_interfaces.Score;

/**
 *
 * @author mlee23
 */

public class HighScore implements Score{
    int score = 0;
    int highScore = 0;
    @Override
    public void fetchScore(){
        score = playerScore;
    }
    @Override
    public void addToScore(){
        if (score > highScore) {
            highScore = score;
        }
    }
    @Override
    public void subtractFromScore(){
        if (highScore > score) {
            int newScore = highScore - score;   
            System.out.println(newScore);
        } else if (highScore == score) {
            System.out.println("You got the same score as your high score");
        } 
    }

    @Override
    public void saveHighScore() {
        if (highScore >= score) {
            highScore = score;
        }
    }
}
