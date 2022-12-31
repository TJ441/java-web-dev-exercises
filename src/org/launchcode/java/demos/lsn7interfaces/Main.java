package org.launchcode.java.demos.lsn7interfaces;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args){
    Case menu = new Case();
    ArrayList<Flavor> flavors = menu.getFlavors();
    ArrayList<Cone> cones = menu.getCones();
    ArrayList<Topping> toppings = menu.getToppings();
    flavors.sort(new FlavorComparator());
    cones.sort(new ConeComparator());
    toppings.sort(new ToppingComparator());

    System.out.print(toppings);
    //System.out.print(toppings.get(1).getHasAllergens());

    // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
    // TODO: not really, but I modified the Topping class to not conform with the others and now toString doesn't work
  }
}
