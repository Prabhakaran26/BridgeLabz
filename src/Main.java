import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {23,12,90,65,34,86,70};
        findSecondMaxNum(arr);
    }

    public static void checkSpecialNumber(int n){
        int num = n;
        int ans = 0;
        while(num > 0){
            int lastDigit = num % 10;
            int fact = 1;
            for(int i=1;i<=lastDigit;i++){
                fact *= i;
            }
            ans += fact;
            num /= 10;
        }
        //System.out.println(ans);
        if(ans == n){
            System.out.println(n+" is Special Number");
        } else {
            System.out.println(n+" is not a Special Number");
        }

    }

    public static void findSecondMaxNum(int[] arr){
        int max = -1;
        int secMax = -1;

        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                secMax = max;
                max = arr[i];
            }
            if(arr[i] > secMax && arr[i] != max){
                secMax = arr[i];
            }
        }
        System.out.println("The Second largest number is "+secMax);
    }
}
