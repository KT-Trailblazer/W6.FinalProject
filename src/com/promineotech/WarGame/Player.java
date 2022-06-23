package com.promineotech.WarGame;

import java.util.ArrayList;

public class Player {
    private ArrayList<Card> hand;
    private int score;
    private String name;
    
    public Player(String name) {
      this.name = name;
      hand = new ArrayList<>();
      score = 0;
    }
    
    public ArrayList<Card> getHand() {
      return hand;
    }
   
    public int getScore() {
      return score;
    }

    public String getName() {
      return name;
    }

    public void describe() {
      System.out.println("Player name: " + name);
      for (int i = 0; i < hand.size(); i++) {
        hand.get(i).describe();
      }
    }
    
    public Card flip() {
      Card topCard = hand.get(hand.size() - 1);
      hand.remove(topCard);
      return topCard;
    }
    
    public void draw(Deck deck) {
       Card card = deck.draw();
       hand.add(card);
    }
    
    public void incrementScore() {
      score = score + 1;
    }
}
