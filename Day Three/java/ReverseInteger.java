


public class ReverseInteger{
    public static void main (String [] args) {

      int number = 12345;
      int digitOne = (number / 10000) %10;
      int digitTwo = (number / 1000) %10;
      int digitThree = (number / 100) %10;
      int digitFour = (number / 10) %10;
      int digitFive = number  %10;
    
      System.out.printf ("Reverse number is:%d%d%d%d%d ",digitFive, digitFour,digitThree,digitTwo,digitOne);
    }
}
