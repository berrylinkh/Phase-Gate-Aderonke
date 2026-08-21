

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class  IntegerTest {



 @Test
    public void thatThisIsCorrect(){
    int  numbers= 38;
    int expectedResult = Integer.addingInteger(numbers);
    int actualResult = 2;
    assertEquals (actualResult, expectedResult);
    }


    @Test
    public void arrayOfIntegerOfNumber () {
    int[] numbers = {2,2,1};
    int expectedResult = Integer.arrayNumber(numbers);
    int actualResult = 1;
    assertEquals (actualResult, expectedResult);
    }
}
