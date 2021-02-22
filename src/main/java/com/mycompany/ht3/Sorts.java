/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ht3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
/**
 *
 * @author Rocío
 */
public class Sorts {
        

        ArrayList<Integer> numeros = new ArrayList<Integer>(); 
        public void generarNumeros(){
            
            while(numeros.size()<10){
            Random Aleatorio = new Random();
            int N = Aleatorio.nextInt(3001);
            numeros.add(N);
            }//fin de while
            System.out.println(numeros);
            
        }//fin de generar numeros
	
        /*public void gnomeSort(ArrayList<Integer>numeros, int n)
	{
		int index = 0;

		while (index < n) {
			if (index == 0)
				index++;
			if (arr[index] >= arr[index - 1])
				index++;
			else {
				int temp = 0;
				temp = arr[index];
				arr[index - 1] = temp;
				index--;
			}
		}
	return;}
	
public void Gnome(){
   

	gnomeSort(numeros, numeros.length());

	System.out.print("Secuencia de numeros luego de aplicar el Gnome Sort :")
	System.out.println(Arrays.toString(numeros));
    
}*/
        
        
        public void selectionSort(ArrayList<Integer>numeros){
             int i, j, minValue, minIndex, temp = 0;
             for(i=0; i<numeros.size();i++){
                 minValue = numeros.get(i);
                 minIndex = i;
                 for (j = i; j<numeros.size(); j++){
                    if(numeros.get(i)<minValue){
                        minValue = numeros.get(i);
                        minIndex = j;
                    }
                    
                 }
                if (minValue < numeros.get(i)) {
			temp = numeros.get(i);
			numeros.get(i) = numeros.get(minIndex);
			numeros.get(minIndex) = temp;
		} 
             }
             
             return numeros;
            
        }// fin de selection sort
    
            
            
    
}//fin de clase
