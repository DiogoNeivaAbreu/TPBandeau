/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import bandeau.Bandeau;

public class Tourner extends Effet{
    
    public void effet(Bandeau b){
        b.setMessage("On tourne");
	for (int i = 0; i <= 100; i++) {
		b.setRotation(2*Math.PI*i / 100);
		b.sleep(50);
	}
    }
    
}
