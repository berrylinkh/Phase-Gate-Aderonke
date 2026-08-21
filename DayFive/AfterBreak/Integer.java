
public class Integer{
    public static int addingInteger (int number) {
   
    int oneInterger = number;
    int reverse = (oneInterger /10) % 10;
    int reverse2 = oneInterger %10;
    int sum = reverse +reverse2; 

    int newReverse = (sum  /10) % 10;
    int newReverse2 = sum  %10;
    int totalSum = newReverse +newReverse2;
   
   
   return totalSum; 
    }


   public static int arrayNumber (int[] number) {
    
    int[] numbers = {2,2,1};
    int value = numbers[0];
    int counter = 0;
    
    for(int count =0; count < numbers.length; count++) {
    if (numbers[count] != value) {
    counter ++;
        }
    }  
    return counter;  
    }
}



