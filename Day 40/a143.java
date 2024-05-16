import java.util.*;
public class a143 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        long n=sc.nextLong();
        long small=0;
        long temp=n;
        while(n>0){
            long a=n%10;
            if(a<temp){
                small=a;
             }
            else{
                small=temp;
            }
            temp=small;
            n/=10;
            
        }
        System.out.print(small+ " is the smallest digit.");
    }
}
