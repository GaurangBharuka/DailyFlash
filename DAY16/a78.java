class Pattern15{
    public static void main(String[] args){
        int s=1;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4-i+1;j++){
                System.out.print("  " +s);
                s++;
            }
            System.out.println();
        }
    }
}