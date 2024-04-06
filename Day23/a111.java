import java.util.*;
public class a111 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Entered the number of elements in array: ");
        int n=sc.nextInt();
        int c[]=new int[20];
        System.out.print("Enter the array elements: \n");
        for(int i=0;i<n;i++){
            c[i]=sc.nextInt();
        }
        System.out.print("Array elements in reverse order are: ");
        for(int i=n;i>=0;i--){
            System.out.println(c[i]);
        }
    }
}
