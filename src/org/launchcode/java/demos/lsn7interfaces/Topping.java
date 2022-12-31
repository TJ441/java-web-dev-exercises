package org.launchcode.java.demos.lsn7interfaces;


public class Topping extends Ingredient {
  private final boolean hasAllergens;

  public Topping (String aName, double aCost, boolean aHasAllergens) {
    super(aName, aCost);
    hasAllergens = aHasAllergens;
  }

  public boolean getHasAllergens () {
    return hasAllergens;
  }
}
