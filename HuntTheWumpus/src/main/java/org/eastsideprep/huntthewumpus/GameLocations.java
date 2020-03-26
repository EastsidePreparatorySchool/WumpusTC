/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.eastsideprep.huntthewumpus;

import org.eastsideprep.htw_interfaces.Locations;
import org.eastsideprep.htw_interfaces.CaveInterface;
import org.eastsideprep.htw_interfaces.Control;
import org.eastsideprep.htw_interfaces.WPMovement;

/**
 *
 * @author etardif
 */
public class GameLocations implements Locations{
    CaveInterface c;
    WPMovement wmp;
    
    GameLocations (CaveInterface cave, WPMovement wmp){
        c=cave;
        this.wmp=wmp;
    }
    
    @Override
    public void CheckHazards() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void MovePlayerLocation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ChangeLocation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void givehint() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void arrowshot() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void WumpusRuns() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
