/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hunger_games.view;

import byui.cit260.hunger_games.control.ProgramControl;
import byui.cit260.hunger_games.model.Player;
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
       //display banner
       this.displayBanner() ;
       
        //get players nam
        String playersName = this.getPlayersName();
        
        //create and save object
        Player player = ProgramControl.createPlayer(playersName);
        
        //Display welcome message
        this.displayWelcomeMessage(player);
        
        //display main menu
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
   }
   
  

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

    private void displayWelcomeMessage(Player player) {
        System.out.println("\n\n=============================================");
        System.out.println("\tWelcome to to the Hunger Games" + " " + player.getName());
        System.out.println("\tMay the odds ever be in your favor.");
        System.out.println("=================================================");
    }

    }

