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
       
        
        String userName = ask("Enter your name: \n");
        System.out.println("Your name is: " + userName);  // Output user input
        GC.getName(userName);
        
        //Print Rules 
        System.out.println("Rules");
        
        //
        
    }
    
    public String ask(String a){
        System.out.println(a);
        String b=sc.nextLine();
        return b;
    }
    
}
