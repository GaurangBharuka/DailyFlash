public class a142 {
    public static void main(String[] args) {
        char[] c= {'A', 'A', 'B', 'C', 'A', 'B', 'C', 'D', 'E', 'A', 'B', 'C', 'D', 'E', 'F', 'G'}; 
        int index=0;
        for(int i=0;i<4;i++){
            for(int j=0;j<4-i-1;j++){
                System.out.print("   ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print(c[index++]+ "  ");
            }
            for(int j=0;j<4-i-1;j++){
                System.out.print("   ");
            }
            System.out.println();
        }
    }
}
