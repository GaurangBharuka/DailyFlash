import java.util.*;
public class a100 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n1: ");
        int n1=sc.nextInt();
        System.out.print("Enter the value of n2: ");
        int n2=sc.nextInt();
        if(n1%2!=0 || n2%2!=0){
            System.exit(0);
        }
        System.out.print("\nSquare of n1 is " +n1*n1);
        System.out.print("\nCube of n1 is " +n1*n1*n1);
        System.out.print("\nSquare of n2 is " +n2*n2);
        System.out.print("\nCube of n2 is " +n2*n2*n2);
    }
}
