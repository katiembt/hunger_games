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
import java.util.logging.Level;
import java.util.logging.Logger;
import triviahungergames.model.Game;
import triviahungergames.model.Location;
import triviahungergames.model.Map;
import triviahungergames.model.Player;
import triviahungergames.view.StartProgramView;

/**
 *
 * @author katherineblake
 */
public class MainTriviaHungerGames {
    private static Game currentGame = null;
    private static Player player = null;

    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        MainTriviaHungerGames.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        MainTriviaHungerGames.inFile = inFile;
    }
    
     public static void main(String[] args) {
        
//        StartProgramView startProgramView = new StartProgramView();
        try {
            
            //open character stream files for end user input and output
            MainTriviaHungerGames.inFile = 
                    new BufferedReader(new InputStreamReader(System.in));
            
            MainTriviaHungerGames.outFile = 
                    new PrintWriter(System.out, true);            
        
           StartProgramView startProgramView = new StartProgramView();
            startProgramView.startProgram();   
        } catch (Throwable te) {
            
            System.out.println(te.getMessage());
            te.printStackTrace();
            startProgramView.display();
        }
        finally{
            try {
                if(MainTriviaHungerGames.inFile !=null)
                   MainTriviaHungerGames.inFile.close();
                
                if(MainTriviaHungerGames.outFile !=null)
                   MainTriviaHungerGames.outFile.close();
            } catch (IOException ex) {
               System.out.println("error closing files");
               return;
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
    

