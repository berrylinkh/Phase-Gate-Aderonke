





public class SimpleInterest{
    public static void main (String [] args) {


    int thePrincipal = 20;
    int theRate = 10;
    int theTime = 2 ; 
    int interestResult = simpleInterest (thePrincipal, theRate ,theTime);


        System.out.println("The interest is: "+interestResult);
    }

    public static int simpleInterest (int principal, int rate, int time) {

    int interest = (principal * rate * time) / 100;

    return interest;
    }
}
