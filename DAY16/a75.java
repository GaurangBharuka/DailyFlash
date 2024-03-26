import java.util.*;
class Factorial2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        int s=1;
        if(n<0){
            System.exit(0);
        }
        else if(n==1){
            System.out.print(1);
        }
        while(n>=1){
            s=s*n;
            n--;
        }
        System.out.print(s);
    }
}

