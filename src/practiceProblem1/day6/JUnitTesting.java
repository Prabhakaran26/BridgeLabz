package practiceProblem1.day6;

import java.util.Scanner;

public class JUnitTesting {
    static Scanner sc = new Scanner(System.in);
    static void main() {

    }

    //findSQRT
    public static void sqrt(double c){
        Scanner sc=new Scanner(System.in);
        double n=sc.nextDouble();
        double epsilon = 1e-15;
        double t=c;

        while (Math.abs(t - c / t) > epsilon * t) {
            t=(t+c/t)/2.0;
        }

        System.out.println("Square root of "+n+" is : "+t);
    }

    //Temperature Conversion
    public static void temperatureConversion(){
        System.out.println("Enter 1 from F to C and enter 2 from C to F");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        if(choice==1){
            float fahrenheit=sc.nextFloat();
            System.out.println((fahrenheit-32)*((5+0.0f)/9)+" C");
        }
        else{
            float celcius=sc.nextFloat();
            System.out.println((celcius*((9+0.0f)/5))+32 +" F");
        }
    }

    //Vending Machine
    public static void vendingMachine(){
        int change=sc.nextInt();
        int notes=0;
        while(change>0){
            if(change>=1000){
                change=change-1000;
            }
            else if(change>=500){
                change=change-500;
            }
            else if(change>=100){
                change=change-100;
            }
            else if(change>=50){
                change=change-50;
            }
            else if(change>=10){
                change=change-10;
            }
            else if(change>=5){
                change=change-5;
            }
            else if(change>=2){
                change=change-2;
            }
            else if(change>=1){
                change=change-1;
            }
            notes++;
        }
        System.out.println(notes);
    }
}
