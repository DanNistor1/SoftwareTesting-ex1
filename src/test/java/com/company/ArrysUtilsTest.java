package com.company;

import org.junit.Assert;
import org.junit.Test;

public class ArrysUtilsTest {

    @Test
    public void binarySearchTest_elementExist(){
        int[] array = {1,3,5,7,9,10};
        int n=7;
        int result = new ArraysUtils().binarySearch(array,n);
        Assert.assertEquals(3,result);
    }

    @Test
    public void binarySearchTest_elementNotExist(){
        int[] array = {1,3,5,7,9,10};
        int n=5;
        int result = new ArraysUtils().binarySearch(array,n);
        Assert.assertEquals(2,result);
    }

    @Test
    public void bubbleSort(){
        int[] array = {1,7,5,10,9};
        new ArraysUtils().bubbleSort(array);
        Assert.assertArrayEquals(new int[]{1,5,7,9,10}, array);
    }

}
