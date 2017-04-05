package PtoC;

import java.text.DecimalFormat;

public class GeneradorMixto {

public GeneradorMixto(){}
public Double[] sacarGeneradorMixto(int cant, int x0,int a, int c, int m)
{
   
    //Vector con numeros pseudoaleatorios 
 Double vectorRi [] = new Double[cant];
 Double vectorXi1 []= new Double [cant];
 //2 vectores donde guardo los Ri los Xi+1
double Xi1 = ((x0 * a + c) % m) ;
 double Ri= Xi1 / (m - 1);
    vectorRi[0] = Ri;
    vectorXi1[0]= Xi1;
    
    for (int i = 1; i < cant; i++) {
        vectorXi1[i] =((vectorXi1[i-1] * a + c) % m);
        vectorRi[i]= vectorXi1[i] / (m-1);
    }
    //retorno todos los valores del vector de aleatorios mixtos
    return vectorRi;
}






}