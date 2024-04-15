import java.util.*;
public class a119 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of digits: ");
        int n=sc.nextInt();
        int c1[]=new int[10];
        System.out.print("arr 1: ");
        for(int i=0;i<n;i++){
            c1[i]=sc.nextInt();          
        }
        int c2[]=new int [c1.length];

        for(int i=0;i<n;i++){
            c2[i]=c1[i];
        } 
        System.out.print("arr 2: ");
        for(int i=0;i<n;i++){
            System.out.println(c2[i]);
        }
    }
}
