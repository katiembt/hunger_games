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
public class QTwelve extends View{
       public QTwelve() {
            super("\n"
            +"\n----------------------------------------------"
            +"\n| District Six Tribute                       |"
            +"\n----------------------------------------------"
            +"\n| What is Katniss's Weapon of Choice?          |"      
            +"\n|                                              |"      
            +"\nA - bow and arrow"
            +"\nB - sword"
            +"\nC - pike "
            +"\nD - trap"
            +"\n----------------------------------------------");
            
        }
        
        @Override
    public boolean doAction(Object obj) {
        
        char selection = (char) obj;
        
        switch(selection){
            case 'A':
            case 'a':
                this.viewNextQuestion();
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
        QThirteen qThirteen = new QThirteen();
        qThirteen.display();
    }
      private void viewDied() {
        Died died = new Died();
        died.display();
    }
                   
 
    
}




