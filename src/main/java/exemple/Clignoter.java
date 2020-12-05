/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import bandeau.Bandeau;

public class Clignoter extends Effet{
    
    
    public void effet(Bandeau b){
        b.setMessage("On clignote");
        b.sleep(100);
        b.setMessage(" ");
        b.sleep(100);
    }
}
