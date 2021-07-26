package com.DotRW.Weapon;

import java.util.Random;
import java.util.HashMap;

public class Weapon {
    public String weaponName;
    public HashMap<Integer, String> weaponTypes = new HashMap<Integer, String>();
    public String weaponChosen;
    Random random = new Random();


    public Weapon(String name, int weaponChoice) {
        this.weaponName = name;
        weaponTypes.put(1, "Sword");
        weaponTypes.put(2, "Axe");
        weaponTypes.put(3, "Bow");

        if (weaponChoice == 1) {
            this.weaponChosen = weaponTypes.get(1);
        } else if (weaponChoice == 2) {
            this.weaponChosen = weaponTypes.get(2);
        } else this.weaponChosen = weaponTypes.get(3);
    }

    public int damage() {
        int swordDmg = 10;
        int axeDmg = 12;
        int bowDmg = 8;

        if (this.weaponChosen.equals("Sword")) {
            return random.nextInt(swordDmg);
        } else if (this.weaponChosen.equals("Axe")) {
            return random.nextInt(axeDmg);
        } else {
            return random.nextInt(bowDmg);
        }
    }

    public String getName() {
        String sword = "sword: ";
        String axe = "axe: ";
        String bow = "bow: ";

        if (this.weaponChosen.equals("Sword")) {
            return sword + this.weaponName;
        } else if (this.weaponChosen.equals("Axe")) {
            return axe + this.weaponName;
        } else {
            return bow + this.weaponName;
        }
    }


}
