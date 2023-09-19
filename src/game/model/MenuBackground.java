package game.model;

import game.repository.IdamageSystem;
import game.repository.Iequips;
import game.repository.Imenu;

public class MenuBackground implements Imenu, Iequips, IdamageSystem {
    public enum playerClass {
        Warrior(),
        Mage(),
        Archer()
    }

    public static void languageSelection() {
        System.out.println("Selecione o idioma // Choose language: ");
        System.out.println("1 - Português");
        System.out.println("2 - Inglês");
    }
    public static void startMenu(){
        System.out.println("************************************************************");
        System.out.println("*                          MAIN MENU                       *");
        System.out.println("************************************************************");
        System.out.println("*                        1. Start Game                     *");
        System.out.println("*                        2. Tutorial                       *");
        System.out.println("*                        3. Credits                        *");
        System.out.println("*                        4. Exit                           *");
    }
    public static void startMenuPT(){
        System.out.println("************************************************************");
        System.out.println("*                        MENU INICIAL                      *");
        System.out.println("************************************************************");
        System.out.println("*                        1. Iniciar jogo                   *");
        System.out.println("*                        2. Tutorial                       *");
        System.out.println("*                        3. Créditos                       *");
        System.out.println("*                        4. Sair                           *");
    }

    public static void classChoiceMsg() {
        System.out.println("*                 Choose your class betwen:                *");
        System.out.println("*                        1. Warrior                        *");
        System.out.println("*                        2. Mage                           *");
        System.out.println("*                        3. Archer                         *");
        System.out.println("*                        4. Back                           *");
    }

    public static void classChoiceMsgPT() {
        System.out.println("*                   Escolha a sua classe:                  *");
        System.out.println("*                        1. Guerreiro                      *");
        System.out.println("*                        2. Mago                           *");
        System.out.println("*                        3. Arqueiro                       *");
        System.out.println("*                        4. Voltar                         *");
    }

    public static void showTutorial() {
        System.out.println("* Welcome to the Gendventures tutorial! Here, we'll cover  *");
        System.out.println("* some aspects of the project. The game runs in a Java     *");
        System.out.println("* IDE and usually offers options ranging from 1 to 4.      *");
        System.out.println("* The combat system is quite simple and turn-based. It     *");
        System.out.println("* all starts with a distribution of points, starting with  *");
        System.out.println("* 200 points, to be distributed among strength, speed,     *");
        System.out.println("* intelligence, and vitality. Be sure to choose wisely.    *");
        System.out.println("*                                                          *");
        System.out.println("* Here are some quick tips:                                *");
        System.out.println("* Warrior Class: Focused on strength and speed             *");
        System.out.println("* Mage Class: Focused on intelligence and vitality         *");
        System.out.println("* Archer Class: Focused on speed and vitality              *");
    }

    public static void showTutorialPT() {
        System.out.println("* Bem vindo(a) ao tutorial de Gendventures! Aqui veremos   *");
        System.out.println("* alguns apectos do projeto. O jogo roda em uma IDE java   *");
        System.out.println("* e geralmente tem opções que vão de 1 a 4.                *");
        System.out.println("* O sistema de combate é bem simples e baseado em turnos.  *");
        System.out.println("* Tudo começa com uma distribuição de pontos iniciando com *");
        System.out.println("* 200 pontos, a serem distribuídos entre força. velocidade,*");
        System.out.println("* inteligência e vitalidade. Tenha certeza de escolher bem *");
        System.out.println("*                                                          *");
        System.out.println("* Aqui vão algumas dicas rápidas:                          *");
        System.out.println("* Classe Guerreiro: Focada em força e velocidade           *");
        System.out.println("* Classe Mago: Focada em inteligência e vitalidade         *");
        System.out.println("* Classe Arqueiro: Focada em velocidade e vitalidade       *");
    }

    public static void showCredits() {
        System.out.println("* Welcome to Gendventure, a Java game to be played in IDE  *");
        System.out.println("* console. This project is the result of the completion    *");
        System.out.println("* project of 1st block of the Generation Brasil program    *");
        System.out.println("* Java Developer FullStack Junior course. This project was *");
        System.out.println("* created by Raphael Gomes after many research & studies ♥ *");
    }

    public static void showCreditsPT() {
        System.out.println("* Seja bem vindo(a) ao Gendventure, um jogo java para ser  *");
        System.out.println("* executado via console. Este jogo é resultado do projeto  *");
        System.out.println("* de conclusão do 1º bloco do curso da Generation Brasil   *");
        System.out.println("* Java Developer FullStack Junior. Este projeto foi criado *");
        System.out.println("* por Raphael Gomes, após muitas pesquisas e estudos. ♥    *");
        }



    @Override
    public int TotalDamage() {
        return 0;
    }

    @Override
    public int TotalCritDamage() {
        return 0;
    }

    @Override
    public void damageMsg() {

    }

    @Override
    public void critDamageMsg() {

    }

    @Override
    public int TotalDefense() {
        return 0;
    }

    @Override
    public void defenseMsg() {

    }


    public int getWeaponDamage() {
        return 0;
    }


    public int getArmorDefense() {
        return 0;
    }
}
