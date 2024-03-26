import java.util.*;
class Fibonnaci1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        int n1=0;
        int n2=1;
        for(int i=1;i<=n;i++){
            System.out.print(n1+ " ");
            int num=n1+n2;
            n1=n2;
            n2=num;
        }
    }
}