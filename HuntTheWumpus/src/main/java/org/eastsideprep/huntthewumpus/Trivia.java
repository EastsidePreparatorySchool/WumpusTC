/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.eastsideprep.huntthewumpus;

import org.eastsideprep.htw_interfaces.TriviaInterface;

/**
 *
 * @author etardif
 */
import java.io.File; //class for files
import java.io.IOException; //class for handling errors
import java.io.FileWriter;
public class Trivia implements TriviaInterface{
    @Override
    public String getTriviaQ(){
        String question = ""; 
        return question;
    }
    @Override
    public int returnCoinCount(){
        return 0; 
    }
    
    public void gameStarted(){
        //create array of trivia questions - I was thinking of filling a string array with lots of trivia questions. Even indexes would be questions, and odd indexes would be the answer to the previous element. 
        //what is the easiest way to fill an array with lots of questions/answers without hardcoding everything? This could then be written to the file. Or is the file filled with questions/answers first?
        
        String[] triviaQuestions;
        triviaQuestions = new String[100];
        triviaQuestions[0] = "What does EPS stand for?"; //example
        triviaQuestions[1] = "Eastside Preparatory School";
        
        File triviaFile = new File("trivia.txt"); //(attempt) to create the file
        try {
            if(triviaFile.createNewFile()){
                System.out.println("File " + triviaFile.getName() + " created");
            }
            else System.out.println("File exists");
            FileWriter writer = new FileWriter("trivia.txt");
            writer.write(triviaQuestions[0]);
            writer.write(triviaQuestions['\n']);
            writer.write(triviaQuestions[1]);
            writer.close(); 
        }catch (IOException e){
            System.out.println("Error.");
            e.printStackTrace();
        }
        
        
    }
}

