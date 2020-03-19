/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.eastsideprep.htw_interfaces;

import org.eastsideprep.htw_interfaces.CaveInterface;
/**
 *
 * @author etardif
 */
public interface Locations {
    //need an Array or Object filled with the locations of hazards
    public void CheckHazards(); //checks hazards at a given location, if there are hazards does something
    public void MovePlayerLocation(); //moves player
    
    public void WumpusRuns(); //wumpus runs away 2-4 spaces
    
    public void ChangeLocation(); //changes location of object 
    public void givehint(); //return String that is a hint to player
    public void arrowshot(); // checks location that arrow was 
}
