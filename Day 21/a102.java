import java.util.*;
public class a102 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value in celcius: ");
        int c=sc.nextInt();
        double f=(1.8*c)+32;
        System.out.print("Temperature in Fahrenheit= " +f+ " F");
    }
}
