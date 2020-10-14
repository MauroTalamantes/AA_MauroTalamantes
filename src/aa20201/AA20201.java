/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aa20201;

import busquedas.BusquedaSecuencial;
import busquedas.Busquedas;
import busquedas.GeneradorDatos;

/**
 *
 * @author working
 */
public class AA20201 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int limite = 100000000;
        int[] aux;
        int[] tiempos = new int[limite];
        BusquedaSecuencial b1 = new BusquedaSecuencial();
       // int[] aux = GeneradorDatos.generarArregloIntPeorCaso(6, 15, 10);
   for(int j=1;j<=limite;j++){
           aux=GeneradorDatos.generarArregloIntPeorCaso(6, j+1, 1000);
                int pos= b1.buscar(aux,6);
                   tiempos[j]=(int)b1.gettTotal();
                   System.out.println(tiempos[j]);   
       } 
       //grafica y le mandan tiempos
       
       //BusquedaSecuencial b1 = new BusquedaSecuencial();
       //int pos = b1.buscar(aux,6);
       //System.out.println(pos);
       //System.out.println("Inicial: "+b1.gettInicio());
       //System.out.println("Final: "+b1.gettFinal());
       // System.out.println("Total: "+b1.gettTotal()+"");
            
    }
    
}
