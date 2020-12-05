/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import bandeau.Bandeau;

/**
 *
 * @author Asus
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    
        
    public static void main(String[] args) {
        Bandeau mb = new Bandeau();
        Effet c = new Clignoter();
        Effet r = new Tourner();
        Effet z = new Zoomer();
        Scenario s = new Scenario();
        s.ajoutEffet(c, 5, mb);
        s.ajoutEffet(r, 2, mb);
        s.ajoutEffet(z, 1, mb);
        s.afficheScenario(mb);
        
    }
    
    
    
}
