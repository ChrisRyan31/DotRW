package com.DotRW.Hero;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HeroTest {
    @Test
    public void getHeroName() {
        Hero hero = new Hero("Chris");
        assertEquals("Chris", hero.getHeroName());
    }

    @Test
    public void getHitPoints() {
        Hero hero = new Hero("Chris");
        assertEquals(30, hero.getHitPoints());
    }

    @Test
    public void takeDamage() {
        Hero hero = new Hero("Chris");
        hero.takeDamage(10);
        assertEquals(20, hero.getHitPoints());
    }

    @Test
    public void setHitPoints() {
        Hero hero = new Hero("Chris");
        hero.setHitPoints();
        assertEquals(0, hero.getHitPoints());
    }
}
