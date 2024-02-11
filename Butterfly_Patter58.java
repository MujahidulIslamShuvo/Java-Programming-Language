public class Butterfly_Patter58 {
    public static void butterfly(int n){
        //for line
        for(int i = 1;i<=n;i++){

        
            //for star
        for(int j = 1;j<=i;j++){
             System.out.print("*");
            }
                //for spaces
        for(int j = 1;j<=2*(n-i);j++){
             System.out.print(" ");  
            }
        for(int j = 1;j<=i;j++){
             System.out.print("*");
            }
             System.out.println();
            
        }
        //2nd hulf
        for(int i=n-1 ; i>=1 ;i--){
                //for star
        for(int j = 1;j<=i;j++){
            System.out.print("*");
                }
                    //for spaces
        for(int j = 1;j<=2*(n-i);j++){
            System.out.print(" ");  
            }
        for(int j = 1;j<=i;j++){
            System.out.print("*");
            }
            System.out.println();
                
        }
    }
    public static void main(String[] args) {
        butterfly(4);
        
    }
}
