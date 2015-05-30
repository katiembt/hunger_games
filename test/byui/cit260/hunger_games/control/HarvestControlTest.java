/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hunger_games.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author WINGU
 */
public class HarvestControlTest {
    
    public HarvestControlTest() {
    }

    /**
     * Test of calcHarvControl method, of class HarvestControl.
     */
    @Test
    public void testCalcHarvControl() {
        System.out.println("calcHarvControl");
        double height = 1.0;
        double distance = -51.0;
        HarvestControl instance = new HarvestControl();
        double expResult = -1.0;
        double result = instance.calcHarvControl(height, distance);
        assertEquals(expResult, result, 0.001);
    }
    
}
