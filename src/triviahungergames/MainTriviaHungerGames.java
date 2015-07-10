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
public class MainTriviaHungerGames {
    private static Game currentGame = null;
    private static Player player = null;

    protected  static PrintWriter outFile = null;
    protected  static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        MainTriviaHungerGames.logFile = logFile;
    }
    

    public static PrintWriter getOutFile() {
        return outFile;
    }


    public static BufferedReader getInFile() {
        return inFile;
    }

    
    public void main(String[] args) {
        
        StartProgramView startProgramView = new StartProgramView();
        try {
            
            //open character stream files for end user input and output
            MainTriviaHungerGames.inFile = 
                    new BufferedReader(new InputStreamReader(System.in));
            
            MainTriviaHungerGames.outFile = 
                    new PrintWriter(System.out);   
                    
            String filePath ="log.txt";
            MainTriviaHungerGames.logFile = new PrintWriter(filePath);
        
           
            startProgramView.startProgram();   
        } catch (Throwable te) {
            
            ErrorView.display("MainTriviaHungerGames", te.getMessage());
            te.printStackTrace();
            startProgramView.display();
        }
        finally{
            try {
                if(MainTriviaHungerGames.inFile !=null)
                   MainTriviaHungerGames.inFile.close();
                
                if(MainTriviaHungerGames.outFile !=null)
                   MainTriviaHungerGames.outFile.close();
                
                if(MainTriviaHungerGames.logFile !=null)
                   MainTriviaHungerGames.logFile.close();
                
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
        MainTriviaHungerGames.currentGame = currentGame;
    }
    
    public static Player getPlayer(){
        return player;
    }
    
    public static void setPlayer(Player player){
        MainTriviaHungerGames.player = player;
    }
}
    

