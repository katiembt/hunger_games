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
public class QEight extends View{
       public QEight() {
            super("\n"
            +"\n----------------------------------------------"
            +"\n| District Four Tribute                        |"
            +"\n----------------------------------------------"
            +"\n| Who was Katniss's hunting partner?   |"      
            +"\n| during the ___ Hunger Game.                   |"      
            +"\nA - Peeta Mellark"
            +"\nB - Gale Hawthorne "
            +"\nC - Primrose Everdeen "
            +"\nD - Madge Undersee"
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
        QNine qNine = new QNine();
        qNine.display();
    }
      private void viewDied() {
        Died died = new Died();
        died.display();
    }
                   
 
    
}




