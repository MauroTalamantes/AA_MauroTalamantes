/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busquedas;

/**
 *
 * @author working
 */
public class Busquedas {
    
    public static int busquedaLineal (int[] datos, int x){
    
        boolean encontrado=false;
        for(int i=0; i<datos.length; i++)
        {
            if(datos[i]==x)
            {
                System.out.println("Numero encontrado en la posicion: "+(i+1));
                encontrado=true;
            }
        }
        
        if(encontrado==false)
        {
            System.out.println("Numero no encontrado en ninguna posicion");
        }
        return 0;
        
        /*alternativo
        for(int = 0; j<datos.lenght;j++){
            if(datos[j]==x) return j;
        }
        return -1;
        */
        
    }
    
}
