/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;


public class Clignote extends Effet{
    
    
    public void effet(){
        b.setMessage("On va clignoter");
	b.sleep(1000);
        b.setMessage("On clignote");
        for (int i = 0; i < 10 ; i+=1) {
		b.setMessage("On clignote");
		b.sleep(100);
                b.setMessage(" ");
                b.sleep(100);
        }
    }
}
