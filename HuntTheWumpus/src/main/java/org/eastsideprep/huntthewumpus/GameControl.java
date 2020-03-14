/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.eastsideprep.huntthewumpus;

import org.eastsideprep.htw_interfaces.Sound;

import org.eastsideprep.htw_interfaces.Control;

/**
 *
 * @author etardif
 */
public class GameControl implements Control{

    void test() {
        Sound s = new SoundClass();

        s.playAlarm();
        
    }
}
