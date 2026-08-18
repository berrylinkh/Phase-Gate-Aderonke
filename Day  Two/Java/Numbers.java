

public class Numbers {
    public static void main (String [] args) {

    int sum =3;
    int counter = 0;

    for (int count =1; count <=100; count ++) {
    if (count % sum != 0) { 
    counter = count; 
    System.out.print(counter +", ");
    }
    }
    }  
  
}
