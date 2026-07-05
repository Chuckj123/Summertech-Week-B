//1
// import javpdu;hs sakdsad
public class Functions{
    //2
    public static void main(String[]args){
        System.out.println(add(999,20));
        Functions.add(100000,62189);
        System.out.println(getFirstLetter("Hello"));
    }
    //4
    public static int add(int a, int b){
    
        int sum = a+b;
        return sum;

    } 
    public static char getFirstLetter(String a){
        char output = a.charAt(0);
        return output;

    }
}
//5