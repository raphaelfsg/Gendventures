package game.model;

import game.repository.Imenu;

import java.util.Scanner;

public class MenuBackground implements Imenu {

    public static int startMenu() {
        System.out.println("************************************************************");
        System.out.println("*                        MENU INICIAL                      *");
        System.out.println("************************************************************");
        System.out.println("*                        1. Start Game                     *");
        System.out.println("*                        2. Tutorial                       *");
        System.out.println("*                        3. Credits                        *");
        System.out.println("*                        4. Exit                           *");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static int classChoiceMsg() {
        System.out.println("*                 Choose your class betwen:                *");
        System.out.println("*                        1. Warrior                        *");
        System.out.println("*                        2. Mage                           *");
        System.out.println("*                        3. Archer                         *");
        System.out.println("*                        4. Back                           *");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static void classView() {

    }
}
