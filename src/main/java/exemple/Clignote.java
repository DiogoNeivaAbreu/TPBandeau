/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;


public class Clignote extends Effet{
    
    
    public void onClignote(){
        monBandeau.setMessage("On va clignoter");
	monBandeau.sleep(1000);
        monBandeau.setMessage("On clignote");
        for (int i = 0; i < 10 ; i+=1) {
		monBandeau.setMessage("On clignote");
		monBandeau.sleep(100);
                monBandeau.setMessage(" ");
                monBandeau.sleep(100);
        }
    }
}
