# Tugas OOP 'Dark Knight'

# Goals
- Learn and implement polymorphism
- Learn and implement abstract class
- Learn and implement interface

# Entity
## Player
- HP
- Base Damage
- Current Item
- attack()
- take_damage()

## Goblin
- HP
- Base Damage
- attack()
- take_damage()

## Thief
- HP
- Base Damage
- attack()
- take_damage()
- steal_weapon()

## Excalibur
- buff damage by 10%

## Ring of Health
- increase player hp by 40

# Logic
## Game
- Start game
- Player and enemy both calls their attack method
- Register the damage
- Check if player/enemy is dead
- If player is dead, reset player's stat and start a new game
- If enemy is dead and player doesn't have any item, random 25% chance to spawn an item

## Player
- Player's name consist of 5 or more letters
- Player's initial hp and base damage is 100 and 20

## Goblin
- Goblin's initial hp and base damage is 80 and 20

## Thief
- Thief's initial hp and base damage is 60 and 15
- Every turn, thief have 25% chance to steal player's weapon. Stolen weaopn will be lost
