/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triviahungergames.view;

import triviahungergames.control.ProgramControl;
import triviahungergames.model.Player;
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
       this.console.println("\n\n******************************************************");
       
       this.console.println("*                                                                                                                           *"
                         + "\n* HUNGER GAMES                                       *");
       this.console.println("*                                                                                                                           *" 
                        + "\n* Welcome to the Hunger Games!                          *"
                        + "\n* You have been chosen as one of the tributes from       " 
                        + "\n* district 12. You will enter an arena and the only      " 
                        + "\n* way to leave the arena is to kill all other tributes.  " 
                        + "\n* In order to kill a tribute you must answer a question   " 
                        + "\n* relating to the Hunger Games correctly. If you answer   " 
                        + "\n* correctly you move on to the next tribute. If you answer" 
                        + "\n* incorrectly you die.                                    " );
       
       
       this.console.println("                                                            *                                                                                                                           *" 
                        + "\n* Good luck and may the odds be ever                      *"
                        + "\n*  in your favor. (*Mockingjay whistle)                  *");
       this.console.println("************************************************************");
    }

    private String getPlayersName() {
        boolean valid = false; 
        String playersName = null;
//        Scanner keyboard = new Scanner(System.in);
        
        while(!valid){
            
            this.console.println("Enter the player's name below.");
            
            playersName = this.keyboard.readLine();
            playersName =playersName.trim();
            
            if(playersName.length() < 2){
                this.console.println("Invalid Name - the name must not be blank");
                continue;
                
            }
            break;
        }
        return playersName;
    }

    private void displayWelcomeMessage(Player player) {
        this.console.println("\n\n=============================================");
        this.console.println("\tWelcome to to the Hunger Games | Generations: Game Show" + " " + player.getName());
        this.console.println("\tMay the odds ever be in your favor.");
        this.console.println("=================================================");
    }

    public void display() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    }

