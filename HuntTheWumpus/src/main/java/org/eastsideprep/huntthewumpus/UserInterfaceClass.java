/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.eastsideprep.huntthewumpus;

import org.eastsideprep.htw_interfaces.UInterface;
import org.eastsideprep.htw_interfaces.Control;
import java.util.Scanner;

/**
 *
 * @author etardif
 */
public class UserInterfaceClass implements UInterface{
    static Scanner sc = new Scanner(System.in);  // Create a Scanner object
    @Override
    public void startGame() {
        Control GC= new GameControl();
      
        GC.NewGame();
        
        //Sets name
        
        String [] arrayOfRules = new String[4];
        arrayOfRules[0] = "Before you play the game, you need to understand some basic concepts about the game: The Cave, Hazards, and Possible Actions.";
        arrayOfRules[1] = "1) The Wumpus lives in a cave of 30 rooms; all the rooms are hexagonal with each having up to three tunnels/pathways that lead to other hexagonal rooms, but there is no room that leads to a dead end that doesn't allow you to continue.";
        arrayOfRules[2] = "2) Hazards in this game include Bottomless Pits and Bats. Bottomless pits force you to attempt three trivia questions; if you answer two of them correctly, then you teleport back to where you started. If you answer them wrong, you lose the game. If you encounter bats, you randomly teleport to another room on the map.";
        arrayOfRules[3] = "3) Possible actions a player can take include moving, shooting an arrow, purchasing arrows, and purchasing secrets";
        
       
        
        String userName = ask("Enter your name: \n");
        System.out.println("Your name is: " + userName);  // Output user input
        GC.getName(userName);
        
        //Print Rules 
        System.out.println("The Rules are as Follows:");
        for (int i = 0; i < arrayOfRules.length; i++) {
            System.out.println(arrayOfRules[i]);
        }
        String learnMore = ask("What would you like to learn more about? (1, 2, 3)");
        
        if (learnMore == "1"){
            System.out.println("ok");
        } else if (learnMore == "2"){
            System.out.println("Ok");
        } else if (learnMore == "3"){
            System.out.println("OK");
        }
        
        //
        
    }
    
    public String ask(String a){
        System.out.println(a);
        String b=sc.nextLine();
        return b;
    }

}


