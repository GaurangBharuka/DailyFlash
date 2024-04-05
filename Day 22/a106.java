import java.util.*;
public class a106 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=0;
        while(n>=1){
            int a=n%10;
            temp=temp*10+a;
            n=n/10;
        }        
        System.out.print(temp);
    }
}
