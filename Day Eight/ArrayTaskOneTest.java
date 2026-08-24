


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    public class ArrayTaskOneTest{
        @Test

        public void testingTheArrayOfNumber () {
        int[] arrayNumber = {2,8,14,5,1};
        int[] expectedResult = ArrayTaskOne.increasingTheNumbersOfEachElement(arrayNumber);
        int actualResult = {4,16,28,6,2};

        assertEquals(actualResult,expectedResult);
    }

        @Test

        public void testingTheSymbol () {
        int[][] multipleNumber = {{3,5,7}, {2,2,2},{4,1,9}};
        int[][] expectedResult = ArrayTaskOne.sumTheNumberInTheArray(multipleNumber);
        int[] actualResult = {15,6,14};

        assertEquals(actualResult,expectedResult);
    }
}
