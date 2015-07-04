/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hunger_games.view;

import exceptions.HarvestControlException;

/**
 *
 * @author katherineblake
 */
public class HarvestView extends View{

    public HarvestView(String promptMessage) {
        super(promptMessage);
    }

    @Override
    public boolean doAction(Object obj) {
         try{
             calcHarvControl(double height, double distance);
         }
         catch (HarvestControlException){
         }
         return HarvestControlException;
    }
    
}
