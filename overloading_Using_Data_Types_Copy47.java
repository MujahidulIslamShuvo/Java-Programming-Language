public class overloading_Using_Data_Types_Copy47 {
    public static int sum(int a,int b){
        return a+b;
    }
    public static float sum(float a, float b){
        return a+b;
    }
    public static void main(String args[]){
        System.out.println(sum(3.0f, 4.5f));
        System.out.println(sum(3,5));
    }
}
