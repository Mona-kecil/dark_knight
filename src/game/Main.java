package game;

import java.util.Scanner;

public class Main {

  private static Scanner scan = new Scanner(System.in);

  private String getLine() {
    System.out.printf(">> ");
    return scan.nextLine();
  }

  private void displayEntity(Entity entity) {
    if (entity instanceof Player) {
      System.out.println("Player: " + ((Player) entity).name);
      System.out.printf("HP: %d\t Base Damage: %d\n", ((Player) entity).hp, ((Player) entity).baseAttack);
      if (((Player) entity).has_item()) {
        System.out.println("Weapon: " + ((Player) entity).item.getName());
      }
    } else if (entity instanceof Goblin) {
      System.out.println("Goblin");
      System.out.printf("HP: %d\t Base Damage: %d\n", ((Goblin) entity).hp, ((Goblin) entity).baseAttack);
    } else if (entity instanceof Thief) {
      System.out.println("Thief");
      System.out.printf("HP: %d\t Base Damage: %d\n", ((Thief) entity).hp, ((Thief) entity).baseAttack);
      System.out.println("Special Ability: Steal Weapon (25%)");
    }
  }

  public static void main(String[] args) {
    Main main = new Main();
    main.run();
  }

  public void run() {
    System.out.println("Welcome to Dark Knight");
    System.out.println("1. Play");
    System.out.println("2. Exit");

    int choice = -1;

    do {
      try {
        choice = Integer.parseInt(getLine());
        if (choice == 1) {
          Player player = getUser();
          battle(player);
        } else if (choice == 2) {
          System.out.println("Goodbye");
        } else {
          System.out.println("Invalid choice");
        }
      } catch (Exception e) {
        System.out.println("Invalid choice");
      }
    } while (choice != 1 && choice != 2);
  }

  public Player getUser() {
    String name;

    do {
      System.out.println("Input name [>= 5]");
      name = getLine();
    } while (name.length() < 5);

    Player player = new Player(name);
    System.out.println("Welcome to Dark Knight, " + name);
    System.out.println("Press enter to continue");
    scan.nextLine();
    return player;
  }

  public void battle(Player player) {
    Enemy enemy = EnemyFactory.createEnemy();

    while (player.hp > 0 && enemy.hp > 0) {

      displayEntity(player);
      System.out.println("------------------");
      displayEntity(enemy);
      System.out.println("------------------");

      player.attack();
      enemy.attack();
    }

  }
}
