class Pattern14{
    public static void main(String[] args){
        int s=1;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                if(j<=3-i+1){
                    System.out.print("   ");
                }
                else{
                    System.out.print("  " +s);
                    s++;
                }
            }
            System.out.println();
        }
    }
}