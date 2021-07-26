package com.DotRW;

import java.util.Scanner;

import com.DotRW.Hero.Hero;
import com.DotRW.Weapon.Weapon;
import com.DotRW.Wizard.Wizard;
import com.DotRW.Begin.Begin;

public class DotRW {

    public static void pause(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            System.err.format("IOException: %s%n", e);
        }
    }

    public static void main(String[] args) {

        Wizard theWizard = new Wizard();

        System.out.println("****************************************************");
        System.out.println("* Welcome to the Dungeon of the recursive Wizard!! *");
        System.out.println("****************************************************\r\n");

        Scanner heroObj = new Scanner(System.in);
        System.out.println("What is your name Hero?");
        String heroName = heroObj.nextLine();
        Hero hero = new Hero(heroName);

        System.out.println("Choose your Weapon: 1) Sword  2) Axe  3) Bow");
        int weaponChoice = heroObj.nextInt();
        heroObj.nextLine();

        System.out.println("What is your weapons name?");
        String weaponName = heroObj.nextLine();

        Weapon weapon = new Weapon(weaponName, weaponChoice);

        System.out.println("Prepare to battle the Recursive Wizard!...");
        System.out.println("3");
        pause(1000);
        System.out.println("2");
        pause(1000);
        System.out.println("1");
        pause(1000);

        Begin begin = new Begin(hero, theWizard, weapon);
        begin.roundOfCombat();

    }
}
