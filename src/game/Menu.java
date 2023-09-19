package game;

import game.model.*;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;

import static game.model.EnemyWarrior.setEnemyWarrior;

public class Menu extends MenuBackground {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        languageSelection();
        int language = sc.nextInt();
        switch (language) {
            case 1:
                startMenuPT();
                break;
            case 2:
                startMenu();
                break;
            default:
                System.out.println("Opção inválida! // Invalid option!!");
        }

        int enterMenu = sc.nextInt();
        int classChoice = 0;
        int back = 0;

        switch (enterMenu) {
            case 1:
                if (language == 1) {
                    classChoiceMsgPT();
                } else {
                    classChoiceMsg();
                }

                break;
            case 2:
                if (language == 1) {
                    showTutorialPT();
                } else {
                    showTutorial();
                }
                break;
            case 3:
                if (language == 1) {
                    showCreditsPT();
                } else {
                    showCredits();
                }
                back = sc.nextInt();
                if (back == 1) {
                    languageSelection();
                }
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid option!");
                System.out.println("Choose betwen 1, 2, 3 or 4");
        }
        int weaponDamage = 0;
        classChoice = sc.nextInt();
        sc.nextLine();
        int points = 200;
        String nome = null;

        try {
            System.out.println("Diga-nos seu nome: ");
            nome = sc.nextLine();
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Entrada vazia ou inválida! Digite um nome válido.");
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException("Erro na entrada de texto ou entrada inválida. Digite um nome válido.");
        } catch (IllegalStateException e) {
            throw new IllegalStateException("Erro na entrada de texto ou entrada inválida. Digite um nome válido.");
        }

        if (nome != null && !nome.isEmpty()) {
            System.out.println("Seja bem vindo(a), " + nome);
        } else {
            while (nome == null || nome.isEmpty()) {
                System.out.println("Digite um nome válido: ");
                nome = sc.nextLine();
            }
        }


        Warrior player1 = new Warrior();
        Mage player2 = new Mage();
        Archer player3 = new Archer();

        do {

            if (classChoice == 1) {

                player1.setName(nome);
                System.out.println("Você tem " + points + " pontos para distribuir. \nEscolha a distribuição dos pontos em: \nForça:");
                if (player1.getStrength() < points && points > 0) {
                    player1.setStrength(sc.nextInt());
                    points -= player1.getStrength();
                } else {
                    System.out.println("Pontuação inválida");
                }

                if (player1.getSpeed() < points && points > 0) {
                    System.out.println("Você tem " + points + " pontos para distribuir. \nEscolha a distribuição dos pontos em: \nVelocidade:");
                    player1.setSpeed(sc.nextInt());
                    points -= player1.getSpeed();
                } else {
                    System.out.println("Pontuação inválida");
                }

                if (player1.getIntelligence() < points && points > 0) {
                    System.out.println("Você tem " + points + " pontos para distribuir. \nEscolha a distribuição dos pontos em: \nInteligência:");
                    player1.setIntelligence(sc.nextInt());
                    points -= player1.getIntelligence();
                } else {
                    System.out.println("Pontuação inválida");
                }

                if (player1.getLife() < points && points > 0) {
                    System.out.println("Você tem " + points + " pontos para distribuir. \nEscolha a distribuição dos pontos em: \nVida:");
                    player1.setLife(sc.nextInt() * 10);
                    points -= player1.getLife();

                } else {
                    System.out.println("Pontuação inválida");
                }


            } else if (classChoice == 2) {

                player2.setName(nome);
                System.out.println("Você tem " + points + " pontos para distribuir. \nEscolha a distribuição dos pontos em: \nForça:");
                if (player2.getStrength() < points && points > 0) {
                    player2.setStrength(sc.nextInt());
                    points -= player2.getStrength();
                } else {
                    System.out.println("Pontuação inválida");
                }

                if (player2.getSpeed() < points && points > 0) {
                    System.out.println("Você tem " + points + " pontos para distribuir. \nEscolha a distribuição dos pontos em: \nVelocidade:");
                    player2.setSpeed(sc.nextInt());
                    points -= player2.getSpeed();
                } else {
                    System.out.println("Pontuação inválida");
                }

                if (player2.getIntelligence() < points && points > 0) {
                    System.out.println("Você tem " + points + " pontos para distribuir. \nEscolha a distribuição dos pontos em: \nInteligência:");
                    player2.setIntelligence(sc.nextInt());
                    points -= player2.getIntelligence();
                } else {
                    System.out.println("Pontuação inválida");
                }

                if (player2.getLife() < points && points > 0) {
                    System.out.println("Você tem " + points + " pontos para distribuir. \nEscolha a distribuição dos pontos em: \nVida:");
                    player2.setLife(sc.nextInt() * 10);
                    points -= player2.getLife();

                } else {
                    System.out.println("Pontuação inválida");
                }


            } else if (classChoice == 3) {

                player3.setName(nome);
                System.out.println("Você tem " + points + " pontos para distribuir. \nEscolha a distribuição dos pontos em: \nForça:");
                if (player3.getStrength() < points && points > 0) {
                    player3.setStrength(sc.nextInt());
                    points -= player3.getStrength();
                } else {
                    System.out.println("Pontuação inválida");
                }

                if (player3.getSpeed() < points && points > 0) {
                    System.out.println("Você tem " + points + " pontos para distribuir. \nEscolha a distribuição dos pontos em: \nVelocidade:");
                    player3.setSpeed(sc.nextInt());
                    points -= player3.getSpeed();
                } else {
                    System.out.println("Pontuação inválida");
                }

                if (player3.getIntelligence() < points && points > 0) {
                    System.out.println("Você tem " + points + " pontos para distribuir. \nEscolha a distribuição dos pontos em: \nInteligência:");
                    player3.setIntelligence(sc.nextInt());
                    points -= player3.getIntelligence();
                } else {
                    System.out.println("Pontuação inválida");
                }

                if (player3.getLife() < points && points > 0) {
                    System.out.println("Você tem " + points + " pontos para distribuir. \nEscolha a distribuição dos pontos em: \nVida:");
                    player3.setLife(sc.nextInt() * 10);
                    points -= player3.getLife();

                } else {
                    System.out.println("Pontuação inválida");
                }

            }
        } while (points > 0);
        System.out.println("Você zerou seus pontos!");

        setEnemyWarrior();
        int number;
        Random random = new Random();
        number = random.nextInt(3) + 1;


        int damageEWarrior;
        int defenseEWarrior;
        int lifeEWarrior;
        int damagePlayer;
        int defensePlayer;
        int lifePlayer;
        int damageTotalPlayer;
        int damageTotalEnemy;
        int round = 1;
        int lifeCounterPlayer;
        int lifeCounterEnemy;

        damageEWarrior = setEnemyWarrior().TotalDamage() * number;
        defenseEWarrior = setEnemyWarrior().TotalDefense();
        lifeEWarrior = setEnemyWarrior().getLife();
        damagePlayer = player1.TotalDamage();
        defensePlayer = player1.TotalDefense();
        lifePlayer = player1.getLife();


        while (lifePlayer > 0 && lifeEWarrior > 0) {
            damageTotalPlayer = damagePlayer - defenseEWarrior;
            damageTotalEnemy = damageEWarrior - defensePlayer;
            lifePlayer -= damageTotalEnemy;
            lifeEWarrior -= damageTotalPlayer;

            System.out.println("Round " + round);
            if(lifePlayer > 0) {
                System.out.println("Vida do jogador: " + lifePlayer);
            }else if (lifePlayer <= 0) {
                System.out.println("Vida do jogador chegou a zero!");
            }
            System.out.println("Total de dano causado ao inimigo: " + damageTotalPlayer);
            if(lifeEWarrior > 0) {
                System.out.println("Vida do inimigo: " + lifeEWarrior);
            } else if (lifeEWarrior <= 0) {
                System.out.println("Vida do inimigo chegou a zero!");
            }
            System.out.println("Total de dano causado pelo inimigo: " + damageTotalEnemy);

            round++;

            if (lifePlayer <= 0) {
                System.out.println("Jogador perdeu");
                break;
            } else if (lifeEWarrior <= 0) {
                System.out.println("Inimigo venceu");
                break;
            }

        }





//        for(round = 1; round < 10; round++){
//            System.out.println("\nRound " + round + ":");
//            if (round % 2 == 0) {
//                damageTotal = damagePlayer - defenseEWarrior;
//                if(damageTotal > 0) { lifeEWarrior -= damageTotal;}
//                System.out.println("Você ataca e causa " + damageTotal + " de dano a seu inimigo");
//                System.out.println("Vida do inimigo após o ataque: " + lifeEWarrior);
//            } else {
//                damageTotal = damageEWarrior - defensePlayer;
//                if(damageTotal > 0) { lifePlayer -= damageTotal;}
//                System.out.println("Seu inimigo ataca e causa " + damageTotal + " de dano a você");
//                System.out.println("Sua vida após o ataque: " + lifePlayer);
//            }
//        }
    }
}