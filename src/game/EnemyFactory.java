package game;

import java.util.Random;

public class EnemyFactory {
  public static Enemy createEnemy() {
    Random random = new Random();
    if (random.nextBoolean()) {
      return new Goblin();
    } else {
      return new Thief();
    }
  }
}
