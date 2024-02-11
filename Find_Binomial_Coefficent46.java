public class Find_Binomial_Coefficent46 {
    public static int fectoril(int n){
        int f = 1;
        for(int i = 1;i<=n;i++){
            f = f * i;    
        }
        return f;
    }
    public static int binocoefi(int n,int r){
        int n_fecto = fectoril(n);
        int r_fecto = fectoril(r);
        int n_m_r_fecto = fectoril(n-r);
        int binocoefi = n_fecto/(r_fecto*n_m_r_fecto);
        return binocoefi;


    }
    public static void main(String[] args) {
        System.out.println(binocoefi(5, 2));
    }
}
