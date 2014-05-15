/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sortaplicacion;



/**
 *
 * @author KrRD
 */
public class Ordenador {
 
    public int[] mergesort(int[] matrix, int ini, int fin) {

        int n1;
        int n2;
        if (fin > 1) {
            n1 = fin / 2;
            n2 = fin - n1;
            mergesort(matrix, ini, n1);
            mergesort(matrix, ini + n1, n2);
            merge(matrix, ini, n1, n2);
        }
        return matrix;
    }

    private int[] merge(int[] matrix, int ini, int n1, int n2) {
        
        int[] pivote = new int[n1 + n2];
        int temp = 0;
        int temp1 = 0;
        int temp2 = 0;
        int i;
        while ((temp1 < n1) && (temp2 < n2)) {
            if (matrix[ini + temp1] < matrix[ini + n1 + temp2]) {
                pivote[temp++] = matrix[ini + (temp1++)];
            } else {
                pivote[temp++] = matrix[ini + n1 + (temp2++)];
            }
        }
        while (temp1 < n1) {
           pivote[temp++] = matrix[ini + (temp1++)];
        }
        while (temp2 < n2) {
            pivote[temp++] = matrix[ini + n1 + (temp2++)];
        }
        for (i = 0; i < n1 + n2; i++) {
            matrix[ini + i] = pivote[i];
        }

        return matrix;
    }

    public int[] quicksort(int numeros[], int izq, int der) {

        int i, j;
        int x, aux;
        i = izq;
        j = der;
        x = numeros[ (izq + der) / 2];
        do {
            while ((numeros[i] < x) && (j <= der))i++; {
                
            }
            while ((x < numeros[j]) && (j > izq))j--;{
                
            }
            if (i <= j) {
                aux = numeros[i];
                numeros[i] = numeros[j];
                numeros[j] = aux;
                i++;
                j--;
            }
        } while (i <= j);
        if (izq < j) {
            quicksort(numeros, izq, j);
        }
        if (i < der) {
            quicksort(numeros, i, der);
        }
        return numeros;
    }
}
