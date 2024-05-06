import java.util.Scanner;
public class a138 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        int sum=0;
        int mul=1;
        if(n<100){
            System.exit(0);
        }
        while(n>0){
            int a=n%10;
            sum+=a;
            mul*=a;
            n/=10;
        }
        if(sum==mul){
            System.out.print("Entered number is Spy number");
        }
        else{
            System.out.print("Entered number is not Spy number");
        }
    }
}
