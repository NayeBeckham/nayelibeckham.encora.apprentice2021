package com.company.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class BubbleSortTest {


    @Test
    public void sortAverageArrayTest(){
        //Inicializacion
        Integer[] array = new Integer[]{2,1,3,4,5,6,7,8};
        InsertionSort<Integer> insertionSort = new InsertionSort<>();
        IntegerComparator integerComparator = new IntegerComparator();
        //Ejecucion
        insertionSort.insertionSort(array, integerComparator);
        //Validacion
        Assertions.assertEquals(1, array[0]);
        Assertions.assertEquals(2, array[1]);
        Assertions.assertEquals(3, array[2]);
        Assertions.assertEquals(4, array[3]);
        Assertions.assertEquals(5, array[4]);
        Assertions.assertEquals(6, array[5]);
        Assertions.assertEquals(7, array[6]);
        Assertions.assertEquals(8, array[7]);
    }

    @Test
    public void alreadySortedArrayTest(){
        //Inicializacion
        Integer[] array = new Integer[]{1,2,3,4,5,6,7,8};
        InsertionSort<Integer> insertionSort = new InsertionSort<>();
        IntegerComparator integerComparator = new IntegerComparator();
        //Ejecucion
        insertionSort.insertionSort(array, integerComparator);
        //Validacion
        Assertions.assertEquals(1, array[0]);
        Assertions.assertEquals(2, array[1]);
        Assertions.assertEquals(3, array[2]);
        Assertions.assertEquals(4, array[3]);
        Assertions.assertEquals(5, array[4]);
        Assertions.assertEquals(6, array[5]);
        Assertions.assertEquals(7, array[6]);
        Assertions.assertEquals(8, array[7]);
    }

    @Test
    public void sortWorstArrayTest(){
        //Inicializacion
        Integer[] array = new Integer[]{8,7,6,5,4,3,2,1};
        InsertionSort<Integer> insertionSort = new InsertionSort<>();
        IntegerComparator integerComparator = new IntegerComparator();
        //Ejecucion
        insertionSort.insertionSort(array, integerComparator);
        //Validacion
        Assertions.assertEquals(1, array[0]);
        Assertions.assertEquals(2, array[1]);
        Assertions.assertEquals(3, array[2]);
        Assertions.assertEquals(4, array[3]);
        Assertions.assertEquals(5, array[4]);
        Assertions.assertEquals(6, array[5]);
        Assertions.assertEquals(7, array[6]);
        Assertions.assertEquals(8, array[7]);
    }

    @Test
    public void sortAverageArrayStringTest(){
        //Inicializacion
        String[] array = new String[]{"a","h","j","p","c"};
        InsertionSort<String> insertionSort = new InsertionSort<>();
        StringComparator sC = new StringComparator();
        //Ejecucion
        insertionSort.insertionSort(array, sC);
        //Validacion
        Assertions.assertEquals("a", array[0]);
        Assertions.assertEquals("c", array[1]);
        Assertions.assertEquals("h", array[2]);
        Assertions.assertEquals("j", array[3]);
        Assertions.assertEquals("p", array[4]);
    }
}

