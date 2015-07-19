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
public class QTen extends View {
       public QTen() {
            super("\n"
            +"\n----------------------------------------------"
            +"\n| District Five Tribute                        |"
            +"\n----------------------------------------------"
            +"\n|In President’s home growing lived:            |"      
            +"\n| _________ and _________.                    |"      
            +"\nA - a cat, a ferret"
            +"\nB - an eagle, a marten "
            +"\nC - seven hobbits, a wizard "
            +"\nD - a goat, a cat"
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
        QEleven qEleven = new QEleven();
        qEleven.display();
    }
      private void viewDied() {
        Died died = new Died();
        died.display();
    }
                   
 
    
}



    

