/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PtoB;

import java.text.DecimalFormat;

/**
 *
 * @author a3
 */
public class generadorDeRandom {
    private int rango;

    public generadorDeRandom(int rango) {
        this.rango = rango;
    }

    public String getRandom() {
         DecimalFormat truncado = new DecimalFormat("0.0000"); 
         double r= (Math.random() * rango) + 1;
         return truncado.format(r);
    }

    
    
}
