/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pruebacmc.ordenamiento;
/**
 *
 * @author Jhair Escobar
 */
public class Ordenar {
    public static void main(String[] args) {
		int numeros[]= {2, 4, 5, 1, 6, 3, 9, 7, 8, 0},temp;
		for (int j = 0; j <=numeros.length; j++) {
			for (int i = 0; i <=numeros.length-2; i++) {
				if (numeros[i]>numeros[i+1]) {
					temp=numeros[i];
					numeros[i]=numeros[i+1];
					numeros[i+1]=temp;
				}
			}
		}
		for (int i=0;i<numeros.length;i++){
			System.out.println(numeros[i]);
		}
	}
}
