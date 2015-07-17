/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triviahungergames.view;

/**
 *
 * @author katherineblake
 */
public class QSix extends View {
     public QSix() {
            super("\n"
            +"\n----------------------------------------------"
            +"\n| District Three Tribute                        |"
            +"\n----------------------------------------------"
            +"\n| Katniss Everdeen won for the first time     |"      
            +"\n| during the ___ Hunger Game.                   |"      
            +"\nA - 25th"
            +"\nB - 172th"
            +"\nC - 68th "
            +"\nD - 74th"
            +"\n----------------------------------------------");
            
        }
        
        @Override
    public boolean doAction(Object obj) {
        
        char selection = (char) obj;
        
        switch(selection){
            case 'A':
            case 'a':
                this.viewDied();
                break;
            case 'B':
            case 'b':
                this.viewDied();
                break;
            case 'C':
            case 'c':
                this.viewDied();
                break;
            case 'D':
            case 'd':
                this.viewNextQuestion();
                break;   
            case 'R':
            case 'r':
                return false;
            default:
                System.out.println("\n*** Invalid selection, try again. ***");
                break;
        }
        return true;
    }
    
    private void viewNextQuestion() {
        QSeven qSeven = new QSeven();
        qSeven.display();
    }
      private void viewDied() {
        Died died = new Died();
        died.display();
    }
                   
 
    
}


