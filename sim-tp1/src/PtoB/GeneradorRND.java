package PtoB;

import java.text.DecimalFormat;

public class GeneradorRND {
    private int rango;

    public GeneradorRND(int rango) {
        this.rango = rango;
    }

    public String getRandom() {
        DecimalFormat truncado = new DecimalFormat("0.0000");
        double r = (Math.random() * rango) + 1;
        return truncado.format(r);
    }
}
