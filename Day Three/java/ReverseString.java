


public class ReverseString{
    public static void main (String [] args) {
    
    String[] name = {"Aderonke","john", "lola"};
    String [] reverse = new String [name.length];
    

    for(int count = name.length; count >= 0 ; count --) {
        reverse = name[count];
        System.out.print (reverse[count]); 
        }
    }
}

