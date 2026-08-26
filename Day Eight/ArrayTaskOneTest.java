


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    public class ArrayTaskOneTest{
        @Test

        public void testingTheArrayOfNumber () {
        int[] arrayNumber = {2,8,14,5,1};
        int[] expectedResult = ArrayTaskOne.multiplyTheEvenAndAddTheOdd(arrayNumber);
        int[] actualResult = {4,16,28,6,2};

        assertArrayEquals(actualResult,expectedResult);
    }

         @Test

        public void testingTheSymbol () {
        String symbol = "{()}[]<>";
        boolean expectedResult = ArrayTaskOne.isCompleteSymbol(symbol);
        boolean actualResult = true;

        assertEquals(actualResult,expectedResult);
    }

        @Test

        public void testingSumTheArray () {
        int[][] multipleNumber = {{3,5,7}, {2,2,2},{4,1,9}};
        int[] expectedResult = ArrayTaskOne.sumTheNumberInTheArray(multipleNumber);
        int[] actualResult = {15,6,14};


    }
}
