package com.company.players;

import com.company.general.RPG_Game;

public class Warrior extends Hero{
    public Warrior(int health, int damage,  String heroName) {
        super(health, damage, SuperAbility.CRITICAL_DAMAGE, heroName);
    }

    @Override
    public void useSuperAbility(Hero[] heroes, Boss boss) {
        int number= RPG_Game.random.nextInt(4)+2;
        for (int i = 0; i <heroes.length ; i++) {
            if (heroes[i].getHealth()>0 && this != heroes[i]){
                heroes[i].setDamage(heroes[i].getDamage()*number);
            }
        }
    }
}
