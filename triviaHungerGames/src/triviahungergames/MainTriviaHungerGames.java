/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triviahungergames;

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

     public static void main(String[] args) {
        
        StartProgramView startProgramView = new StartProgramView();
        try {
          startProgramView.startProgram();   
        } catch (Throwable te) {
            System.out.println(te.getMessage());
            te.printStackTrace();
            startProgramView.display();
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
    
