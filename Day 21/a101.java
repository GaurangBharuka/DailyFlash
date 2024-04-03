import java.util.*;
public class a101 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n1: ");
        int n1=sc.nextInt();
        System.out.print("Enter the value of n2: ");
        int n2=sc.nextInt();
        if(n1<n2 || n2==0){
            System.exit(0);
        }
        System.out.print("Quotient= " +n1/n2);
        System.out.print("\nRemainder= " +n1%n2);
    }
}
