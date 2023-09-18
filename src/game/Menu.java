package game;

import game.model.EnemyWarrior;
import game.model.Equips;
import game.model.MenuBackground;
import game.model.Warrior;
import game.repository.Imenu;

import java.util.Random;
import java.util.Scanner;

public class Menu extends MenuBackground {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int enterMenu;
        int classChoice;

        while (true) {
            enterMenu = startMenu();

            switch (enterMenu) {
                case 1:
                    classChoice = classChoiceMsg();
                    break;
                case 2:
                    System.out.println("show");
                    break;
                case 3:
                    System.out.println("Vlw flw!");
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option!");
                    System.out.println("Choose betwen 1, 2, 3 or 4");
            }
            switch (classChoice) {
                case 1:
                    System.out.println("eaa");
                    break;
                case 2:
                    System.out.println("aae");
                    break;
                default:
                    System.out.println("eaeeeee");
            }
        }
        System.out.println("Sua classe");
    }
}