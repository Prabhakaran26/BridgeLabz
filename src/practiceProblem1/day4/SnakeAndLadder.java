package practiceProblem1.day4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Player{
    int score = 0;
    int dice = 0;
    public int playGame(int player){
            int roll = (int)Math.floor(Math.random() * 10) % 3;
            int points = 0;
            switch (roll){
                case 1:
                    points = (int) Math.floor(Math.random() * 10) % 6;
                    dice++;
                    if(score+points <= 100){
                        score += points;
                    }
                    break;
                case 2:
                    points = (int) Math.floor(Math.random() * 10) % 6;
                    dice++;
                    if(score-points >= 0){
                        score -= points;
                    } else {
                        score = 0;
                    }
                    break;
                default:
                   // System.out.println("No Play");
            }
            return score;
    }

    public void displayScoreBoard(int player){
        System.out.println("===================================== ");
        System.out.println("|| Player "+player+" scored "+score +"             ||");
        System.out.println("|| The Dice was played "+dice+" times  || ");
        System.out.println("=====================================");
        System.out.println();

    }
}
public class SnakeAndLadder {
    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder game ");

        Scanner in = new Scanner(System.in);
        int noOfPlayer = in.nextInt();
        List<Player> players = new ArrayList<>();
        for(int i=0;i<noOfPlayer;i++){
            players.add(new Player());
        }
        boolean isWin = false;

        while(!isWin){
            for(int i=0;i<noOfPlayer;i++) {
                int score = players.get(i).playGame(i+1);
                if(score == 100){
                    isWin = true;
                    System.out.println("Player "+(i+1)+" Won the Game");
                }
            }
        }
        for (int i=0;i<players.size();i++){
            players.get(i).displayScoreBoard(i+1);
        }
    }
}
