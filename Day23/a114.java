import java.util.*;
class Addition{
    public static int add(int n1,int n2){
        return n1+n2;
    }
}
public class a114 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int result=Addition.add(n1,n2);
        System.out.print("Addition is = " +result);
    }
}
