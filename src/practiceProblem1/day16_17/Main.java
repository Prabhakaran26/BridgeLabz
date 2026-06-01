package practiceProblem1.day16_17;

import com.sun.source.doctree.SeeTree;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {43, 45, 23, 9, 87,19,32,44};
        fib(0,1,8);
       // System.out.println(Arrays.toString(arr));
    }

    public static void fibnocciIterate(int n){
        int a = 0, b = 1;
        int i = 0;
        while(i<n){
            System.out.print(a+" ");
            int temp = b;
            b = a+b;
            a = temp;
            i++;
        }
    }
    public static void fib(int a, int b, int n){
        if(n == 0){
            return;
        }
        System.out.print(a+" ");
        fib(b,a+b,--n);
    }

    public static void compareString(){
        String str = "";
        for(int i=0;i<5;i++){
            str += (char)(i+65);
        }
        System.out.println(str);

        StringBuilder sbuild = new StringBuilder();
        for(int i=0;i<5;i++){
            sbuild.append((char)(i+65));
        }
        System.out.println(sbuild);

        StringBuffer sbuff = new StringBuffer();
        for(int i=0;i<5;i++){
            sbuff.append((char)(i+65));
        }
        System.out.println(sbuff);
    }

    public static void searching(){
        int[] arr = {12,32,43,54,56,78};
        int target = 56;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                System.out.println(arr[i] +": Target Found");
            }
        }

        Set<Integer> st = new HashSet<>();
        st.addAll(List.of(12,32,43,54,56,78));
        System.out.println(st.contains(56));

        TreeSet<Integer> ts = new TreeSet<>();
        st.addAll(List.of(12,32,43,54,56,78));
        System.out.println(st.contains(56));
    }

    public static void quickSort(int[] arr, int low, int high){
        if(low < high){
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }
    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low - 1;
        for(int j=low;j<high;j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    public static void mergeSort(int[] arr, int low, int high){
        if(low < high){
            int mid = (low+high)/2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid+1, high);
            merge(arr, low, mid, high);
        }
    }
    public static void merge(int[] arr, int low, int mid, int high){
        List<Integer> list = new ArrayList<>();
        int left = low;
        int right = mid+1;
        while(left <= mid && right <= high){
            if(arr[left] < arr[right]){
                list.add(arr[left]);
                left++;
            } else {
                list.add(arr[right]);
                right++;
            }
        }

        while(left <= mid){
            list.add(arr[left]);
            left++;
        }
        while(right <= high){
            list.add(arr[right]);
            right++;
        }

        for(int i=0;i<list.size();i++){
            arr[low+i] = (int) list.get(i);
        }
    }

    public static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length;i++){
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

    public static void linearSearch(int[] arr, int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                System.out.println(arr[i]+ ": Target found");
            }
        }
    }
    public static void binarySearch(int[] arr, int target){
        int start = 0, end = arr.length-1;
        int mid = (start + end)/2;
        while(start < end){
            if(arr[mid] == target){
                System.out.println(arr[mid]+" Target found");
                return;
            } else if(arr[mid] > target){
                end = mid - 1;
            } else if(arr[mid] < target){
                start = mid + 1;
            }
        }
    }
}
