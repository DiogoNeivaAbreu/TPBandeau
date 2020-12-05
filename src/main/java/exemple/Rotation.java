/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import bandeau.Bandeau;


public class Rotation extends Effet{
    
    public void onTourne(){
        monBandeau.setMessage("On va tourner");
	monBandeau.sleep(1000);
        monBandeau.setMessage("On tourne");
	for (int i = 0; i <= 100; i++) {
		monBandeau.setRotation(2*Math.PI*i / 100);
		monBandeau.sleep(100);
	}
    }
    
}
