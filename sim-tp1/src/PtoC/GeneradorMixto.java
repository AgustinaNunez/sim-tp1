package PtoC;

import java.text.DecimalFormat;

public class GeneradorMixto {
    private int rango;

    public GeneradorMixto(int rango) {
        this.rango = rango;
    }
    
    public String getRandom() {
         DecimalFormat truncado = new DecimalFormat("0.0000"); 
         double r= (Math.random() * rango) + 1;
         return truncado.format(r);
    }
    
    
}
