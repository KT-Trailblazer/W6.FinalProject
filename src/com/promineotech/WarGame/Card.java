package com.promineotech.WarGame;

public class Card {
  private int value;
  private String name;
  
  public Card(String name, int value) {
    setName(name);
    setValue(value);
  }
  
  public int getValue() {
    return value;
  }
  public void setValue(int value) {
    this.value = value;
  }
  
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  
  public void describe() {
    System.out.println(name);
  }
}
