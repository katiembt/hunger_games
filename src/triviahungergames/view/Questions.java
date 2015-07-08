/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triviahungergames.view;

import triviahungergames.view.MainMenuView;

/**
 *
 * @author WINGU
 */
public class Questions extends View {
        public Questions() {
            super("\n"
            +"\n---------------------------------------------"
            +"\n|                             Question 1:                               |"
            +"\n---------------------------------------------"
            +"\n  How old was President Katniss Everdeen when she    "
            + "first attend the Hunger Games?                                    "        
            +"\n                                                                              "        
            +"\nA - 17                                                                    "         
            +"\nB - 14                                                                    "
            +"\nC - 16                                                                    " 
            +"\nD - 15                                                                    "  
            +"\nR - Forfeit and face death                                        "        
            +"\n                                                                              "    
            +"\n--------------------------------------------");            
        }   

    @Override
    public boolean doAction(Object obj) {
        
        char selection = (char) obj;
        
        switch(selection){  
            case 'A':
            case 'a':              
                break;    
            case 'B':
            case 'b':
                break;
            case 'C':
            case 'c':              
                break;
            case 'D':
            case 'd':              
                break;
            case 'R':
            case 'r':              
                return false;
            default:
                System.out.println("\n*** Invalid selection, try again. ***");
                break;
        }
        return true;
    }
}
