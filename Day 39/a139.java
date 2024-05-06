import java.util.Scanner;
public class a139 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        int temp=0;
        while(n>0){
            int a=n%10;
            temp+=a;
            n/=10;
        }
        System.out.print("Sum of all digits is " +temp);
    }
}
