import java.util.*;
class Amstrong{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n1=sc.nextInt();
        int x=n1;
        int temp=0;
        while(n1!=0){
            int a=n1%10;
            temp=temp+(a*a*a);
            n1=n1/10;
            System.out.println(a+ "   " +temp);
        }
        if(temp==x){
            System.out.println("armstrong number");
        }
        else{
            System.out.println("Not an armstrong number");
        }
    }
}