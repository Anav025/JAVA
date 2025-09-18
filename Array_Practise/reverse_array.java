import java.util.*;
class reverse_array{
    public static void main( String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        int[] newarr = new int[arr.length]; 
        int c = 0;
        for(int i = arr.length-1 ; i >= 0 ; i--){
            newarr[c] = arr[i];
            c++;

        }

        System.out.println(Arrays.toString(newarr));
    
    }
}