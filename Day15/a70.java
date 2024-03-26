import java.util.*;
class Divisible1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        if(n<0){
            System.exit(0);
        }
        for(int i=1;i<=n;i++){
            if(i%3==0){
                System.out.print("  " +i);
            }
        }
    }
}