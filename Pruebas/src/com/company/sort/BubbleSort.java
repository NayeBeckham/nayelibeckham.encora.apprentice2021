package com.company.sort;

public class BubbleSort<T> { //tipo generico

    public void sort(T[] arr, Comparator<T> comparator) { //arreglo de tipo generico y interfaz comparator

        for (int i = 0; i < arr.length - 1; i++) {
            boolean isSorted = true;
            for (int l = 0; l < arr.length - 1; l++) {
                //if (arr[l] > arr[l + 1]) {
                if(comparator.compare(arr[l], arr[l+1]) > 0){
                    T cambio = arr[l + 1];
                    arr[l + 1] = arr[l];
                    arr[l] = cambio;
                    isSorted = false;
                }

            }
            if (isSorted) {
                break;
            }
        }
    }

}
