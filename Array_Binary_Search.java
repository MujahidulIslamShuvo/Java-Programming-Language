public class Array_Binary_Search {
    public static int BinarySearch(int number[],int key){
        int start = 0,  end = number.length-1;
        while(start <= end){
            int mid =(start + end)/2;
            if(number[mid]==key){//found
                return mid;
            }
            if(number[mid]<key){//2nd hulf
                start = mid+1;
            }else{//first hulf
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[] = {2,4,6,8,10,12,14};
        int key = 10;
        int result = BinarySearch(number, key);
        if(result !=-1){
            System.out.println("Element found in index "+result);
        }else{
            System.out.println("not found");
        }
    }
}
