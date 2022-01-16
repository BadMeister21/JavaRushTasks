package com.javarush.task.pro.task06.task0622;

import java.util.Scanner;

/* 
ФАПАХ VS ПАПИЧ
*/

public class Solution {
    public static String getFirstPositionPhrase = "Помоги Папичу определить, где спрятался Габен? Введи номер позиции (1, 2, 3 или 4):";
    public static String getPositionPhrase = "Габен не обнаружен. Давай попробуем снова. Введи номер позиции (1, 2, 3 или 4):";
    public static String findDiabloPhrase = "Папич обнаружил Габена.\n" +
            "⣿⣿⣿⣿⣿⣿⣿⡿⠟⠛⠉⠉⠉⠉⠋⠉⠉⠙⠛⠛⠻⠿⢿⣿⣿⣿⣿⣿⣿⣿\n" +
            "⣿⣿⣿⣿⠿⠋⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠈⠉⠻⣿⣿⣿⣿⣿\n" +
            "⣿⣿⡟⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠙⢻⣿⣿⣿\n" +
            "⣿⠏⠄⠄⠄⠄⠄⠄⠄⠄⢀⣔⢤⣄⡀⠄⡄⡀⠄⠄⠄⠄⠄⠄⠄⠄⠄⢻⣿⣿\n" +
            "⠏⠄⠄⠄⠄⠄⠄⠄⢀⣀⣨⣵⣿⣿⣿⣿⣧⣦⣤⣀⣿⣷⡐⠄⠄⠄⠄⠄⢿⣿\n" +
            "⠄⠄⠄⠄⠄⠄⠐⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⡀⠄⠄⠄⢚⣿\n" +
            "⣆⠄⠄⠄⠄⠄⠄⢻⣿⣿⣿⣿⡿⠛⠛⠛⠛⣿⢿⣿⣿⣿⡿⢟⣻⣄⣤⣮⡝⣿\n" +
            "⣿⠆⠄⠄⠄⠄⠄⠄⠄⠄⠉⠘⣿⡗⡕⣋⢉⣩⣽⣬⣭⣶⣿⣿⣿⣿⣝⣻⣷⣿\n" +
            "⣿⣦⡀⠄⠄⠠⢀⠄⠄⠁⠄⠄⣿⣿⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⣿\n" +
            "⣿⣿⣿⡆⠄⠄⠰⣶⡗⠄⠄⠄⣿⣿⣿⣿⣦⣌⠙⠿⣿⣿⣿⣿⣿⣿⣿⡛⠱⢿\n" +
            "⣿⣿⣿⣿⡀⠄⠄⠿⣿⠄⠄⠄⠨⡿⠿⠿⣿⣟⣿⣯⣹⣿⣿⣿⣿⣿⣿⣿⣦⡀\n" +
            "⣿⣿⣿⣿⣷⠄⠄⠄⢷⣦⠄⠄⠐⢶⢾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇\n" +
            "⣿⣿⣿⣿⣿⣧⡄⠄⠄⠉⠄⠄⠄⢉⣽⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⠄\n" +
            "⣿⣿⣿⣿⣿⠟⠋⠄⠄⠄⠄⠄⠄⠈⠛⠿⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠋⠄⠄\n" +
            "⣿⠿⠛⠉⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠘⠿⢿⣿⣿⣿⣿⣿⠿⠋⠄⠄⠄⠄";
    public static String diabloDefendPhrase = "Папич атакует. Габен отбил атаку Папича и нанес ответный удар.";
    public static String amigoAttackPhrase = "w█www█ww█wwww█www███www█w\n" +
            "w█www█ww█wwww█ww█www█ww█w\n" +
            "w█████ww████w█ww█www█ww█w\n" +
            "w█www█ww█ww█w█ww█████wwww\n" +
            "w█www█ww████w█ww█www█ww█w\n" +
            "Удар Папича достиг цели. Габен потерял 3 жизни.";
    public static String winPhrase = "Папич одержал победу над Габеном, Легчайшая для величайшего.\n" +
            "⠄⠄⠄⠄⠄⠄⢴⡶⣶⣶⣶⡒⣶⣶⣖⠢⡄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄\n" +
            "⠄⠄⠄⠄⠄⠄⢠⣿⣋⣿⣿⣉⣿⣿⣯⣧⡰⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄\n" +
            "⠄⠄⠄⠄⠄⠄⣿⣿⣹⣿⣿⣏⣿⣿⡗⣿⣿⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄\n" +
            "⠄⠄⠄⠄⠄⠄⠟⡛⣉⣭⣭⣭⠌⠛⡻⢿⣿⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄\n" +
            "⠄⠄⠄⠄⠄⠄⠄⠄⣤⡌⣿⣷⣯⣭⣿⡆⣈⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄\n" +
            "⠄⠄⠄⠄⠄⠄⠄⢻⣿⣿⣿⣿⣿⣿⣿⣷⢛⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄\n" +
            "⠄⠄⠄⠄⠄⠄⠄⠄⢻⣷⣽⣿⣿⣿⢿⠃⣼⣧⣀⠄⠄⠄⠄⠄⠄⠄⠄⠄\n" +
            "⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣛⣻⣿⠟⣀⡜⣻⢿⣿⣿⣶⣤⡀⠄⠄⠄⠄⠄\n" +
            "⠄⠄⠄⠄⠄⠄⠄⠄⢠⣤⣀⣨⣥⣾⢟⣧⣿⠸⣿⣿⣿⣿⣿⣤⡀⠄⠄⠄\n" +
            "⠄⠄⠄⠄⠄⠄⠄⠄⢟⣫⣯⡻⣋⣵⣟⡼⣛⠴⣫⣭⣽⣿⣷⣭⡻⣦⡀⠄\n" +
            "⠄⠄⠄⠄⠄⠄⠄⢰⣿⣿⣿⢏⣽⣿⢋⣾⡟⢺⣿⣿⣿⣿⣿⣿⣷⢹⣷⠄\n" +
            "⠄⠄⠄⠄⠄⠄⠄⣿⣿⣿⢣⣿⣿⣿⢸⣿⡇⣾⣿⠏⠉⣿⣿⣿⡇⣿⣿⡆\n" +
            "⠄⠄⠄⠄⠄⠄⠄⣿⣿⣿⢸⣿⣿⣿⠸⣿⡇⣿⣿⡆⣼⣿⣿⣿⡇⣿⣿⡇\n" +
            "⠇⢀⠄⠄⠄⠄⠄⠘⣿⣿⡘⣿⣿⣷⢀⣿⣷⣿⣿⡿⠿⢿⣿⣿⡇⣩⣿⡇\n" +
            "⣿⣿⠃⠄⠄⠄⠄⠄⠄⢻⣷⠙⠛⠋⣿⣿⣿⣿⣿⣷⣶⣿⣿⣿⡇⣿⣿⡇";
    public static String loosePhrase = "Габен победил Папича и навечно отправил его в скрытый пул\n" +
            ".⠄⠄⠄⠄⠄⠄⠄⠄⣰⣶⣶⣿⣿⣷⣦⣤⣤⣶⣄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄\n" +
            "⠄⠄⠄⠄⠄⢀⣤⣤⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣦⠄⠄⠄⠄⠄⠄⠄⠄\n" +
            "⠄⠄⠄⢀⣴⣿⣿⣿⣿⣿⣿⣿⣿⡿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣦⡀⠄⠄⠄⠄\n" +
            "⠄⠄⠄⣿⣿⣿⣿⣿⡿⠟⠉⠋⠉⠄⠈⠉⠛⠛⠄⠙⣿⣿⣿⣿⣿⣿⡀⠄⠄⠄\n" +
            "⠄⠄⠘⣿⣿⣿⣿⠟⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢸⣿⣿⣿⣿⣿⣄⠄⠄⠄\n" +
            "⠄⠄⣾⣿⣿⣿⡇⣀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠒⢤⣤⡼⣿⣿⣿⣿⣿⣿⡆⠄⠄\n" +
            "⣠⣾⣿⣿⣿⣿⣿⣿⣿⣧⣶⣶⣦⣤⠠⣧⣤⣤⣀⡀⠄⠙⣿⣿⣿⣿⣿⡂⠄⠄\n" +
            "⣿⣿⣿⣿⣿⣿⠟⣿⣿⣿⣿⠿⢿⡷⠲⣼⢯⣿⣷⣬⡳⣆⣀⣻⣿⣿⣿⣧⠄⠄\n" +
            "⠻⣿⣿⣿⣿⣿⠄⠈⠳⣄⣀⡰⠋⠁⠄⠘⣄⠈⠛⢛⡹⠉⠄⢸⣿⣿⣿⣿⣦⠄\n" +
            "⢠⡙⣿⣿⣿⣿⠄⠄⠄⠄⠄⣤⠛⠄⠄⠐⠄⠉⠉⠉⠄⠄⠄⠸⣿⣿⣿⣿⣿⣦\n" +
            "⠈⣿⣿⣿⣿⣿⠄⠄⠄⠄⠄⠉⢻⣦⣶⡷⠆⠄⠄⠄⠄⠄⠄⠄⢉⣿⣿⣿⣿⡝\n" +
            "⠄⠿⣿⣿⣿⣿⡆⠄⠄⠄⢀⣠⣤⣀⣀⡀⠄⠄⠄⠄⠄⠄⠄⢀⣸⣿⣿⣿⠉⠄\n" +
            "⠄⠄⠛⢿⣿⣿⣿⣄⠄⠄⠉⠻⠶⠤⠭⠍⠓⠒⠄⠄⠄⣠⠄⣸⣿⣿⣿⠏⠄⠄\n" +
            "⠄⠄⠄⢀⣻⣿⣿⣿⣦⡀⠄⠄⠄⠄⠄⠄⠄⠄⠄⣀⣴⠟⢀⣿⣿⣿⡟⠄⠄⠄\n" +
            "⠄⠄⣰⣿⣿⣿⣿⣿⣿⣿⣤⣀⣀⡀⢀⣀⣀⣤⡾⠟⠁⠄⣿⣿⣿⡟⠁⠄⠄⠄\n" +
            "⠄⠄⠈⠛⠿⣿⠿⠙⠿⣿⣿⣿⣿⣿⣿⣿⠿⠋⠄⠄⠄⠄⠉⠄⠈⠄⠄⠄⠄⠄";
    public static int diabloPosition;
    public static int amigoLives = 9;
    public static int diabloLives = 15;

    public static void main(String[] args) {
        diabloPosition = getRandomNumber(4);
        findDiablo();
        battle();
        if (isAmigoWin())
            System.out.println(winPhrase);
        else
            System.out.println(loosePhrase);
        }

    public static int getRandomNumber(int range) {
        return (int) (Math.random() * range) + 1;
    }
    public static void findDiablo() {
        System.out.println(getFirstPositionPhrase);
        Scanner console = new Scanner(System.in);
        int search = console.nextInt();
        while (search != diabloPosition) {
            System.out.println(getPositionPhrase);
            search = console.nextInt();
            }
            System.out.println(findDiabloPhrase);
    }
    public static void amigoLostLife() {
        amigoLives = amigoLives - 3;
    }
    public static void diabloLostLife() {
        diabloLives = diabloLives - 3;
    }
    public static int amigoAttacks () {
       return getRandomNumber(3);
    }
    public static int diabloDefends () {
        return getRandomNumber(3);
    }
    public static void battle() {
        while (amigoLives > 0 && diabloLives > 0) {
            if (amigoAttacks() == diabloDefends()) {
                amigoLostLife();
                System.out.println(diabloDefendPhrase + " У Папича осталось " + amigoLives + " жизней");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            else {
                diabloLostLife();
                System.out.println(amigoAttackPhrase + "У Габена осталось " + diabloLives  + " жизней");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static boolean isAmigoWin() {
        return diabloLives == 0? true: false;

    }
}

