








public class AreaOfTriangele{
    public static void main (String [] args) {


    int numberOne = 20;
    int numberTwo = 10;
    int areaResult = areaOfTriangle (numberOne, numberTwo);


        System.out.println("The area is: "+areaResult);
    }

    public static int areaOfTriangle (int length , int  breath) {

    int area = length * breath;

    return area;
    }
}
