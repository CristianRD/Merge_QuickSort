/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import sortaplicacion.Ordenador;

/**
 *
 * @author Administrador
 */
public class PruebaOrden {
    
    Ordenador Merge;
    Ordenador Quick;
    int[] Desordenado = {5,7,8,3,1,4,10,9,6,2};
    int[] Ordenado = {1,2,3,4,5,6,7,8,9,10};
    
    
    @Before
    public void setUp() {
    Merge = new Ordenador();
    Quick = new Ordenador();
    
    }
    
    @After
    public void tearDown() {
      Merge = null;
      Quick= null;
       
    }
     @Test
    public void MergeSort() {
        int[] Orden = Merge.mergesort(Desordenado,0,Desordenado.length);
        for(int i= 0; i<Desordenado.length; i++){
            assertEquals(Ordenado[i], Orden[i]);
        }
    }
   @Test
    public void QuickSort() {
        int[] Orden = Quick.quicksort(Desordenado, 0, Desordenado.length-1);
        for(int i= 0; i<Desordenado.length; i++){
            assertEquals(Ordenado[i], Orden[i]);  
     
}
    }
}
