package com.company;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class ArraysUtilsAssertJTest {

    private ArraysUtils arraysUtils;

    @Before
    public void setUp() {
        arraysUtils = new ArraysUtils();
    }

    @Test
    public void bubbleSort(){
        int[] array = {1,7,5,10,9};
        arraysUtils.bubbleSort(array);
        Assertions.assertThat(array)
                .contains(1)
                .contains(7)
                .hasSize(5);
    }

}
