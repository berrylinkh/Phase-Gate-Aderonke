

public class IsAdd {
    public static void main (String [] args) {


    int firstNumber = 20;   
    int secondNumber = 10; 
    int addResult = isAdd (firstNumber, secondNumber);


        System.out.println("The sum is: "+addResult);
    }

    public static int isAdd (int numberOne, int numberTwo) {

    int sum = numberOne + numberTwo;

    return sum;
    }
}
