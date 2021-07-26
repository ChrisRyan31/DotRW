package com.DotRW.Wizard;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WizardTest {
    @Test
    public void getName() {
        Wizard wizard = new Wizard();
        assertEquals("The Recursive Wizard", wizard.getName());
    }

    @Test
    public void takeDamage() {
        Wizard wizard = new Wizard();
        wizard.takeDamage(10);
        assertEquals(20, wizard.getHitPoints());
    }

    @Test
    public void getHitPoints() {
        Wizard wizard = new Wizard();
        assertEquals(30, wizard.getHitPoints());
    }

    @Test
    public void getMagic() {
        Wizard wizard = new Wizard();
        wizard.damage();

        if(wizard.getMagic().equals("Fireball")) {
            assertEquals("Fireball", wizard.getMagic());
        } else if (wizard.getMagic().equals("Lightning")) {
            assertEquals("Lightning", wizard.getMagic());
        } else {
            assertEquals("Endless Monologue", wizard.getMagic());
        }
    }

    @Test
    public void damage() {
        Wizard wizard = new Wizard();
        int magicReturned = wizard.damage();

        if(wizard.getMagic().equals("Fireball")) {
            assertTrue(magicReturned <= 10);
        } else if (wizard.getMagic().equals("Lightning")) {
            assertTrue(magicReturned <= 8);
        } else {
            assertEquals(1, magicReturned);
        }

    }
}
