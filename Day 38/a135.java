import java.util.*;
public class a135 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n=sc.nextInt();
        float c[]=new float[n];
        float temp=0;
        System.out.print("Enter array elements: ");
        for(int i=0;i<n;i++){
            c[i]=sc.nextFloat();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(c[i]>c[j]){
                   temp=c[i]; 
                }
                else{
                    temp=c[j];
                }
            }
        }
        System.out.print(temp+ " is greater among all entered elements.");
    }
}
