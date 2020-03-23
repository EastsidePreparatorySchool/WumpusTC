/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.eastsideprep.huntthewumpus;

import java.util.Scanner;
import org.eastsideprep.htw_interfaces.Sound;
import org.eastsideprep.htw_interfaces.Score;
import org.eastsideprep.htw_interfaces.Locations;
import org.eastsideprep.htw_interfaces.CaveInterface;
import org.eastsideprep.htw_interfaces.TriviaInterface;
import org.eastsideprep.htw_interfaces.WPMovement;



import org.eastsideprep.htw_interfaces.Control;

/**
 *
 * @author etardif
 */
public class GameControl implements Control{
        
    
    @Override
    public void NewGame() {
        CaveInterface cave = new Cave();
        WPMovement wmp= new wumpusMovement();
        Locations loc = new GameLocations(cave, wmp);
        TriviaInterface trivia = new Trivia();
        Score score = new HighScore();
        
        
        
    }

    @Override
    public void ReturnHighScore() {
    }
}
