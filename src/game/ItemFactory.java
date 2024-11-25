package game;

import java.util.Random;

public class ItemFactory {
  public static Item createItem() {
    Random random = new Random();
    if (random.nextBoolean()) {
      return new Excalibur();
    } else {
      return new RingOfHealth();
    }
  }
}
