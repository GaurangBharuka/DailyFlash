import java.util.Scanner;
public class a154{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the character array: ");
        int size=scanner.nextInt();
        char[] characters=new char[size];
        System.out.println("Enter the characters:");
        for (int i=0; i<size;i++) {
            characters[i]=scanner.next().charAt(0);
        }
        System.out.println("Results:");
        for(int i=0;i<size;i++){
            char ch=characters[i];
            switch(ch){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    System.out.println(ch + " is a vowel");
                    break;
                default:
                    if ((ch>='a'&& ch<='z')||(ch>='A' && ch<='Z')) {
                        System.out.println(ch + " is a consonant");
                    } else {
                        System.out.println(ch + " is not a valid alphabet");
                    }
            }
        }
        scanner.close();
    }
}
