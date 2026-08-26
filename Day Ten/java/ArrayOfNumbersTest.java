


import org.junit.jupiter.api.Test;

    import static org.junit.jupiter.api.Assertions.*;

        public class ArrayOfNumbersTest {
        @Test
        public void isTrueForNumberRepetition () {
        int[] numbers = {1,2,3,4,5,1};
        boolean expectedResult = ArrayOfNumbers.isTrueForNumber(numbers);
        boolean actualResult = true;

        assertEquals (actualResult, expectedResult);
        }

        @Test
        public void returnTheIntersectionNumber () {
        int[] numberOne = {9,4,9,8,5};
        int[] numberTwo = {4,9,5};
        int[] expectedResult = ArrayOfNumbers.findingTheIntersectionNumber(numberOne, numberTwo);
        int[] actualResult = {4,9,5};

        assertArrayEquals (actualResult, expectedResult);
        }

        @Test
        public void increaseLastNumberByOneInTheArray () {
        int[] numberOne = {1,2,3};
        int[] expectedResult = ArrayOfNumbers.addingOneToTheLastNumber(numberOne);
        int[] actualResult = {1,2,4};

        assertArrayEquals (actualResult, expectedResult);
        }

}
