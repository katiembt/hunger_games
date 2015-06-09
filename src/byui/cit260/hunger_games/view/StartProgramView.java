/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hunger_games.view;

import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author WINGU
 */
public class StartProgramView {
   public StartProgramView() {
   }
   public void startProgram () {
       this.displayBanner() ;
   }
   
    String playerName = this.getPlayersName();

    private void displayBanner() {
       System.out.println("\n\n*************************************************");
       
       System.out.println("*                                                                                                                           *"
                         + "\n* Welcome to the Hunger games.                    *");
       System.out.println("*                                                                                                                           *" 
                        + "\n* This is a game of survival. In this              *"
                        + "\n* game you are a tribute from                      *"
                        + "\n* District 12. You have just entered               *"
                        + " \n* the battle arena. All is calm, until            *"
                        + "\n* Until the cannon goes off. The                   *"
                        + "\n* games have begun. The only                       *"
                        + "\n* way out Is a battle to the death.                *"
                        + "\n* You must kill all other tributes                 *"
                        + " \n* from all other districts in order               *"
                        + "\n* to get out. If you fail you will die             *");
       System.out.println("                                                     *                                                                                                                           *" 
                        + "\n* Good luck and may the odds                       *"
                        + "\n* be ever in your favor.                           *");
       System.out.println("*****************************************************");
    }

    private String getPlayersName() {
        boolean valid = false; 
        String playersName = null;
        Scanner keyboard = new Scanner(System.in);
        
        while(!valid){
            
            System.out.println("Enter the player's name below.");
            
            playersName = keyboard.nextLine();
            playersName =playersName.trim();
            
            if(playersName.length() < 2){
                System.out.println("Invalid Name - the name must not be blank");
                continue;
                
            }
            break;
        }
        return playersName;
    }

    }

