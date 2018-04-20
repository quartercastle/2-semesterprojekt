/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Lasse
 */
public class Offer {

  private String name;

  private int Price;

  private String description;

  public Offer(String name, int Price, String description) {
    this.name = name;
    this.Price = Price;
    this.description = description;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getPrice() {
    return Price;
  }

  public void setPrice(int Price) {
    this.Price = Price;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

}
