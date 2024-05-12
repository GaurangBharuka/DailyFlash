import java.util.*;
class Sortarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n=sc.nextInt();
        int c[]=new int[n];
        System.out.println("Enter the elements of array: ");
        for (int i=0;i<n;i++) {
            c[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++) {
            for (int j=i+1;j<n;j++) {
                if (c[j]<c[i]){
                    int temp=c[i];
                    c[i]=c[j];
                    c[j]=temp;
                }
            }
        }
        System.out.println("Sorted array in ascending order:");
        for (int i=0;i<n;i++) {
            System.out.print(c[i] + " ");
        }
    }
}
