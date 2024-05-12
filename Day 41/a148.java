import java.util.*;
public class a148 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number subjetcs: ");
        int n=sc.nextInt();
        int marks[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("sub " +(i+1)+ "= ");
            marks[i]=sc.nextInt();
        }
        int total=0;
        for(int i=0;i<n;i++){
            total+=marks[i];
        }
        System.out.print("Total marks secured:  " +total);
    }
}
