import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarParkTest {
    @Test
    public void testingTrackerForSlot (){
    int totalSlotNumber = 20;
    int expectedResult = CarParkFunction.carLotTracker(totalSlotNumber);
    int actualResult = 19;
    assertEquals (actualResult,expectedResult);
    } 
}
