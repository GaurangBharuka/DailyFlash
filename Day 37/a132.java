import java.util.*;
public class a132 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of array elements: ");
        int n=sc.nextInt();
        int c[]=new int[n];
        System.out.print("Enter the array elements: ");
        for(int i=0;i<n;i++){
            c[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for (int j = i + 1; j < n; j++) {
                if (c[i] < c[j]) {
                    int temp = c[i];
                    c[i] = c[j];
                    c[j] = temp;
                }
            }
        }
        System.out.print("After sorting: ");
        for (int i = 0; i < n; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println(); 
        int min = c[n - 1];
        int max = c[0];
        System.out.println("Minimum element: " + min);
        System.out.println("Maximum element: " + max);
    }
}
