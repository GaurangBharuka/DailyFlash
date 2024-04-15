import java.util.*;
public class a121 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("N = ");
        int n=sc.nextInt();
        if(n<100){
            System.exit(0);
        }
        for(int i=100;i<=n;i++){
            int x=i;
            int temp=0;
            while(x>0){
                int a=x%10;
                temp=temp*10+a;
                x=x/10;
            }
            if(temp==i){
                System.out.println(i);
            }            
        }
    }
}
