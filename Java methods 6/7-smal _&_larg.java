import java.util.*;
class largestof3{
    public static int largest(int n1 , int n2 , int n3){
        if (n1>n2){
            
        }
       
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number-");
        int n = sc.nextInt();
        if(check(n)==1){
            System.out.println("number is positive.");

        }
        else if(check(n)==-1){
            System.out.println("number is negative.");

        }
        else{
            System.out.println("number is zero.");
        }
        sc.close();


    }
}