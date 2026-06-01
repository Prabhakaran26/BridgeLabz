package practiceProblem1.day16_17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = {3,4,1,3,2,5,2,8};
        countingSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr, int left, int right){
        if(left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }

    }
    public static void merge(int[] arr, int start, int mid, int end){
        List<Integer> list = new ArrayList<>();
        int left = start;
        int right = mid+1;
        int ind = 0;
        int[] mix = new int[end - start];
        while(left <= mid && right <= end){
            if(arr[left] < arr[right]){
                list.add(arr[left]);
                left++;
            } else {
                list.add(arr[right]);
                right++;
            }
        }

        while(left <= mid){
            list.add(arr[left++]);
        }
        while(right <= end){
            list.add(arr[right++]);
        }

        for(int i=0;i<list.size();i++){
            arr[start+i] = (int)list.get(i);
        }
    }

    public static void quickSort(int[] arr, int low, int high){
        if(low < high){
            int partition = partition(arr, low, high);
            quickSort(arr, low, partition-1);
            quickSort(arr, partition+1, high);
        }
    }
    public static int partition(int[] arr, int l, int h){
        int i = l, j = h;
        int pivot = arr[l];

        while(i <= j){
             while(i<=h && arr[i] <= pivot){
                 i++;
             }
            while(j>=l && arr[j] > pivot){
                j--;
            }
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[j];
        arr[j] = arr[l];
        arr[l] = temp;

        return j;
    }

    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int minInd = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j] < arr[minInd]){
                    minInd = j;
                }
            }
            int temp = arr[minInd];
            arr[minInd] = arr[i];
            arr[i] = temp;
        }
    }

    public static void countingSort(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        int[] freq = new int[max+1];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        int ind = 0;
        for(int i=0;i< freq.length;i++){
            if(freq[i] != 0){
                int k = freq[i];
                while(k!=0){
                    arr[ind++] = i;
                    k--;
                }
            }
        }
    }
}
