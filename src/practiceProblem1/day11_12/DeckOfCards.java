package practiceProblem1.day11_12;

import java.util.Random;

public class DeckOfCards {
    public static void main(String[] args) {
        Random random=new Random();
        String[] suits={"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] rank={"2", "3", "4", "5", "6", "7", "8","9", "10", "Jack", "Queen", "King", "Ace"};
        String[] cards=new String[52];
        int index=0;
        for(int i=0;i<suits.length;i++){
            for(int j=0;j<rank.length;j++){
                cards[index]=suits[i]+" Of "+rank[j];
                index++;
            }
        }
        for(int i=0;i<cards.length;i++){
            int randomNumber=random.nextInt(52);
            String temp=cards[i];
            cards[i]=cards[randomNumber];
            cards[randomNumber]=temp;
        }
        index=0;
        String[][] cardsHoldByPlayers=new String[4][9];
        for(int i=0;i<cardsHoldByPlayers.length;i++){
            for(int j=0;j<cardsHoldByPlayers[i].length;j++){
                cardsHoldByPlayers[i][j]=cards[index];
                index++;
            }
        }
        for(int i=0;i<cardsHoldByPlayers.length;i++){
            System.out.println("Cards Hold By "+(i+1)+" Player are");
            for(int j=0;j<cardsHoldByPlayers[i].length;j++){
                System.out.print( cardsHoldByPlayers[i][j]+" ");
            }
            System.out.println();
        }
    }
}
