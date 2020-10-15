/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aa20201;

import busquedas.BusquedaSecuencial;

import busquedas.GeneradorDatos;
import java.awt.BasicStroke;
import java.awt.Color;
 
import javax.swing.JFrame;
 
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;


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
        int limite = 1000;
        int[] aux;
        int[] tiempos = new int[limite];
        BusquedaSecuencial b1 = new BusquedaSecuencial();
        XYSeries tiem = new XYSeries("Experimiento");
        //int[] aux = GeneradorDatos.generarArregloIntPeorCaso(6, 15, 10);
   for(int j=1;j<limite;j++){
           aux=GeneradorDatos.generarArregloIntPeorCaso(6, j+1, 1000);
                int pos= b1.buscar(aux,6);
                   tiempos[j]=(int)b1.gettTotal();
                      tiem.add(j, tiempos[j]);
                  System.out.println(tiempos[j]);   
       } 
       //grafica y le mandan tiempos
       
       //tiem.add(3, 4);
       //tiem.add(11, 2);
       //tiem.add(14, 15);
       
        //Informacion

        // grafica y le mandan tiempos
        
        XYSeriesCollection dataset = new XYSeriesCollection();
         dataset.addSeries(tiem);
         JFreeChart xylineChart = ChartFactory.createXYLineChart(
                "Grafica XY", 
                "Muestras", 
                "Tiempo", 
                dataset,
                PlotOrientation.VERTICAL, true, true, false);
         
         XYPlot plot = xylineChart.getXYPlot();
        
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        
        renderer.setSeriesPaint(0, Color.RED);
        plot.setRenderer(renderer);
        
        ChartPanel panel = new ChartPanel(xylineChart);
 
        // Creamos la ventana
        JFrame ventana = new JFrame("Grafica");
        ventana.setVisible(true);
        ventana.setSize(800, 600);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        ventana.add(panel);
     
        // Guardar los tiempos
        
           
        
        
        System.out.println("T: "+b1.gettTotal()+"");
    }
    
}

