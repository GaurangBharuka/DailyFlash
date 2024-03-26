import java.util.*;
class Amstrong2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        int temp=0;
        int x=n;
        while(n>=1){
            int a=n%10;
            temp=temp+(a*a*a);
            n=n/10;
        }
        if(temp==x){
            System.out.print("It is an amstrong number");
        }
        else{
            System.out.print("Not an amstrong number");
        }
    }
}
