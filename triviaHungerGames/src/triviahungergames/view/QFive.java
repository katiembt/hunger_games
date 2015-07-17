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
public class QFive extends View {
     public QFive() {
            super("\n"
            +"\n----------------------------------------------"
            +"\n| District Three Tribute                        |"
            +"\n----------------------------------------------"
            +"\n| WWhat was the name of Katniss's little sister’s?  |"      
            +"\nA - Rosalina"
            +"\nB - Primrose"
            +"\nC - Emila "
            +"\nD - Lily"
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
                this.viewNextQuestion();
                break;
            case 'C':
            case 'c':
                this.viewDied();
                break;
            case 'D':
            case 'd':
                this.viewDied();
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
        QSix qSix = new QSix();
        qSix.display();
    }
      private void viewDied() {
        Died died = new Died();
        died.display();
    }
                   
 
    
}



