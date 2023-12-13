package org.problems.pizzaBilling.decorator;

import org.problems.pizzaBilling.base.BasePizza;

public class CheeseDecorator extends ToppingDecorator {

  private final BasePizza basePizza;

  public CheeseDecorator(BasePizza basePizza) {
    this.basePizza = basePizza;
  }

  @Override
  public int cost() {
    return this.basePizza.cost() + 10;
  }
}
