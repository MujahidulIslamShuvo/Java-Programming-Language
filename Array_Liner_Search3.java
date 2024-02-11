public class Array_Liner_Search3{
    public static int LinerSearch(int number[],int key){
        for(int i = 0;i<=number.length;i++){
            if(number[i] == key){
                System.out.println(i);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {1,43,5,10,50,60};
        int Key = 10;
        int index = LinerSearch(numbers, Key);
            if(index==-1){
                System.out.println("NOT FOUND");
            }else{
                System.out.println("Key is at index"+index);
            }
        
    }
}