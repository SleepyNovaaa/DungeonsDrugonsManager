package org.example.service;

import org.example.model.Character;

public interface ICharacterService {

    public void takeDamage(Character character, int damage);

    public void Heal(Character character, int amount);

    public void Levelup(Character character);

    public boolean isAlive(Character character);
}
