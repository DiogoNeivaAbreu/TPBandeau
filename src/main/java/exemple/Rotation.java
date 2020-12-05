/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;



public class Rotation extends Effet{
    
    public void effet(){
        b.setMessage("On va tourner");
	b.sleep(1000);
        b.setMessage("On tourne");
	for (int i = 0; i <= 100; i++) {
		b.setRotation(2*Math.PI*i / 100);
		b.sleep(100);
	}
    }
    
}
