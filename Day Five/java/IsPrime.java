





public class IsPrime {
    public static void main (String [] args) {


    int firstNumber = 20;   
    boolean primeResult = isPrime (firstNumber);


        System.out.println("It is prime: "+primeResult);
    }

    public static boolean isPrime (int numberOne) {
    boolean isPrime = true;
    boolean notPrime = false;

    if (numberOne % numberOne == 0 && numberOne % 1 ==0){
        
    return isPrime;
        }
    else{
    return notPrime;
        }
    }
}
