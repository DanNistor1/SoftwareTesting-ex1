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
public class ArraysUtilsParametersTest {

    private static ArraysUtils arraysUtils;

    private static int[] convertIntegerToInt(Integer[] array) {
        int[] arr = new int[array.length];
        for (int i = 0; i <array.length ; i++) {
            arr[i] = array[i];
        }
        return arr;
    }

    @Parameters
    public static Collection<Integer[][]> data() {
        Integer[][][] array = {{{1,3,5,7,9,10},{3},{1},{1,7,5,10,9},{1,5,7,9,10}},
                             {{1,3,5,7,9,10},{7},{3},{10,7,5,9,1},{1,5,7,9,10}},
                             {{1,3,5,7,9,10},{6},{-4},{9,7,10,5,1},{1,5,7,9,10}}};
        return Arrays.asList(array);
    }

    @Parameter(0)
    public Integer[] arrayToSearch;

    @Parameter(1)
    public Integer[] nArray;

    @Parameter(2)
    public Integer[] expectedSearchArray;

    @Parameter(3)
    public Integer[] arrayToSort;

    @Parameter(4)
    public Integer[] expectedSort;

    @BeforeClass
    public static void setUp() {
        arraysUtils = new ArraysUtils();
    }

    @Test
    public void binarySearchTest(){
        int result = arraysUtils.binarySearch(convertIntegerToInt(arrayToSearch), nArray[0]);
        int expected = expectedSearchArray[0];
        Assert.assertEquals(expected, result);
    }

    @Test
    public void bubbleSortTest(){
        int[] result = convertIntegerToInt(arrayToSort);
        arraysUtils.bubbleSort(result);
        Assert.assertArrayEquals(convertIntegerToInt(expectedSort), result);
    }
}
