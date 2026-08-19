




 public class FirstVowelInString {
    public static void main (String [] args) {
    
    String name = "aderonke";
  

for (int count = 0 ; count < name.length(); count++) {
    if(name.charAt(count) == 'a' || name.charAt(count) == 'e' || name.charAt(count) == 'i' || name.charAt(count) == 'o' || name.charAt(count) == 'u'){
                
        System.out.print(name.charAt(count));
    }

}
}


}
