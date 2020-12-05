/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import java.awt.Font;
import bandeau.Bandeau;

public class Zoomer extends Effet{
    
    public void effet(Bandeau b){
        b.setMessage("On zoom");
        for (int i = 5; i < 60 ; i+=5) {
		b.setFont(new Font("Dialog", Font.BOLD, 5+i));
		b.sleep(100);
        }
    }
}
