import java.util.*;
public class a112 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice;
        do{
            System.out.println("1)Int");
            System.out.println("2)Char");
            System.out.println("3)Float");
            System.out.println("4)Double");
            System.out.print("Enter your choice: ");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                  System.out.println("Size of int is " +Integer.BYTES+ " bytes");
                  break;

                case 2:
                  System.out.println("Size of char is " +Character.BYTES+ " bytes");
                  break;

                case 3:
                  System.out.println("Size of float is " +Float.BYTES+ " bytes");
                  break;

                case 4:
                  System.out.println("Size of double is " +Double.BYTES+ " bytes");
                  break;

                default:
                  System.out.println("Enter a valid choice. ");
            }
        }
        while(choice<=4);
    }
}
