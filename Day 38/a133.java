import java.util.*;
class a133{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        long n=sc.nextLong();
        int count1=0;
        int count2=0;
        while(n>0){
            long a=n%10;
            if(a%2==0){
                count1++;
            }
            else{
                count2++;
            }
            n/=10;
        }
        System.out.print("Even digit count: " +count1);
        System.out.print("\nOdd digit count: " +count2);
    }
}