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
	
        public void gnomeSort(ArrayList<Integer>numeros, int n)
	{
		int index = 0;

		while (index < n) {
			if (index == 0)
				index++;
			if (numeros.get(index) >= numeros.get(index - 1))
				index++;
			else {
				int temp = 0;
				temp = numeros.get(index);
				numeros.set(index - 1) = temp;
				index--;
			}
		}
	return;}
	
public void Gnome(){
   

	gnomeSort(numeros, numeros.size());

	System.out.print("Secuencia de numeros luego de aplicar el Gnome Sort :");
	System.out.println((numeros));
    
}
        
        
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
			numeros.get(i) = numeros.set(minIndex, );
			numeros.set(minIndex) = temp;
		} 
             }
             
             return numeros;
            
        }// fin de selection sort
        
        
        private static void printArray(int[] array) {
		
		for(int i: array) {
			System.out.print(i + " ");
		}
		System.out.println();
		
	}
	
	// Breaks down the array to single or null elements in array.
	private static int[] mergeSort(int[] array) {
		
		// Recursive control 'if' statement.
		if(array.length <= 1) {
			
			return array;
			
		}
		
		int midpoint = array.length / 2;
		
		// Declare and initialize left and right arrays.
		int[] left = new int[midpoint];
		int[] right;
		
		if(array.length % 2 == 0) { // if array.length is an even number.
			
			right = new int[midpoint];
			
		} else {
			
			right = new int[midpoint + 1];
			
		}
		
		// Populate the left and right arrays.
		for(int i=0; i < midpoint; i++) {
			
			left[i] = array[i];
			
		}
		
		for(int j=0; j < right.length; j++) {
			
			right[j] = array[midpoint+j];
			
		}
		
		int[] result = new int[array.length];
		
		// Recursive call for left and right arrays.
		left = mergeSort(left);
		right = mergeSort(right);
		
		// Get the merged left and right arrays.
		result = merge(left, right);
		
		// Return the sorted merged array.
		return result;
		
	}
	
	// Merges the left and right array in ascending order.
	private static int[] merge(int[] left, int[] right) {
		
		// Merged result array.
		int[] result = new int[left.length + right.length];
		
		// Declare and initialize pointers for all arrays.
		int leftPointer, rightPointer, resultPointer;
		leftPointer = rightPointer = resultPointer = 0;
		
		// While there are items in either array...
		while(leftPointer < left.length || rightPointer < right.length) {
			
			// If there are items in BOTH arrays...
			if(leftPointer < left.length && rightPointer < right.length) {
				
				// If left item is less than right item...
				if(left[leftPointer] < right[rightPointer]) {
					
					result[resultPointer++] = left[leftPointer++];
					
				} else {
					
					result[resultPointer++] = right[rightPointer++];
					
				}
				
			}
			
			// If there are only items in the left array...
			else if(leftPointer < left.length) {
				
				result[resultPointer++] = left[leftPointer++];
				
			}
			
			// If there are only items in the right array...
			else if(rightPointer < right.length) {
				
				result[resultPointer++] = right[rightPointer++];
				
			}
 			
		}
		
		return result;
		
	}
    
        public void mer(){
            int[] array = { 5, 4, 3, 2, 1 };
		System.out.println("Initial Array: ");
		printArray(array);
		
		// Sorted and merged array with print out.
		array = mergeSort(array);
		System.out.println("Sorted Array: ");
		printArray(array);
        }
                
            
            
    
}//fin de clase
