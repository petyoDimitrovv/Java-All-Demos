package p04_BubbleSortTest;

import org.junit.Test;

import static org.junit.Assert.*;

public class BubbleTest {

    @Test
    public void Test_isBubbleSortWork(){

        int[] numbers ={1, 2 ,12 ,6 ,3};
        int[] expected ={1 ,2, 3, 6, 12};

        Bubble.sort(numbers);
        assertArrayEquals(expected, numbers);


    }

}