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
    
    public Bandeau b = new Bandeau();
    public final List<Effet> myeffets = new ArrayList<>();
    
    public void ajoutEffet(Effet e, int repetitions){
        for (int i=0; i<repetitions; i++)
            myeffets.add(e);
    }
    
    public void afficheScenario(){
        b.setMessage("Hello");
        b.sleep(100);
        for (Effet e : myeffets){
            e.effet();
        }
        b.setMessage("Terminé");
	b.sleep(3000);
	b.close();
    }
    
}
