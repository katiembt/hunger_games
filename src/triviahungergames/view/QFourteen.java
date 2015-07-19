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
public class QFourteen extends View{
       public QFourteen() {
            super("\n"
            +"\n----------------------------------------------"
            +"\n| District Six Tribute                        |"
            +"\n----------------------------------------------"
            +"\n| What was on pin that Katniss wore during    |"      
            +"\n| dthe Hunger Games?                          |"      
            +"\nA - A Tracker Jacker"
            +"\nB - A Humming Bird"
            +"\nC - A Mocking Jay "
            +"\nD - A Nightinggale"
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
        QFifthteen qFifthteen = new QFifthteen();
        qFifthteen.display();
    }
      private void viewDied() {
        Died died = new Died();
        died.display();
    }
                   
 
    
}





