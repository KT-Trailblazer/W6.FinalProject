package com.promineotech.WarGame;

public class App {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    Deck gameDeck = new Deck();
    Player player1 = new Player("Eeyore");
    Player player2 = new Player("Tigger");
    
    gameDeck.shuffle();
    
    for (int i = 0; i < 52; i++) {
      if (i % 2 == 0) {
        player1.draw(gameDeck);
      }else {
        player2.draw(gameDeck);
      }
    }
    
    for (int i = 0; i < 26; i++) {
      Card player1Card = player1.flip();
      Card player2Card = player2.flip();
      
      if (player1Card.getValue() > player2Card.getValue()) {
        player1.incrementScore();
      } else {
        player2.incrementScore();
      }
     }
    System.out.println(player1.getName() + "'s score = " + player1.getScore());
    System.out.println(player2.getName() + "'s score = " + player2.getScore());
    
    if (player1.getScore() > player2.getScore()) {
      System.out.println(player1.getName() + " WINS!!!");
    } else if (player1.getScore() < player2.getScore()){
      System.out.println(player2.getName() + " WINS!!!");
    } else {
      System.out.println("It's a Draw, play again");
    }
  }

}
