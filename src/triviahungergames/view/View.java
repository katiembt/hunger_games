/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triviahungergames.view;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import triviahungergames.TriviaHungerGames;

/**
 *
 * @author Wingu
 */
public abstract class View implements ViewInterface {
    
    private String promptMessage;
    
    protected  final static BufferedReader keyboard = TriviaHungerGames.getInFile();
    protected final static PrintWriter keyboard = TriviaHungerGames.getOutFile();
    
    public View(String promptMessage) {
        this.promptMessage= promptMessage;
    }

    public String getPromptMessage() {
        return promptMessage;
    }

    public void setPromptMessage(String promptMessage) {
        this.promptMessage = promptMessage;
    }
    
@Override
public void display() {
        
        char selection = ' ';
        do {
            this.console.println(promptMessage);
            
            String input = this.getInput();
            selection = input.charAt(0);
            
            this.doAction(selection);
            
        } while(selection != 'R' && selection !='r' && selection !='Q' && selection !='q');
        
    }
        
    @Override
    public String getInput() {
        boolean valid = false;
//        Scanner keyboard=new Scanner(System.in);
        String menuItem ="";
        
        while(!valid) {
            
            this.console.println("Please make a selection.");

            menuItem = this.keyboard.readLine();
            menuItem = menuItem.trim();
            
            if(menuItem.length()< 1) {
                System.out.println("Invalid option, please try again");
                continue;
            }
            break;
        }
        
        return menuItem;
    }
}