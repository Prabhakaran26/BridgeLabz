package practiceProblem1.day5;

import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        findLargeAmngThree();
    }

    //1. Flip Coin and print percentage of Heads and Tails
    public static void percentageOfHT(){
         int flipCoin = in.nextInt();
         int n = flipCoin;
         double head = 0, tail = 0;
          while(flipCoin>0){
              double toss = (Math.random() * 10)%2;
              if(toss < 0.5) {
                  tail++;
              } else {
                  head++;
              }
              flipCoin--;
          }
        System.out.println((head/n)*100);
        System.out.println((tail/n)*100);
    }

    //2. Leap Year
    public static void checkLeapYear(int year){
        System.out.print("Enter a year: ");
        if(year % 400 == 0 || year % 4 ==0 && year % 100 != 0){
            System.out.println(year+" is Leap year");
        } else {
            System.out.println(year+" is not leap year");
        }
    }

    //3. Power of 2
    public static void powerOf2(int n){
        if(n<=0 && n>= 31){
            return;
        }
        for(int i=1;i<=n;i++){
            int p = i;int pow = 1;
            while(p > 0){
                pow = pow * 2; ;
                p--;
            }
            checkLeapYear(pow);
        }
    }

    //4. Harmonic Number
    public static void harmonicNumber(){
        int n = in.nextInt();
        double ans = 0;
        for(double i=1;i<=n;i++){
            ans += (1/i);
        }
        System.out.println(ans);
    }

    //5. Factors
    public static void primeFactors(){
        int n = in.nextInt();
        for(int i=1;i<n;i++){
            if(checkPrime(i) && n%i==0){
                System.out.print(i+" ");
            }
        }
    }
    public static boolean checkPrime(int n){
        int count = 0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                count++;
            }
            if(count > 1){
                return false;
            }
        }
        return count<=1;
    }

    //6. Java Program to Compute Quotient and Remainder
    public static void findQntRem(){
        int i = in.nextInt();
        int j = in.nextInt();
        System.out.println("Quotient : "+(i/j));
        System.out.println("Remainder : "+(i%j));
    }

    //7. Java Program to Swap Two Numbers
    public static void swapTwoNumbers(){
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }

    //8. Java Program to Check Whether a Number is Even or Odd
    public static void evenOrOdd(){
        int num = in.nextInt();
        System.out.println(num%2==0?"Even":"Odd");
    }

    //9. Java Program to Check Whether an Alphabet is Vowel or Consonant
    public static void VowOrCons(){
        char c = in.next().charAt(0);
        switch (c){
            case 'a', 'e', 'i', 'o', 'u':
                System.out.println("Vowels");
                break;
            case 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z':
                System.out.println("Consonants");
                break;
            default:
                System.out.println("Invalid character");
        }
    }

    //10. Java Program to Find the Largest Among Three Numbers
    public static void findLargeAmngThree(){
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if(a > b && a > c){
            System.out.println(a+" is Largest");
        } else if(b > a && b > c){
            System.out.println(b+" is largest");
        } else if (c > a && c > b){
            System.out.println(c+" is largest");
        }
    }
}
