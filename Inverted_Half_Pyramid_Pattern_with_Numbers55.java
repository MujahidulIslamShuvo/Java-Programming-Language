public class Inverted_Half_Pyramid_Pattern_with_Numbers55 {
    public static void invertedNumber(int n){
        for(int i=1;i<=n;i++){
            for(int j = 1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        invertedNumber(5);
    }
}
