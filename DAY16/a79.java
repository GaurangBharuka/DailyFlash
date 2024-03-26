import java.util.*;
class Electricity{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of units: ");
        int n=sc.nextInt();
        int res=n*5;
        System.out.print("Your electricity bill is " +res+ " rs");
    }
}
