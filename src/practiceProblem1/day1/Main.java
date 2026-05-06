package practiceProblem1.day1;

import java.util.Arrays;

public class Main {
    static byte defaultByte;
    static short defaultShort;
    static int defaultInt;
    static long defaultLong;
    static float defaultFloat;
    static double defaultDouble;
    static char defaultChar;
    static boolean defaultBoolean;

    public static void main(String[] args) {
        sumOfCmndLnArgs(args);
    }

    // Write a Java program to display the default value of all primitive data types of Java
    public static void displayMessage(){
        System.out.println("Hello World");
    }

    // Write a Java program to display the default value of all primitive data types of Java
    public static void defaultPrimitiveValues(){
        System.out.println("Byte : "+defaultByte);
        System.out.println("Short : "+defaultShort);
        System.out.println("Int : "+defaultInt);
        System.out.println("Long : "+defaultLong);
        System.out.println("Float : "+defaultFloat);
        System.out.println("Double : "+defaultDouble);
        System.out.println("Char : "+(int)defaultChar);
        System.out.println("Boolean : "+defaultBoolean);
    }

    //Write a program to check two strings are equal or not.
    public static void checkString(){
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
    }

    //To get the name using the command line.
    public static void namefromCommandLine(String[] str){
        System.out.println("Command Line : " +Arrays.toString(str));
    }

    //Find Leap Year
    public static void checkLeapYear(int year){
        if(year >= 1582) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0)) {
                System.out.println(year + " year is leap year");
            } else {
                System.out.println(year + " year is not leap year");
            }
        } else {
            System.out.println("Year must be greater than 1582");
        }
    }

    // To find the sum of command-line arguments and count the invalid integers entered.
    public static void sumOfCmndLnArgs(String[] args){
        int sum = 0;
        int invalidNumber = 0;
        for (String s : args) {
            try {
                int i = Integer.parseInt(s);
                sum += i;
            } catch (NumberFormatException e) {
                invalidNumber++;
            }
        }
        System.out.println("Sum : "+sum);
        System.out.println("Invalid Numbers : "+invalidNumber);
    }
}

