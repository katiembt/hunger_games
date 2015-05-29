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
public class AidControlTest {
    
    public AidControlTest() {
    }

    /**
     * Test of calcAidControl method, of class AidControl.
     */
    @Test
    public void testCalcAidControl() {
        System.out.println("calcAidControl");
        double radius = 20.0;
        AidControl instance = new AidControl();
        double expResult = 33510.32;
        double result = instance.calcAidControl(radius);
        assertEquals(expResult, result, 0.01);
    }
    
}
