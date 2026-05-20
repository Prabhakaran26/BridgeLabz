package practiceProblem1.day6;

import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        couponNumber();
    }


    //5. StopWatch
    public static void stopWatch(){
        System.out.println("enter the start time in hr:min:sec");{
            String startTime=sc.next();
            System.out.println("enter the endtime time in hr:min:sec");
            String endTime=sc.next();
            String[] startTimeArray=startTime.split(":");
            String[] endTimeArray=endTime.split(":");
            int startTimeInSeconds=Integer.parseInt(startTimeArray[0])*3600+Integer.parseInt(startTimeArray[1])*60+Integer.parseInt(startTimeArray[2]);
            int endTimeInSeconds=Integer.parseInt(endTimeArray[0])*3600+Integer.parseInt(endTimeArray[1])*60+Integer.parseInt(endTimeArray[2]);
            int diffInSeconds=endTimeInSeconds-startTimeInSeconds;
            System.out.println((diffInSeconds)/3600 +" hrs "+(diffInSeconds%3600)/60+" mins " +diffInSeconds%60 +" seconds");
        }
    }

    //4. Coupon Number
    public static void couponNumber(){
        Random random=new Random();
        int noCoupons=sc.nextInt();
        Set<Integer> set=new LinkedHashSet<>();
        int noOfTurns=0;
        while(noCoupons != set.size()){
            int randNo=random.nextInt(noCoupons)+1;
            if(!set.contains(randNo))
            {
                set.add(randNo);
            }
            noOfTurns++;
        }
        System.out.println(noOfTurns);
    }

    //3. Reverse Number
    public static void reverseNumber(int[] arr){
        System.out.println(Arrays.toString(arr));
        int start = 0, end = arr.length-1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end]  =  temp;
            start++;
            end--;
        }
        System.out.println("After Reverse");
        System.out.println(Arrays.toString(arr));
    }

    //2. Perfect Number
    public static void perfectNumber(int n){
        int sum = 0;
        for(int i=1;i<=n/2;i++){
            if(n%i == 0){
                sum += i;
            }
        }
        if(n == sum){
            System.out.println(n+" is Perfect Number");
        } else {
            System.out.println(n+" is not Perfect Number");
        }
    }

    //1. Fibonacci Series
     static void fibonacci(int n){
        int a = 0, b = 1;
        System.out.print(a+" ");

        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            int temp = a+b;
            a = b;
            b = temp;
        }
    }


}
