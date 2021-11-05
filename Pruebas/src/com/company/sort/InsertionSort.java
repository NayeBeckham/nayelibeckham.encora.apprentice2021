package com.company.sort;

import java.util.List;

public class InsertionSort<T> {


    void insersionDirecta(T[] arr, Comparator<T> comparator){

        T pivote;
        int j;
        //empieza de la segunda posicion
        for(int i=1; i<arr.length; i++){
            //toma el valor del pivote
            pivote = arr[i];
            j = i -1;
            //for para recorrer del pivote para atras
            for(; j >= 0; j--){
                //validar si el dato menor que el anterior
                if(comparator.compare(pivote, arr[j]) < 0 ){
                    //swap
                    T cambio = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = cambio;
                }
            }
        }

    }

    void insertionSort(T[] arr, Comparator<T> comparator){
        T pivote;
        int j;
        //empieza de la segunda posicion
        for(int i=1; i<arr.length; i++){
            //toma el valor del pivote
            pivote = arr[i];
            //for para recorrer del pivote para atras
            //validar si el dato menor que el anterior
            for (j = i -1; j >= 0 && comparator.compare(pivote, arr[j]) < 0 ; j--){
                //se desplaza
                arr[j+1] = arr[j];
            }
            arr[j+1] = pivote;
        }
    }

    public static void insertionSort2(int n, List<Integer> arr) {
        // Write your code here
        int pivote;
        int j;
        //empieza de la segunda posicion
        for(int i=1; i<n; i++){
            //toma el valor del pivote
            pivote = arr.get(i);
            j = i -1;
            //for para recorrer del pivote para atras
            //validar si el dato menor que el anterior
            for (; j >= 0 && pivote < arr.get(j) ; j--){
                //se desplaza
                arr.set(j+1, arr.get(j));

            }
            arr.set(j+1, pivote);

            for (int k = 0; k < n; k++) {
                System.out.print(arr.get(k)+" ");
            }
            System.out.println("");
        }
    }
}
