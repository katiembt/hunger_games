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
 * @author katherineblake
 */
public class BattleControlTest {
    
    public BattleControlTest() {
    }

    /**
     * Test of battle_p method, of class BattleControl.
     */
    @Test
    public void testBattle_p() {
        System.out.println("battle_p");
        double player_number = 0;
        double expResult = 6;
        double result = BattleControl.battle_p(player_number);
        assertEquals(expResult, result, 0.0);
       
    }

    /**
     * Test of battle_t method, of class BattleControl.
     */
    @Test
    public void testBattle_t() {
        System.out.println("battle_t");
        double tribute_number = 0.0;
        double expResult = 6.0;
        double result = BattleControl.battle_t(tribute_number);
        assertEquals(expResult, result, 0.0);
       
    }

    /**
     * Test of calcBattleControl method, of class BattleControl.
     */
    @Test
    public void testCalcBattleControl() {
        System.out.println("calcBattleControl");
        double player_number = 6.0;
        double tribute_number = 7.0;
        BattleControl instance = new BattleControl();
        double expResult = 6.0;
        double result = instance.calcBattleControl(player_number, tribute_number);
        assertEquals(expResult, result, 0.0);
        
    }
    
}
