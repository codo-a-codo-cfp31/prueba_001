/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado;


/**
 *
 * @author alejandro.medici
 */
public class Controller {
    
    private MainView main_view;
    private Keyboard keybaord;
    private KeyPad keyPad;
    private Game game;
    
    public Controller() {
        
        game = new Game();
        
        keybaord = new Keyboard();
        
        main_view = new MainView();  
        main_view.add(keybaord);
        main_view.setVisible(true);   
        
        keybaord.AddListener(game);
      
    }
    
    public void Run(){
        
    }
    
    
}
