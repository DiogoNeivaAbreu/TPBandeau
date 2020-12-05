/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import bandeau.Bandeau;
import java.util.HashSet;
import java.util.Set;

public class Scenario {
    
    Bandeau monBandeau = new Bandeau();
    public final Set<Effet> myeffets = new HashSet<>();
    Clignote c = new Clignote();
    Rotation r = new Rotation();
    Zoom z = new Zoom();
    
    
    public void ajoutEffet(Effet e, int repetitions){
        for (int i=0; i<repetitions; i++)
            myeffets.add(e);
    }
    
    public void afficheScenario(){
        monBandeau.setMessage("Hello");
        monBandeau.sleep(100);
        for (Effet e : myeffets){
            if(e.equals(c)){
                c.onClignote();
            }
            if(e.equals(r)){
                r.onTourne();
            }
            if(e.equals(z)){
                z.onZoom();
            }
        }
        monBandeau.setMessage("Terminé");
	monBandeau.sleep(3000);
	monBandeau.close();
    }
    
}
