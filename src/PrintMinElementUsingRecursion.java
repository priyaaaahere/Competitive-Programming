import java.util.Arrays;

public class PrintMinElementUsingRecursion {
    public static int MinElement(int[] arr,int n){
        if(n==1){
            return arr[0];
        }
        return Math.min(arr[n-1],MinElement(arr,n-1));
    }
    public static void main(String[] args){
        int[] array={12, 3, 18, 1, 5, 9};
        int n=array.length;
        int minElement=MinElement(array,n);
        System.out.println("Minimum element in the array: "+minElement);
    }
}
