import java.util.*;
public class a137 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n=sc.nextInt();
        int c[]=new int[n];
        int sum=0;
        System.out.print("Enter array elements: ");
        for(int i=0;i<n;i++){
            c[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            sum+=c[i];
        }
        System.out.print("Sum of elements of array is " +sum);
    }    
}    