import java.util.Scanner;
class Duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of digits: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of array: ");
        int c[] = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
        }
        System.out.print("Output: ");
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (c[i] == c[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (isDuplicate==true) {
                c[i] = -1;
            }
            System.out.print(" " + c[i]);
        }
    }
}
