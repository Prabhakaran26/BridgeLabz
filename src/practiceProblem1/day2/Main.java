package practiceProblem1.day2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5,2,8,1,11,2,8,4,15};
        sortArr(arr);
    }

    // Java Program to print the elements of an array
    public static void printElements(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    //Java Program to find the frequency of each element in the array
    public static void findFrequency(int[] arr){
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int count = 0;
            for(int j=0;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            mp.put(arr[i],count);
        }
        System.out.println(mp);
    }

    //Java Program to print the largest element in an array
    public static void largestElement(int[] arr){
        int max = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Largest Element is : "+max);
    }

    //Java Program to print the smallest element in an array
    public static void smallestElement(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Smallest element is : "+min);
    }

    //Java Program to print the elements of an array present on an even position
    public static void evenPosition(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(i%2 == 0){
                System.out.print(arr[i]+" ");
            }
        }
    }

    // Java Program to print the elements of an array in reverse order
    public static void reverse(int[] arr){
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }

    // Java Program to print the elements of an array present on odd position
    public static void oddPosition(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(i % 2 != 0){
                System.out.print(arr[i]+" ");
            }
        }
    }

    //Java Program to print the duplicate elements of an array
    public static void findDuplicates1(int[] arr){
        for(int i=0;i<arr.length;i++){
            int count = 0;
            for(int j=0;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count == 2){
                System.out.print(arr[i]+" ");
            }
        }
    }

    public static void findDuplicates2(int[] arr){
        int[] dup = new int[100];
        for(int i=0;i<arr.length;i++){
            dup[arr[i]]++;
        }
        for(int i=0;i<dup.length;i++){
            if(dup[i] >= 2){
                System.out.print(i+" ");
            }
        }
    }

    //Java Program to sort the elements of an array in ascending order
    public static void sortArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //Find 2nd Largest Number in an Array
    public static void secLrgElement(int[] arr){
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                secMax = max;
                max = arr[i];
            }
            if(arr[i] != max && arr[i] > secMax){
                secMax = arr[i];
            }
        }
        System.out.println("Largest : "+max);
        System.out.println("Second Largest : "+secMax);
    }
}
