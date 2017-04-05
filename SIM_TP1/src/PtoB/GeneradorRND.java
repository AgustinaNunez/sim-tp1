package PtoB;

import java.text.DecimalFormat;

public class GeneradorRND {
    private int rango;

    public GeneradorRND(int rango) {
        this.rango = rango;
    }

    public double getRandom() {
       
        //double r = (Math.random() * rango) + 1; -------> PREGUNTAR SI HACE FALTA  COMPARARLO CON EL  RANGO DADO
       //   QUE SIN ESO ME DA VALORES ENTRE 0-1 PARA PODER GRAFICAR MEJOR EL HISTOGRAMA
        // que vaya de 0 hasta el rango---- si es 5 va de 0-5 como maximo tendria 4.9999
        double r = (Math.random());
        
        return r;
    }
    
    
}
