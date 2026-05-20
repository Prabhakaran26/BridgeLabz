package practiceProblem1.day6;

import java.util.Scanner;

public class Binary {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("The Binary Number of : "+num+" is : "+toBinary(num));
        System.out.println(swapNibbles(toBinary(num)));
    }

    public static String toBinary(int num){
        String s="";
        while(num >= 3){
            s = s+num%2;
            num = num/2;
        }
        if(num==2){
            s=s+"01";
        }
        if(num==1){
            s=s+1;
        }
        String s1="";
        for(int i=s.length()-1;i>=0;i--){
            s1=s1+s.charAt(i);
        }
        return s1;
    }

    public static int swapNibbles(String s){
        String padStart="";
        for(int i=0;i<(8-s.length());i++){
            padStart=padStart+0;
        }
        s=padStart+s;
        System.out.println(s);
        s=s.substring(4)+s.substring(0, 4);
        int num=0;
        int power=0;
        for(int i=s.length()-1;i>=0;i--){
            num=num+(int)Math.pow(2,power)*(s.charAt(i)-48);
            power++;
        }
        if(s.charAt(0)=='1'){
            System.out.println("The Number can be expressed power of 2");
        }
        return num;
    }
}
