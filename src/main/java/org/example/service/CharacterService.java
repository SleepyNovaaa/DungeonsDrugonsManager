package org.example.service;
import org.example.model.Character;
public class CharacterService implements ICharacterService {



    public void takeDamage(Character character, int damage) {
        if (damage <0 ) throw  new IllegalArgumentException("Damage cannot be negative");

       int temHealth = character.getActualHealth() -damage;
       if (temHealth <0 ) temHealth= 0;
       character.setActualHealth(temHealth);

    }


    public void Heal(Character character, int amount) {
    if (amount <0) throw new IllegalArgumentException("Healing amount Cannot be negative");
    int tempHealth = character.getActualHealth() + amount;
    if (tempHealth > character.getMaxHealth()) tempHealth = character.getMaxHealth();
    character.setActualHealth(tempHealth);
    }

    public void Levelup(Character character) {
    int TempLevel = character.getLevel() + 1;
    character.setLevel(TempLevel);
    int nextLevelHealth = character.getMaxHealth() + 5;
    character.setMaxHealth(nextLevelHealth);
    character.setActualHealth(nextLevelHealth);
    }


   public boolean isAlive(Character character) {
        return character.getActualHealth() > 0;
    }
}
