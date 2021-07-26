package com.DotRW.Hero;

public class Hero {
    private String heroName;
    private int hitPoints = 30;

    public Hero(String name) {
        this.heroName = name;
    }

    public String getHeroName() {
        return this.heroName;
    }

    public int getHitPoints() {
        return this.hitPoints;
    }

    public void takeDamage(int damage) {
        this.hitPoints -= damage;
    }

    public void setHitPoints() {
        this.hitPoints = 0;
    }
}
