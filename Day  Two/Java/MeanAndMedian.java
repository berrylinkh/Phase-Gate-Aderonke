

public class MeanAndMedian {
    public static void main (String [] args) {

    int firstNumber = 12;
    int secondNumber = 14;
    int thirdNumber = 15;

    int findingTheMean = 14;
    int median = 0;

    double average = firstNumber + secondNumber + thirdNumber / 3;

    if (firstNumber == findingTheMean) {
        median = firstNumber
    }
    else {
        if (secondNumber == findingTheMean) {
        median = secondNumber
    }
    else {
        if (thirdNumber == findingTheMean) {
        median = thirdNumber
    }

    System.out.println("The mean is: ",+average);
    System.out.println("The median is: ",+median);
    }
}


