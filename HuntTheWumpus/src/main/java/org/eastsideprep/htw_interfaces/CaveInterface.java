/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.eastsideprep.htw_interfaces;

/**
 *
 * @author etardifS
 */
public interface CaveInterface {
    public void generateCave();
    public void PossibleMovements(); //given a location on the cave, return possible movementsSS
    public void generateRandomRoom(); //return a random room that isn't the player's room
}
