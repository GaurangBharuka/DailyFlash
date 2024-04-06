import java.util.*;
public class a110 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<0){
            System.out.print("Entered number is negative. ");
        }
        else if(n==0){
            System.out.print("Entered number is zero. ");
        }
        else{
            System.out.print("Entered number is positive. ");
        }
    }
}
