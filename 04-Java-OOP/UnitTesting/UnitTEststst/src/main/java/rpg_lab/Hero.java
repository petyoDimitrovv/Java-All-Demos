package rpg_lab;

import java.util.Random;

public class Hero {
    public static final int AXE_ATTACK = 10;
    public static final int AXE_DURABILITY = 10;

    private String name;
    private int experience;
    private Weapon weapon;

    public Hero(String name) {
       this(name, new Axe(AXE_ATTACK, AXE_DURABILITY));
    }
    public Hero(String name,Weapon weapon) {
        this.name = name;
        this.experience = 0;
        this.weapon = weapon;
    }


    public String getName() {
        return this.name;
    }

    public int getExperience() {
        return this.experience;
    }

    public Weapon getWeapon() {
        return this.weapon;
    }

    public void attack(Dummy target) {
        this.weapon.attack(target);

        if (target.isDead()) {
            this.experience += target.giveExperience();
        }
    }
}
