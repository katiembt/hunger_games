/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triviahungergames;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import triviahungergames.model.Game;
import triviahungergames.model.Player;
import triviahungergames.view.ErrorView;
import triviahungergames.view.StartProgramView;

/**
 *
 * @author katherineblake
 */
public class TriviaHungerGames {
    private static Game currentGame = null;
    private static Player player = null;

    protected  static PrintWriter outFile = null;
    protected  static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        TriviaHungerGames.logFile = logFile;
    }
    

    public static PrintWriter getOutFile() {
        return outFile;
    }


    public static BufferedReader getInFile() {
        return inFile;
    }

    
    public static void main(String[] args) {
        
        StartProgramView startProgramView = new StartProgramView();
        try {
            
            //open character stream files for end user input and output
            TriviaHungerGames.inFile = 
                    new BufferedReader(new InputStreamReader(System.in));
            
            TriviaHungerGames.outFile = 
                    new PrintWriter(System.out);   
                    
            String filePath ="log.txt";
            TriviaHungerGames.logFile = new PrintWriter(filePath);
        
           
            startProgramView.startProgram();   
        } catch (Throwable te) {
            
            ErrorView.display("MainTriviaHungerGames", te.getMessage());
            te.printStackTrace();
            startProgramView.display();
        }
        finally{
            try {
                if(TriviaHungerGames.inFile !=null)
                   TriviaHungerGames.inFile.close();
                
                if(TriviaHungerGames.outFile !=null)
                   TriviaHungerGames.outFile.close();
                
                if(TriviaHungerGames.logFile !=null)
                   TriviaHungerGames.logFile.close();
                
            } catch (IOException ex) {
               System.out.println("error closing files");
               return;
            }
            
        }
    }
    public static Game getCurrentGame(){
        return currentGame;
    }
    
    public static void setCurrentGame(Game currentGame){
        TriviaHungerGames.currentGame = currentGame;
    }
    
    public static Player getPlayer(){
        return player;
    }
    
    public static void setPlayer(Player player){
        TriviaHungerGames.player = player;
    }
}
    

