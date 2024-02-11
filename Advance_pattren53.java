public class Advance_pattren53 {
    public static void hollo_rctangle(int row,int colam){
        for(int i=1 ;i<=row;i++){
            for(int j=1;j<=colam;j++){
                if(i==1 || i==row || j==1 || j==colam){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }


            }
            System.out.println();
        }
    }
    public static void main(String [] args){
        hollo_rctangle(4, 5);
    }
}
