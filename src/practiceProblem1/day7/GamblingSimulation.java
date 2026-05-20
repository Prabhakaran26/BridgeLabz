package practiceProblem1.day7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GamblingSimulation{
    public static Random random=new Random();
    public static void main(String[] args) {

        List<List<Integer>> luckyDay=new ArrayList<>();
        List<List<Integer>> unluckyDay=new ArrayList<>();
        List<List<Integer>> list=new ArrayList<>();
        int totalStakeInAMonth=20*100;
        int monthlyEarnings=0;
        for(int i=1;i<=20;i++){
            int dayEarnings=profitOrLossInADay();
            monthlyEarnings=monthlyEarnings+dayEarnings;
            if(dayEarnings==50){
                List<Integer> list1=new ArrayList<>();
                list1.add(i);
                list1.add(-50);
                list.add(list1);
                unluckyDay.add(list1);
            }
            else{
                List<Integer> list1=new ArrayList<>();
                list1.add(i);
                list1.add(50);
                list.add(list1);
                luckyDay.add(list1);
            }
        }
        if((monthlyEarnings-totalStakeInAMonth)<0){
            System.out.println("He lost : "+(totalStakeInAMonth-monthlyEarnings));


        }
        else{
            System.out.println("He Won : "+(monthlyEarnings-totalStakeInAMonth));

        }

        System.out.println(list);
        System.out.println("Luckiest Day");
        System.out.println(luckyDay);
        System.out.println("UnLucky Day");
        System.out.println(unluckyDay);
        if(monthlyEarnings-totalStakeInAMonth>0){
            System.out.println("The Gambler Will Continue Next Month Also");
        }
        else{
            System.out.println("He wont continue next month because he doest earn any profit");
        }
    }
    public static int profitOrLossInADay(){
        int stake=100;
        int bet=1;

        while(stake != 50 && stake != 150){
            int outcome=random.nextInt(2);
            if(outcome==0){
                stake--;
            }
            else{
                stake++;
            }
        }
        return stake;
    }
}
