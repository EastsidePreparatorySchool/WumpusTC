/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.eastsideprep.huntthewumpus;

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
    String currentname;    
    
    @Override
    public void NewGame() {
        CaveInterface cave = new Cave();
        WPMovement wmp= new wumpusMovement();
        Locations loc = new GameLocations(cave, wmp);
        TriviaInterface trivia = new Trivia();
        Score score = new HighScore();
        
        
        
    }
    
    public void getName(String s){
        currentname=s;
    }
    @Override
    public void ReturnHighScore() {
    }
}
