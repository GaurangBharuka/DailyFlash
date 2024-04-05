import java.util.*;
public class a107 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=0;
        while(n>0){
            int a=n%10;
            a++;
            temp=temp*10+a;
            n=n/10;
        }
        int temp1=0;
        while(temp>0){
            int a1=temp%10;
            temp1=temp1*10+a1;
            temp=temp/10;
        }
        System.out.print(temp1);
    }
}
