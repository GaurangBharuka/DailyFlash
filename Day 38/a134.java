import java.util.*;
public class a134 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        long n=sc.nextLong();
        long larg=0;
        long temp=0;
        while(n>0){
            long a=n%10;
            if(a>temp){
                larg=a;
             }
            else{
                larg=temp;
            }
            temp=larg;
            n/=10;
            
        }
        System.out.print(larg+ " is the largest digit.");
    }
}
