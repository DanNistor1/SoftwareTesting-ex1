package com.company;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.Parameter;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ArraysUtilsParametersTest2 {

    private static ArraysUtils arraysUtils;

    @Parameters
    public static Collection<Object[]> data() {
        Object[][] array = {{new int[]{1,3,5,7,9,10},3,1,new int[]{1,7,5,10,9},new int[]{1,5,7,9,10}},
                             {new int[]{1,3,5,7,9,10},7,3,new int[]{10,7,5,9,1},new int[]{1,5,7,9,10}},
                             {new int[]{1,3,5,7,9,10},6,-4,new int[]{9,7,10,5,1},new int[]{1,5,7,9,10}}};
        return Arrays.asList(array);
    }

    @Parameter(0)
    public int[] arrayToSearch;

    @Parameter(1)
    public int n;

    @Parameter(2)
    public int expectedSearch;

    @Parameter(3)
    public int[] arrayToSort;

    @Parameter(4)
    public int[] expectedSort;

    @BeforeClass
    public static void setUp() {
        arraysUtils = new ArraysUtils();
    }

    @Test
    public void binarySearchTest(){
        int result = arraysUtils.binarySearch(arrayToSearch, n);
        int expected = expectedSearch;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void bubbleSortTest(){
        arraysUtils.bubbleSort(arrayToSort);
        Assert.assertArrayEquals(expectedSort, arrayToSort);
    }
}
