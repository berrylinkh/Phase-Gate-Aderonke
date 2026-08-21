



public class TheLargest {
    public static void main (String [] args) {


    int firstNumber = 20;   
    int secondNumber = 10; 
    int thirdNumber = 30;
    int largestResult = isLargest (firstNumber, secondNumber, thirdNumber);


        System.out.println("The largest is: "+largestResult);
    }

    public static int isLargest (int numberOne, int numberTwo,  int numberThree) {

    int largest = 0;
    if( numberOne > numberTwo &&  numberOne > numberThree ) {
       largest = numberOne;

    }
    else if ( numberTwo > numberOne &&  numberTwo > numberThree ) {
          largest = numberTwo;
        
    }
    else if ( numberTwo > numberOne &&  numberTwo > numberThree ){
           largest = numberThree;
            
        }
        return largest;
    }
}
