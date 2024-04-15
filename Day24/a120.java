import java.util.*;
public class a120 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of digits: ");
        int n=sc.nextInt();
        int c[]=new int[n];
        System.out.print("Enter the array: ");
        for(int i=0;i<n;i++){
            c[i]=sc.nextInt();
        }
        System.out.print("Even elements are: ");
        for(int i=0;i<n;i++){
            if(c[i]%2==0){
                System.out.println(c[i]);
            }
        }
    }
}
