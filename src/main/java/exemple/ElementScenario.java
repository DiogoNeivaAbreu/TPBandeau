/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import java.util.HashSet;
import java.util.Set;


public class ElementScenario {
    
    public final Set<Effet> myeffets = new HashSet<>();
    Rotation r;
    Clignote c;
    Zoom z;
    
    public void repetitionsEffet(Effet e, int repetitions){
        for (int i=0; i<repetitions; i++)
            myeffets.add(e);
    }
    
}
