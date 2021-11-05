package com.company.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class InsertionSortTest {


    @Test
    public void sortAverageArrayTest(){
        //Inicializacion
        Integer[] array = new Integer[]{2,1,3,4,5,6,7,8};
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();
        IntegerComparator integerComparator = new IntegerComparator();
        //Ejecucion
        bubbleSort.sort(array, integerComparator);
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
    public void sortAverageArrayTest_Insercion(){
        //Inicializacion
        Integer[] array = new Integer[]{5,6,7,1,8};
        InsertionSort<Integer> insercion = new InsertionSort<>();
        IntegerComparator integerComparator = new IntegerComparator();
        //Ejecucion
        insercion.insertionSort(array, integerComparator);
        //Validacion
        Assertions.assertEquals(1, array[0]);
        Assertions.assertEquals(5, array[1]);
        Assertions.assertEquals(6, array[2]);
        Assertions.assertEquals(7, array[3]);
        Assertions.assertEquals(8, array[4]);
    }

    //1 2 3 4 6 5
    //

    @Test
    public void alreadySortedArrayTest(){
        //Inicializacion
        Integer[] array = new Integer[]{1,2,3,4,5,6,7,8};
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();
        IntegerComparator integerComparator = new IntegerComparator();
        //Ejecucion
        bubbleSort.sort(array, integerComparator);
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
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();
        IntegerComparator integerComparator = new IntegerComparator();
        //Ejecucion
        bubbleSort.sort(array, integerComparator);
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
        BubbleSort<String> bubbleSort = new BubbleSort<>();
        StringComparator sC = new StringComparator();
        //Ejecucion
        bubbleSort.sort(array, sC);
        //Validacion
        Assertions.assertEquals("a", array[0]);
        Assertions.assertEquals("c", array[1]);
        Assertions.assertEquals("h", array[2]);
        Assertions.assertEquals("j", array[3]);
        Assertions.assertEquals("p", array[4]);
    }
}


//"heredando" una interfaz -> implements
class StringComparator implements Comparator<String>{

    @Override
    public int compare(String first, String second) {
        return first.compareTo(second);
    }

}

class IntegerComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer first, Integer second) {
        return first.compareTo(second);
    }
}