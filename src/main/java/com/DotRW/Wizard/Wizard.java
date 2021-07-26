package com.DotRW.Wizard;

import java.util.HashMap;
import java.util.Random;

public class Wizard {
    private String name = "The Recursive Wizard";
    public HashMap<Integer, String> magic = new HashMap<Integer, String>();
    private String magicChosen;
    private int hitPoints = 30;

    public Wizard () {
        magic.put(1, "Fireball");
        magic.put(2, "Lightning");
        magic.put(3, "Endless Monologue");
    }

    public int damage() {
        this.magicChosen = "";
        int fireballDmg = 10;
        int lightningDmg = 8;
        int endlessMonologueDmg = 1;
        Random random = new Random();
        int magicSelected = random.nextInt(3);

        if (magicSelected == 1) {
            this.magicChosen = magic.get(1);
            return random.nextInt(fireballDmg);
        } else if (magicSelected == 2) {
            this.magicChosen = magic.get(2);
            return random.nextInt(lightningDmg);
        } else {
            this.magicChosen = magic.get(3);
            return endlessMonologueDmg;
        }
    }

    public String getMagic() {
        return this.magicChosen;
    }

    public void takeDamage(int damage) {
        this.hitPoints -= damage;
    }

    public String getName() {
        return this.name;
    }

    public int getHitPoints() {
        return this.hitPoints;
    }

    public void setHitPoints() {
        this.hitPoints = 0;
    }
}
