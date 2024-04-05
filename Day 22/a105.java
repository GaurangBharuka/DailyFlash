import java.util.*;
public class a105 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        if(n<100){
            System.exit(0);
        }
        while(n>1){
            int a=n%10;
            if(a==2){
                count++;
            }
            n=n/10;
        }
        System.out.print("Occurance of 2 = " +count);
    }
}
