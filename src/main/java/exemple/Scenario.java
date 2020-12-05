/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import bandeau.Bandeau;
import java.util.ArrayList;
import java.util.List;

public class Scenario {
    
    public final List<Effet> myeffets = new ArrayList<>();
    
    public void ajoutEffet(Effet e, int repetitions, Bandeau b){
        for (int i=0; i<repetitions; i++)
            myeffets.add(e);
    }
 
    public void afficheScenario(Bandeau b){
        b.setMessage("Hello");
        b.sleep(1000);
        for (Effet e : myeffets){
            e.effet(b);
        }
        
        b.setMessage("Terminé");
	b.sleep(3000);
	b.close();
    }
    
}
