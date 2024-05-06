import java.util.Scanner;

public class a140 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the elements in array: ");
        int n=sc.nextInt();
        char c[]=new char[n];
        for(int i=0;i<n;i++){
            c[i]=sc.next().charAt(0);
        }
        for(int i=0;i<n;i++){
            if(c[i]>='a' && c[i]<='z'){
                System.out.println(c[i]+ " is lower case.");
            }
            else if(c[i]>='A' && c[i]<='Z'){
                System.out.println(c[i]+ " is upper case");
            }
        }
    }
}
