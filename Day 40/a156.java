import java.util.*;
class SquareNum123{
    public static int square(int a){
        int res=a*a;
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a=sc.nextInt();
        SquareNum123 s=new SquareNum123();
        int r=s.square(a);
        System.out.print(r);
    }
}