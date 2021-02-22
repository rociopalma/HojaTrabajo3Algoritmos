/*
Github: https://github.com/rociopalma/HojaTrabajo3Algoritmos.
 */
package com.mycompany.ht3;

/**
 *
 * @author Rocío
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Sorts st = new Sorts();
    st.generarNumeros();
    st.gnomeSort(st.numeros, 0);
    st.Gnome();
    st.selectionSort(st.numeros);
    st.mer();
    }
    
}
