



public class IsSquare{
    public static void main (String [] args) {


    int firstNumber = 20;   
    int squareResult = isSquare (firstNumber);


        System.out.println("The square is: "+squareResult);
    }

    public static int isSquare (int numberOne) {

    int square = numberOne * numberOne;

    return square;
    }
}
