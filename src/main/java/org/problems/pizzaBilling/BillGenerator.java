package org.problems.pizzaBilling;

import org.problems.pizzaBilling.base.BasePizza;
import org.problems.pizzaBilling.base.FarmHousePizza;
import org.problems.pizzaBilling.decorator.CheeseDecorator;
import org.problems.pizzaBilling.decorator.MushroomDecorator;

public class BillGenerator {

  public static void main(String[] args) {
    BasePizza pizza = new MushroomDecorator(new CheeseDecorator(new FarmHousePizza()));
    System.out.println(pizza.cost());
  }
}
