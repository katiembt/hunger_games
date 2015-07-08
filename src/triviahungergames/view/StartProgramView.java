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
       System.out.println("\n\n*************************************************");
       
       System.out.println("*                                                                                                                           *"
                         + "\n* HUNGER GAMES | GENERATIONS                *");
       System.out.println("*                                                                                                                           *" 
                        + "\n* This game takes place 30 years after          *"
                        + "\n* the second rebellion. After many                 *"
                        + "\n* years without it, the President,                     *"
                        + "\n* Katniss Everdeen, has finally reinstated      *"
                        + "\n* the Hunger Games, but this time,  it is        *"
                        + "\n* civilized. It's now Trivia Game Show.           *"
                        + "\n* Each distict now has to select an                 *"
                        + "\n* individual to represent their distrct to        *"
                        + "\n* compete in a hard and intricate Q&A         *"
                        + "\n* game. Although more civilized, it is           *"
                        + "\n* still inhumane. If you fail to answer a         *"
                        + "\n* question correctly, you will be killed          *"
                        + "\n*  off (off scene, of course).                           *" );
       System.out.println("                                                     *                                                                                                                           *" 
                        + "\n* Good luck and may the odds be ever         *"
                        + "\n*  in your favor. (*Mockingjay whistle)          *");
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
        System.out.println("\tWelcome to to the Hunger Games | Generations: Game Show" + " " + player.getName());
        System.out.println("\tMay the odds ever be in your favor.");
        System.out.println("=================================================");
    }

    public void display() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    }

