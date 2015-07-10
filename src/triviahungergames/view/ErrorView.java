/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triviahungergames.view;

import java.io.PrintWriter;
import triviahungergames.MainTriviaHungerGames;

/**
 *
 * @author WINGU
 */
public class ErrorView {
    private static final PrintWriter errorFile = MainTriviaHungerGames.getOutFile();
    private static final PrintWriter logFile = MainTriviaHungerGames.getLogFile();
    
    
    public static void display(String className, String errorMessage) {
        
        errorFile.println
                ("---------------------------------------------"
            +"\n - ERROR -" + errorMessage                                                                                
            +"\n---------------------------------------------");
        
        //log error
        logFile.println(className + " - " + errorMessage);
    }
}
