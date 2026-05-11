package practiceProblem1.day3;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        int x2=sc.nextInt();
        int y2=sc.nextInt();
        int x3=sc.nextInt();
        int y3=sc.nextInt();
        int x4=sc.nextInt();
        int y4=sc.nextInt();
        double line1 = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
        double line2 = Math.sqrt(Math.pow((x4-x3),2) + Math.pow((y4-y3),2));
        System.out.println("The Height of Line one is : "+line1);
        System.out.println("the height of second line is : "+line2);
        if(Double.valueOf(line1).equals(Double.valueOf(line2))){
            System.out.println("Both Lines Are Equal");
        }
        int value = Double.valueOf(line1).compareTo(Double.valueOf(line2));
        if(value > 0){
            System.out.println("Line 1 is big");
        }
        else if(value == 0){
            System.out.println("Both lines are equal");
        }
        else{
            System.out.println("Line is IS bigger");
        }
    }
}
