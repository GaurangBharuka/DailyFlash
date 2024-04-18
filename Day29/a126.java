import java.util.*;
public class a126 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int c[]=new int[n];
        System.out.println("Enter array: ");
        for(int i=0;i<n;i++){
            c[i]=sc.nextInt();
        }
        for(int i=0;i<n/2;i++){
            int temp=c[i];
            c[i]=c[n-i-1];
            c[n-i-1]=temp;
        }
        System.out.println("Array after swapping: ");
        for (int i=0;i<n;i++) {
            System.out.print(c[i] + " ");
        }
    }
}
