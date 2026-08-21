



public class IsEven {
    public static void main (String [] args) {


    int firstNumber = 20;   
    int secondNumber = 10; 
    boolean evenResult = isEven (firstNumber, secondNumber);


        System.out.println("It is: "+evenResult);
    }

    public static boolean isEven (int numberOne, int numberTwo) {
    boolean even = true;
    boolean notEven = false;

    if (numberOne % 2 == 0 && numberTwo % 2 ==0){
        
    return even;
        }
    else{
    return notEven;
        }
    }
}
