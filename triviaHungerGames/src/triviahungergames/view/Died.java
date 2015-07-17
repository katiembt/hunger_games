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
public class Died extends View{
    
        public Died() {
            super("\n"
            +"\n----------------------------------------------"
            +"\n| YOU HAVE DIED....WELCOME TO HEAVEN   "
                    + "     _.--\"\"\"\"\"--._\n" +
 "   .'             '.\n"
                    + "  /                 \\\n"
                    + " ;                   ;\n"
                    + " |                   |\n"
                    + " |                   |\n"
                    + " ;                   ;\n"
                    + "  \\ (`'--,    ,--'`) /\n"
                    + "   \\ \\  _ )  ( _  / /\n"
                    + "    ) )(')/  \\(')( (\n"
                    + "   (_ `\"\"` /\\ `\"\"` _)\n"
                    + "    \\`\"-, /  \\ ,-\"`/\n"
                    + "     `\\ / `\"\"` \\ /`\n"
                    + "      |/\\/\\/\\/\\/\\|\n"
                    + "      |\\        /|\n"
                    + "      ; |/\\/\\/\\| ;\n"
                    + "       \\`-`--`-`/\n"
                    + "        \\      /\n"
                    + " jgs     ',__,'\n"
                    + "          q__p\n"
                    + "          q__p\n"
                    + "          q__p\n"
                    + "          q__p        |"
            +"\n----------------------------------------------"        
            +"\nQ - Return to Main Menu"
            +"\n----------------------------------------------");
            
        }
        
        @Override
    public boolean doAction(Object obj) {
        
        char selection = (char) obj;
        
        switch(selection){
            case 'Q':
            case 'q':
                this.viewMainMenu();
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
    
   

    private void viewMainMenu() {
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
    }
    
}
    

