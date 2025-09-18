public class min_max_array {
    public static void main( String[] args){
        int[] arr = {3, 5, 1, 8, -2};
        int min =arr[0];
        int max = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]<min){
                min = arr[i];

               
            }
        }
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];

               
            }
        }
        System.out.println("max = " + max  + " , " + "min = " + min);
         
    }

    
}
