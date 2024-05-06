public class a141 {
    public static void main(String[] args) {
        char c[]={'A','B','D','E'};
        for(int i=0;i<4;i++){
            for(int j=0;j<4-i-1;j++){
                System.out.print("   ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print(c[i++]+ "  ");
            }
            for(int j=0;j<4-i-1;j++){
                System.out.print("   ");
            }
            System.out.println();
        }
    }
}
