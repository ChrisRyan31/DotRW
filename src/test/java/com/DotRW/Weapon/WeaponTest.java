package com.DotRW.Weapon;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WeaponTest {
    @Test
    public void damage() {
        Weapon weapon1 = new Weapon("Sword", 1);
        int testDamage1 = weapon1.damage();
        assertTrue(testDamage1 > -1);
        assertTrue(testDamage1 <= 10);

        Weapon weapon2 = new Weapon("Axe", 2);
        int testDamage2 = weapon2.damage();
        assertTrue(testDamage2 > -1);
        assertTrue(testDamage2 <= 12);

        Weapon weapon3 = new Weapon("Bow", 3);
        int testDamage3 = weapon3.damage();
        assertTrue(testDamage3 > -1);
        assertTrue(testDamage3 <= 9);
    }

    @Test
    public void getName() {
        Weapon weapon1 = new Weapon("Sword", 1);
        Weapon weapon2 = new Weapon("Axe", 2);
        Weapon weapon3 = new Weapon("Bow", 3);

        assertEquals("sword: Sword", weapon1.getName());
        assertEquals("axe: Axe", weapon2.getName());
        assertEquals("bow: Bow", weapon3.getName());
    }
}
