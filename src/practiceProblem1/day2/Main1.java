package practiceProblem1.day2;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //findSprinfSeason(6,4);




        //This is for find java that takes two integer command-line arguments x and y
        // and prints the Euclidean distance from the point (x, y) to the origin (0, 0)
        if(args.length == 2) {
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);
            findDistance(x, y);
        }
    }



    //Operator Program
    //4. Write a program Distance.java that takes two integer command-line arguments x and y and prints the Euclidean distance from the point (x, y) to the origin (0, 0). The formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function
    public static void findDistance(int x, int y){
        double distance = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        System.out.println("The distance is "+distance);
    }

    //3.Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c.
    //Since the equation is x*x, hence there are 2 roots. The 2 roots of the equation can be found using a formula delta = b*b - 4*a*c
    //Root 1 of x = (-b + sqrt(delta))/(2*a)
    //Root 2 of x = (-b - sqrt(delta))/(2*a)
    //Take a, b, and c as input values to find the roots of x.
    public static void findQuadratic(double a, double b, double c){
        double delta = (b*b)-(4*a*c);
        double root1 = (-b+Math.sqrt(delta))/(2 * a);
        double root2 = (-b-Math.sqrt(delta))/(2 * a);
        System.out.println("Root 1= "+root1);
        System.out.println("Root 2= "+root2);
    }

    //2. Write a program SpringSeason.java that takes two int values m and d from the command line and prints true if day d of month m is between March 20 (m = 3, d=20) and June 20 (m = 6, d = 20), false otherwise.
    public static void findSprinfSeason(int d, int m){
        if(m == 3 && d>= 20 && d<=31){
            System.out.println("True");
        } else if(m == 4 && d>=1 && d<=30){
            System.out.println("True");
        } else if(m == 5 && d>=1 && d<=31){
            System.out.println("True");
        } else if(m == 6 && d>=1 && d<=20){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    //1. Enter two numbers and do the following arithmetic Operations find max and min.
    //i) a+b*c ii) c+a/b
    //iii) a%b+c iV) a*b+c
    public static void findMaxMinInArith(int a, int b, int c){
        int first = a+b*c;
        int sec = c+a/b;
        int third = a%b+c;
        int fourth = a*b+c;

        if(first > sec && first > third && first > fourth){
            System.out.println("a+b*c = "+first+" is max");
        } else if(sec > first && sec > third && sec > fourth){
            System.out.println("c+a/b = "+sec+" is max");
        } else if(third > sec && third > first && third > fourth){
            System.out.println("a%b+c = "+third+" is max");
        } else if(fourth > sec && fourth > third && fourth > first){
            System.out.println("a*b+c = "+fourth+" is max");
        }

        if(first < sec && first < third && first < fourth){
            System.out.println("a+b*c = "+first+" is min");
        } else if(sec < first && sec < third && sec < fourth){
            System.out.println("c+a/b = "+sec+" is min");
        } else if(third < sec && third < first && third < fourth){
            System.out.println("a%b+c = "+third+" is min");
        } else if(fourth < sec && fourth < third && fourth < first){
            System.out.println("a*b+c = "+fourth+" is min");
        }
    }

    //Switch
    //Write a Program to print the month name for the given number
    public static void findMonth(int month){
        switch (month){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Please enter a number between 1-12");
        }
    }

    //Write a Program to Check Vowel or Consonant
    public static void checkVwlsCnst(char cc){
        char c = Character.toLowerCase(cc);
        switch (c){
            case 'a','e','i','o','u':
                System.out.println("Vowels");
                break;
            case 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z':
                System.out.println("Consonants");
                break;
            default:
                System.out.println("Invalid Character");
        }
    }

    //Loops Program
    //Write a Program to find Palindrome Number
    public static void findPalindrome(int n){
        int rev = reverse(n);
        if(n == rev){
            System.out.println(n+" is Palindrome");
        } else {
            System.out.println(n+" is not Palindrome");
        }
    }

    //Write a Program to reverse the integer number eg. Input n=231 reverse is 132
    public static int reverse(int n){
        System.out.println("Actual Number : "+n);
        int rev = 0;
        while(n > 0){
            int m = n%10;
            rev = (rev*10) + m;
            n /= 10;
        }
        System.out.println("Reverse Number : "+rev);
        return rev;
    }

    //Write a Program for the sum of n natural numbers eg. Input N=5 output 1+2+3+4+5
    public static void sumOfn(int n){
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum += n;
        }
        System.out.println("Sum of n natural number : "+sum);
    }


    //If else

    //Read a Number 1,10,100,1000 and display unit, ten hundred
    public static void findPlaceValue(int num){
        if (num == 1) {
            System.out.println("Unit");
        } else if (num == 10) {
            System.out.println("Ten");
        } else if (num == 100) {
            System.out.println("Hundred");
        } else if (num == 1000) {
            System.out.println("Thousand");
        } else {
            System.out.println("Please enter 1, 10, 100, or 1000.");
        }
    }

    // Read a single Digit Number and write in word
    public static void numToWord(int num){
        if (num == 0) {
            System.out.println("Zero");
        } else if (num == 1) {
            System.out.println("One");
        } else if (num == 2) {
            System.out.println("Two");
        } else if (num == 3) {
            System.out.println("Three");
        } else if (num == 4) {
            System.out.println("Four");
        } else if (num == 5) {
            System.out.println("Five");
        } else if (num == 6) {
            System.out.println("Six");
        } else if (num == 7) {
            System.out.println("Seven");
        } else if (num == 8) {
            System.out.println("Eight");
        } else if (num == 9) {
            System.out.println("Nine");
        } else {
            System.out.println("Please enter a number");
        }
    }
}
