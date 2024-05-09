import java.util.*;
public class a144 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of digits in array: ");
        int n=sc.nextInt();
        int c[]=new int[n];
        int sum=0;
        int res=0;
        System.out.print("Enter the array: ");
        for(int i=0;i<n;i++){
            c[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            sum+=c[i];
            res=sum/n;
        }
        System.out.print("Average: " +res);
    }
}
