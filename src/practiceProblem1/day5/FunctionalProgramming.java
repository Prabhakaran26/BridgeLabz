package practiceProblem1.day5;

import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class FunctionalProgramming {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        windChill();
        //This is for findDistance program
        if(args.length != 0){
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);
            findDistance(x, y);
        }
    }

    //1. 2D Array
    public static void twoDArr(){
        int m = in.nextInt();
        int n = in.nextInt();
        int[][] arr = new int[m][n];
        for(int i=0;i<m;i++){
            System.out.println("Enter "+(i+1)+" row");
            for(int j=0;j<n;j++){
                arr[i][j] = in.nextInt();
            }
        }

        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out),true);
        System.out.println("==========");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                out.print(arr[i][j]+" ");
            }
            out.println();
        }
    }

    //2. Sum of three Integer adds to ZERO
    public static void threeSum(){
        int[] arr = {2,5,7,-3,3,-2};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k] == 0){
                        System.out.println(arr[i]+","+arr[j]+","+arr[k]);
                    }
                }
            }
        }
    }

    //3. Write a program Distance.java that takes two integer command-line arguments x
    //and y and prints the Euclidean distance from the point (x, y) to the origin (0, 0). The
    //formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function
    public static void findDistance(int x, int y){
        double distance = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        System.out.println("The distance is "+distance);
    }

    //4. Write a program Quadratic.java
    public static void findQuadratic(){
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double delta = (b*b)-(4*a*c);
        double root1 = (-b+Math.sqrt(delta))/(2 * a);
        double root2 = (-b-Math.sqrt(delta))/(2 * a);
        System.out.println("Root 1= "+root1);
        System.out.println("Root 2= "+root2);
    }

    //5. Write a program WindChill.java
    public static void windChill(){
        double t = in.nextDouble();
        double v = in.nextDouble();
        double w = 35.76 + (0.6215*t) + (0.4275 *(t) - 35.57) *Math.pow(v,0.16);
        System.out.println("Temperature : "+t);
        System.out.println("Speed : "+v);
        System.out.println("Wind chill : "+w);
    }



}
