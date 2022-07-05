package com.company.players;

import com.company.general.RPG_Game;

public class Berserk extends Hero{
    public Berserk(int health, int damage,  String heroName) {
        super(health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT, heroName);
    }

    @Override
    public void useSuperAbility(Hero[] heroes, Boss boss) {
        int number = RPG_Game.random.nextInt(5) + 2;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0 && heroes[i].getHeroName() != this.getHeroName()) ;
            heroes[i].setDamage(heroes[i].getDamage() + (boss.getDamage() / number));
        }

    }
}
