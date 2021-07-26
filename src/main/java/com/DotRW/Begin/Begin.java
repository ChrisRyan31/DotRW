package com.DotRW.Begin;

import com.DotRW.Hero.Hero;
import com.DotRW.Weapon.Weapon;
import com.DotRW.Wizard.Wizard;

import java.util.Scanner;

public class Begin {
    Wizard wizard;
    Hero hero;
    Weapon weapon;
    private int currentHit;
    Scanner scanner = new Scanner(System.in);

    public Begin (Hero hero, Wizard wizard, Weapon weapon) {
        this.hero = hero;
        this.wizard = wizard;
        this.weapon = weapon;
    }

    public static void pause(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            System.err.format("IOException: %s%n", e);
        }
    }

    public void roundOfCombat() {
        String wizardName = wizard.getName();
        String heroName = hero.getHeroName();


        while (true) {
            currentHit = weapon.damage();
            if (currentHit == 0) {
                System.out.println(heroName + " attacks with " + weapon.getName() + " but misses!");
                System.out.println(wizardName + " takes no damage!!");
            } else {
                System.out.println(heroName + " attacks with " + weapon.getName() + " for " + currentHit);
                wizard.takeDamage(currentHit);
                System.out.println(wizardName + " takes " + currentHit + " damage!!");
            }
            pause(500);
            if (wizard.getHitPoints() <= 0) {
                wizard.setHitPoints();
                System.out.println(wizardName + " has " + wizard.getHitPoints() + " hit points remaining.\r\n");
                this.winner();
                return;
            }
            System.out.println(wizardName + " has " + wizard.getHitPoints() + " hit points remaining.\r\n");
            pause(500);
            System.out.println(wizardName + " attacks back.");
            pause(500);
            currentHit = wizard.damage();
            if (currentHit == 0) {
                System.out.println(wizardName + " attacks with " + wizard.getMagic() + " but misses!");
                System.out.println(hero.getHeroName() + " takes no damage!!");
            } else {
                System.out.println(wizardName + " attacks with " + wizard.getMagic() + " for " + currentHit);
                hero.takeDamage(currentHit);
                System.out.println(hero.getHeroName() + " takes " + currentHit + " damage!!");
            }
            pause(500);
            if (hero.getHitPoints() <= 0) {
                hero.setHitPoints();
                System.out.println(hero.getHeroName() + " has " + hero.getHitPoints() + " hit points remaining.\r\n");
                this.winner();
                return;
            }
            System.out.println(hero.getHeroName() + " has " + hero.getHitPoints() + " hit points remaining.\r\n");

            this.winner();
            this.roundOfCombat();
        }
    }

    private void winner() {
        if (wizard.getHitPoints() <= 0) {
            System.out.println("Congratulations " + hero.getHeroName() + "!!! you have defeated the Recursive Wizard!!!");
            System.out.println("The world is free from his endless monologuing!!!\r\n");
            System.out.println("**********************************************************");
            System.out.println("* Thank you for playing Dungeon of the Recursive Wizard! *");
            System.out.println("**********************************************************");
            System.out.println("\r\nCreated by Rez");
            System.out.println("Press \"ENTER\" to Quit..");
            scanner.nextLine();
            System.exit(0);
        } else if (hero.getHitPoints() <= 0) {
            System.out.println("The Recursive Wizard has defeated our Hero... " + hero.getHeroName() + " ...we will suffer his monologuing eternally..\r\n");
            System.out.println("**********************************************************");
            System.out.println("* Thank you for playing Dungeon of the Recursive Wizard! *");
            System.out.println("**********************************************************");
            System.out.println("\r\nCreated by Rez");
            System.out.println("Press \"ENTER\" to Quit..");
            scanner.nextLine();
            System.exit(0);
        } else {
            System.out.println(hero.getHeroName() + " has not yet defeated " + wizard.getName() + ". Another round??..\r\n");
            System.out.println("Press \"ENTER\"..");
            scanner.nextLine();
        }
    }
}
