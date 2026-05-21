package practiceProblem1.day11_12;

import java.util.Random;

public class RefactoredDeckOfCards {
    public static void main(String[] args) {
        Random random=new Random();
        String[] suits={"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] rank={"2", "3", "4", "5", "6", "7", "8","9", "10", "Jack", "Queen", "King", "Ace"};
        Card[] cards=new Card[52];
        int index=0;
        for(int i=0;i<suits.length;i++){
            for(int j=0;j<rank.length;j++){
                cards[index]=new Card(suits[i], rank[j]);
                index++;
            }
        }
        for(int i=0;i<cards.length;i++){
            int randomNumber=random.nextInt(52);
            Card temp=cards[i];
            cards[i]=cards[randomNumber];
            cards[randomNumber]=temp;
        }
        index=0;
        index = 0;

        PlayerLinkedList players = new PlayerLinkedList();

        for(int i = 1; i <= 4; i++){

            cardLinkedList list = addItToAList(cards,index);

            Player player = new Player("Player " + i, list);

            players.addPlayer(player);

            index = index + 9;
        }

        players.displayPlayers();
    }
    public  static cardLinkedList addItToAList(Card[] cards,int index){
        cardLinkedList ln=new cardLinkedList();
        for(int i=index;i<index+9;i++){
            ln.addCard(cards[i]);
        }
        return ln;
    }
}

class Card{
    private String suit;
    private String rank;
    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }
    public String getSuit() {
        return suit;
    }
    public void setSuit(String suit) {
        this.suit = suit;
    }
    public String getRank() {
        return rank;
    }
    public void setRank(String rank) {
        this.rank = rank;
    }
    @Override
    public String toString() {
        return "Card " + suit + " rank=" + rank + "";
    }

}
class cardLinkedList{
    CardNode head;

    CardNode tail;
    void addCard(Card card){
        if(head==null){
            CardNode node=new CardNode(card);
            head=node;
            tail=node;
        }
        else{
            CardNode node=new CardNode(card);
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
    }
    public CardNode getHead(){
        return head;
    }

}
class CardNode{
    Card card;
    CardNode next;
    CardNode prev;
    CardNode(Card card){
        this.card=card;
    }
}

class Player{

    String name;
    cardLinkedList cards;

    public Player(String name, cardLinkedList cards){

        this.name = name;
        this.cards = cards;
    }
}


class PlayerNode{
    Player player;
    PlayerNode next;
    public PlayerNode(Player player){

        this.player = player;
    }
}
class PlayerLinkedList{

    PlayerNode head;
    PlayerNode tail;

    void addPlayer(Player player){
        PlayerNode node = new PlayerNode(player);
        if(head == null){
            head = node;
            tail = node;    }

        else{
            tail.next = node;
            tail = node;
        }
    }

    void displayPlayers(){

        PlayerNode temp = head;
        while(temp != null){
            System.out.println(temp.player.name);
            CardNode tempCard = temp.player.cards.head;
            while(tempCard != null){
                System.out.println(tempCard.card);

                tempCard = tempCard.next;
            }

            System.out.println();

            temp = temp.next;
        }
    }
}
