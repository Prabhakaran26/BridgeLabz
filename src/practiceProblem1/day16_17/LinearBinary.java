package practiceProblem1.day16_17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LinearBinary {
    public static void main(String[] args) {
        //I have also created a helper method for each question to Define input, we can call the helper method
        // and it calls the actual by passing the input.In main methed i can't define input for all questions
        binarySearch();
    }

    public static void binarySearch(){
        int[] arr = {1,2,3,4,5,6,7};
        int target = 2;
        System.out.println("Arrays : "+Arrays.toString(arr)+" , Target : "+target);
        System.out.println(binarySearch(arr,target));

    }
    public static int binarySearch(int[] arr, int target){
        int start = 0, end = arr.length-1;
        while(start < end){
            int mid = ( start + end ) / 2;
            if(arr[mid] > target){
                end = mid - 1;
            } else if(arr[mid] < target){
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void firstMissingPositiveNum(){
        int[] arr = {-8, 0, -1, -4, -3};
        System.out.println("Array: "+Arrays.toString(arr));
        System.out.println(firstMissingPositiveNum(arr));
    }
    public static int firstMissingPositiveNum(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i : arr){
            if(i > max){
                max = i;
            }
        }
        if(max <= 0){
            return 1;
        }
        int[] freq = new int[max+1];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                freq[arr[i]]++;
            }
        }
        for(int i=1;i<freq.length;i++){
            if(freq[i] == 0){
                return i;
            }
        }
        System.out.println(Arrays.toString(freq));
        return -1;
    }

    public static void findOccurence(){
        int[] arr = {1, 2, 4, 5, 6};
        int[] ans = new int[2];
        int target = 3;
        ans[0] = findOccurence(arr, target, true);
        if(ans[0] == -1){
            System.out.println("Element Not Found");
            ans[1] = -1;
        } else {
            ans[1] = findOccurence(arr, target, false);
        }
        System.out.println(Arrays.toString(ans));
    }
    public static int findOccurence(int[] arr, int target, boolean isFirst){
        int start = 0, end = arr.length-1;
        int val = -1;
         while(start <= end){
             int mid = (start + end) / 2;
             if(arr[mid] > target){
                 end = mid - 1;
             } else if(arr[mid] < target){
                 start = mid + 1;
             } else {
                 val = mid;
                 if(isFirst){
                     end = mid - 1;
                 } else {
                     start = mid + 1;
                 }
             }
         }
         return val;
    }

    public static void search2D(){
        int[][] standardMatrix = {
                {1,   3,  5,  7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        System.out.println(search2D(standardMatrix,16));
    }
    public static boolean search2D(int[][] arr, int target){
        int i = 0, j = arr.length-1;
        while(i <= j){
            if(arr[i][j] < target){
                i++;
            } else if(arr[i][j] > target){
                j--;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void findPeak(){
        int[] arr = {1, 5, 2, 3, 7, 6, 4};
        System.out.println("Array : "+Arrays.toString(arr));
        System.out.println(findPeak(arr));
    }
    public static int findPeak(int[] arr){
        int start = 0, end = arr.length-1;
        while(start < end){
            int mid = (start + end) / 2;
            if(arr[mid] > arr[mid+1]){
                end = mid;
            } else {
                start = mid +1;
            }
        }
        return start;
    }

    public static void findSmallRotateArr(){
        int[] arr = {1,2,3,4,5};
        System.out.println("This is a Rotated Array : "+Arrays.toString(arr));
        System.out.println(findSmallRotateArr(arr));

    }
    public static int findSmallRotateArr(int[] arr){
        int start = 0,end = arr.length-1;
        while(start < end){
            int mid = (start + end) / 2;
            if(arr[mid] > arr[mid+1]){
                return mid+1;
            }
            else if(arr[mid] > arr[end]){
                start = mid + 1;
            }
            else if(arr[mid] < arr[end]){
                end = mid;
            }
        }
        return end;
    }

    public static void findSenctence(){
        String[] sentences = {
                "The quick brown fox jumps over the lazy dog.",
                "I am currently mastering Java full stack technologies.",
                "Spring Boot makes backend development incredibly fast.",
                "We enjoyed watching the thrilling T20 cricket match yesterday."
        };

        // Test Case 1: Word exists in the array
        String searchWord1 = "Python";
        System.out.println(findSentence(sentences,searchWord1));
    }
    public static String findSentence(String[] sentence, String word){
        if(sentence.length == 0 || word.length() == 0 ){
            return "Empty String";
        }
        for(String ss : sentence){
            String[] str = (ss.split(" "));
            for(String s : str){
                if(s.trim().equals(word)){
                    return ss;
                }
            }
        }
        return "Not Found";
    }


    public static void findNeg()    {
        int[] arr = {12,34,54,56,-43,21,-88,2};
        System.out.println(findNeg(arr));
    }
    public static int findNeg(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i] < 0){
                return i;
            }
        }
        return -1;
    }
}
