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
public class QFifthteen extends View{
       public QFifthteen() {
            super("\n"
            +"\n----------------------------------------------"
            +"\n| District Six Tribute                        |"
            +"\n----------------------------------------------"
            +"\n| What is Katniss's favorite food from the list?  |"      
            +"\n|                                               |"      
            +"\nA - Loaves of Bread"
            +"\nB - Tea"
            +"\nC - Lamb Stew "
            +"\nD - Rosemary Chocolate"
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
                 this.viewNextQuestion();
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
        QSixteen qSixteen = new QSixteen();
        qSixteen.display();
    }
      private void viewDied() {
        Died died = new Died();
        died.display();
    }
                   
 
    
}





