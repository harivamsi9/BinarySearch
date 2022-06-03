import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args){
        int[] arr = {1,3,4,5,13,20,25,40,42,44,53};
        System.out.println(binarySearch(arr,13)); // ANS: 4
        System.out.println(binarySearch(arr,2)); // ANS: -1
        System.out.println(binarySearch(arr,42));// ANS: 8
    }
    static int binarySearch(int[] arr,int target){
        // Return the index at which the number is present,
        // else return -1
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right-left) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            else if (target < arr[mid]){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return -1;
    }
}
