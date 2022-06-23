package com.promineotech.WarGame;

import java.util.ArrayList;
import java.util.Random;

public class Deck {
  private ArrayList<Card> cards = new ArrayList<Card>();

  public Deck() {
    String[] Suit = {"Hearts", "Clubs", "Spades", "Diamonds"};
    String[] Title = {"Two", "Three", "Four", "Five", "Six", "Seven", 
                      "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
        
    for (String suit : Suit) {
      int value = 2;
      for (String title : Title) {
        String name = title + " of " + suit;
        Card singleCard = new Card(name, value);
        value++;
        cards.add(singleCard);
      }
    }
  }

  public void shuffle() {
    Random r = new Random();
    for (int i = 1; i < 52; i++) {
      int nxt = r.nextInt(52 - i) + i;
      Card crd = cards.get(i-1);
      cards.set(i-1, cards.get(nxt));
      cards.set(nxt, crd);
    }
  }
  
  public Card draw() {
    Card topCard = cards.get(cards.size()-1);
    cards.remove(topCard);
    return topCard;
  }
  
  
}
