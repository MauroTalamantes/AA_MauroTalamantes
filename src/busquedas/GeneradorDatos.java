/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busquedas;

import java.util.Random;

/**
 *
 * @author working
 */
public class GeneradorDatos {
    
    // "aleatorio"
    public static int[] generarArregloInt(int x, int dim, int bound){
        int[] arreglo = new int[dim];
        Random ran = new Random();
       
        for(int y=0; y < dim; y++){
            arreglo[y] =ran.nextInt(bound);
        }
        int pos = ran.nextInt(dim);
        arreglo[pos] = x;
       return arreglo;
    }
    
    // "peor de los casos, unico elemento (el que se encuentra hasta el final)"
    public static int[] generarArregloIntPeorCaso(int x, int dim, int bound){
        int[] arreglo = new int[dim];
    
       
        for(int y=0; y < dim; y++){
            int j = generarNumeroAletorioControlado(x, bound);
            arreglo[y] =j;
        }
        arreglo[arreglo.length-1] = x;
       return arreglo;
    }
    
    // genera numeros aleatorios en base a un valor x que no queremos que genere.
    public static int generarNumeroAletorioControlado(int x,int bound){
        Random ran = new Random();
        int aux = ran.nextInt(bound);
        while(aux==x){
            aux = ran.nextInt(bound);
        }
        return aux;
    }
    
}
