package org.problems.pizzaBilling.decorator;

import org.problems.pizzaBilling.base.BasePizza;

public class MushroomDecorator extends ToppingDecorator {

  private final BasePizza basePizza;

  public MushroomDecorator(BasePizza basePizza) {
    this.basePizza = basePizza;
  }

  @Override
  public int cost() {
    return this.basePizza.cost() + 20;
  }
}
