import java.util.Scanner;
public class a145 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements in array1: ");
        int n1=sc.nextInt();
        System.out.print("Enter the number of elements in array2: ");
        int n2=sc.nextInt();
        int c1[]=new int[n1];
        int c2[]=new int[n2];
        int c3[]=new int[n1];
        System.out.println("Enter elements of first array: ");
        for(int i=0;i<n1;i++){
            c1[i]=sc.nextInt();
        }
        System.out.println("Enter elements of second array: ");
        for(int i=0;i<n2;i++){
            c2[i]=sc.nextInt();
        }
        for(int i=0;i<n1;i++){
            c3[i]=c1[i]+c2[i];
        }
        System.out.print("Array 3: ");
        for(int i=0;i<n1;i++){
            System.out.print(c3[i]+ " ");
        }
    }
}
