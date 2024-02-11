public class Array_trapping_rain_water {
    public static int trappingRainWater(int height[]){
         int n = height.length;
        //calculet left max bound
        int Leftmax[] = new int[n];
         Leftmax[0] = height[0];
         for(int i = 1;i<n;i++){
            Leftmax[i] = Math.max(height[i],Leftmax[i-1]);
         }
        //calculet right max bound
        int Rightmax[] = new int [n];
        Rightmax[n-1] = height [n-1];
        for(int i=n-2;i>=0; i--){
            Rightmax[i] = Math.max(height[i], Rightmax[i+1]);
        }
        //loop
        int trapedwater = 0;
        for(int i=0;i<n;i++){
            //water level = min(left max bound,right max bound)
            int waterlavel = Math.min(Leftmax[i],Rightmax[i]);
            //traped water = waterlevel -hight[i];
            trapedwater += waterlavel-height[i];
        }
        return trapedwater;
    }
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        int result = trappingRainWater(height);
        System.out.println("total Traped water is "+result);
    }
}
