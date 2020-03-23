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

    @Override
    public void startGame() {
<<<<<<< HEAD
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
=======
        Control GC= new GameControl();
        GC.NewGame();
        
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter your name: ");

        String userName = myObj.nextLine();  // Read user input
        System.out.println("Your name is: " + userName);  // Output user input
>>>>>>> master
    }
}
