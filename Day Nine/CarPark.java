import java.util.Scanner;
    public class CarPark {
        public static void main (String [] args) {
        Scanner scanned = new Scanner(System.in);
        int counter =0;
        int emptySpaceCounter =0;
        int occupiedSpaceCounter =0;

        int[] mycarlotOne ={0,1};
        int[] mycarlotTwo ={0,1};
        int[] mycarlotThree ={0,1};
        int[] mycarlotFour ={0,1};
        int[] mycarlotFive ={0,1};
        int[] mycarlotSix ={0,1};
        int[] mycarlotSeven ={0,1};
        int[] mycarlotEight ={0,1};
        int[] mycarlotNine ={0,1};
        int[] mycarlotTen ={0,1};
        int[] mycarlotEleven ={0,1};
        int[] mycarlotTwelve ={0,1};
        int[] mycarlotThirteen ={0,1};
        int[] mycarlotForteen ={0,1};
        int[] mycarlotFifteen ={0,1};
        int[] mycarlotSixteen ={0,1};
        int[] mycarlotSeventeen ={0,1};
        int[] mycarlotEighteen ={0,1};
        int[] mycarlotNineteen ={0,1};
        int[] mycarlotTwenty ={0,1};
        

        int[][] myCarOption = { mycarlotOne, mycarlotTwo,mycarlotThree,mycarlotFour, mycarlotFive, mycarlotSix, mycarlotSeven, mycarlotEight, mycarlotNine, mycarlotTen, mycarlotEleven, mycarlotTwelve, mycarlotThirteen, mycarlotForteen, mycarlotFifteen, mycarlotSixteen, mycarlotSeventeen, mycarlotEighteen, mycarlotNineteen, mycarlotTwenty};


        System.out.println("Choose a parking slot: ");
        //int lotChecker = scanned.nextInt();
        for(int count =0; count < myCarOption.length; count++){
            int lotChecker = scanned.nextInt();
            counter ++;
            int[] myOptionholder =myCarOption[count];

            for(int index =0; index < myOptionholder.length; index ++) {
            if (myOptionholder[index] == 0) {
                System.out.printf("Slot %d is empty%n", lotChecker);
             }
            
            else {
                if (myOptionholder[index] == 1) {
            System.out.println("The slot has been occupied");
}
                }
                
            }
            }

    } 
}
