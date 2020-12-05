/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

/**
 *
 * @author Asus
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    
        
    public static void main(String[] args) {
        Effet c = new Clignote();
        Effet r = new Rotation();
        Effet z = new Zoom();
        Scenario s = new Scenario();
        s.ajoutEffet(c, 1);
        s.ajoutEffet(r, 2);
        s.ajoutEffet(z, 1);
        s.afficheScenario();
        
    }
    
    
    
}
