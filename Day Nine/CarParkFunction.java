import java.util.Scanner;
    public class CarParkFunction{

        public static int carLotTracker (int cars) {
        Scanner scanned = new Scanner(System.in);
        int[] Mycarlot = new int[20];
        int storex =0;
        int totalSlot =20;
        int availableLot = 0;
        
            //System.out.println("Enter car name and colour: ");
            for (int indexcounter =0;indexcounter < Mycarlot.length; indexcounter++ ){
                String carIdentity = scanned.nextLine();
                availableLot = totalSlot - 1;
                storex ++;
             if (storex != Mycarlot[indexcounter]) {
              //System.out.printf("%s Your slot number is: %d%n ", carIdentity,Mycarlot[indexcounter]);
              //System.out.printf("Total available slot remaining is: %d%n ",availableLot);

                //break;  
                }
              else if (storex == Mycarlot[indexcounter]) {
              System.out.println ("No available Slot");  
                }
            }   
        return availableLot; 
        }
}
