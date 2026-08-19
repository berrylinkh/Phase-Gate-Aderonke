

public class FatherCurrentAge {
    public static void main (String [] args) {

    gettingTheFathersAge (56, 30);
    
    }

    public static void gettingTheFathersAge (int currentFatherAge, int currentSonAge) {
    int ageResult =  (currentFatherAge - (currentSonAge *2) );

        if (currentFatherAge  == ageResult ) {
        System.out.println("father age will be twice the son in:  "+ageResult );
        }

        else { 
        System.out.println("father age is equal to the son : " +ageResult);
    }
    }
}





