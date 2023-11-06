/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package triqui;

import java.util.Scanner;

public class Triqui {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int juego = 1, mov = 1, pos, op; 
        char c1 = ' ', c2 = ' ', c3 = ' ', c4 = ' ', c5 = ' ', c6 = ' ', c7 = ' ', c8 = ' ', c9 = ' ';
        Scanner leer = new Scanner(System.in);
        String j1, j2;
        System.out.println("Quiere jugar una partida de triqui \n(1) SI\n(2)NO");
        op = leer.nextInt();
        while (op < 1 || op > 2) {
            System.out.println("Quiere jugar una partida de triqui (1) SI\n(2)NO");
            op = leer.nextInt();
        }
        if (op == 1) {
            System.out.println("POSICIONES.");
            System.out.println("1 | 2 | 3");
            System.out.println("---------");
            System.out.println("4 | 5 | 6");
            System.out.println("---------");
            System.out.println("7 | 8 | 9 \n");
        }
        while (op == 1) {
            do {
                if (mov % 2 == 1) {
                    System.out.println("Turno del jugador 1:");
                    pos = leer.nextInt();
                    while (pos < 1 || pos > 9) {
                        System.out.println("Casilla invalida:");
                        pos = leer.nextInt();
                    }
                    while ((pos == 1 && c1 != ' ') || (pos == 2 && c2 != ' ') || (pos == 3 && c3 != ' ') || (pos == 4 && c4 != ' ') || (pos == 5 && c5 != ' ') || (pos == 6 && c6 != ' ')
                            || (pos == 7 && c7 != ' ') || (pos == 8 && c8 != ' ') || (pos == 9 && c9 != ' ')) {
                        System.out.println("Casilla ocupada: ");
                        pos = leer.nextInt();
                        while (pos < 1 || pos > 9) {
                            System.out.println("Casilla invalida:");
                            pos = leer.nextInt();
                        }
                    }
                    if (pos == 1 && c1 == ' ') {
                        c1 = 'o';
                        System.out.println(c1 + " | " + c2 + " | " + c3);
                        System.out.println("---------");
                        System.out.println(c4 + " | " + c5 + " | " + c6);
                        System.out.println("---------");
                        System.out.println(c7 + " | " + c8 + " | " + c9);
                    }
                    if (pos == 2 && c2 == ' ') {
                        c2 = 'o';
                        System.out.println(c1 + " | " + c2 + " | " + c3);
                        System.out.println("---------");
                        System.out.println(c4 + " | " + c5 + " | " + c6);
                        System.out.println("---------");
                        System.out.println(c7 + " | " + c8 + " | " + c9);
                    }
                    if (pos == 3 && c3 == ' ') {
                        c3 = 'o';
                        System.out.println(c1 + " | " + c2 + " | " + c3);
                        System.out.println("---------");
                        System.out.println(c4 + " | " + c5 + " | " + c6);
                        System.out.println("---------");
                        System.out.println(c7 + " | " + c8 + " | " + c9);
                    }
                    if (pos == 4 && c4 == ' ') {
                        c4 = 'o';
                        System.out.println(c1 + " | " + c2 + " | " + c3);
                        System.out.println("---------");
                        System.out.println(c4 + " | " + c5 + " | " + c6);
                        System.out.println("---------");
                        System.out.println(c7 + " | " + c8 + " | " + c9);
                    }
                    if (pos == 5 && c5 == ' ') {
                        c5 = 'o';
                        System.out.println(c1 + " | " + c2 + " | " + c3);
                        System.out.println("---------");
                        System.out.println(c4 + " | " + c5 + " | " + c6);
                        System.out.println("---------");
                        System.out.println(c7 + " | " + c8 + " | " + c9);
                    }
                    if (pos == 6 && c6 == ' ') {
                        c6 = 'o';
                        System.out.println(c1 + " | " + c2 + " | " + c3);
                        System.out.println("---------");
                        System.out.println(c4 + " | " + c5 + " | " + c6);
                        System.out.println("---------");
                        System.out.println(c7 + " | " + c8 + " | " + c9);
                    }
                    if (pos == 7 && c7 == ' ') {
                        c7 = 'o';
                        System.out.println(c1 + " | " + c2 + " | " + c3);
                        System.out.println("---------");
                        System.out.println(c4 + " | " + c5 + " | " + c6);
                        System.out.println("---------");
                        System.out.println(c7 + " | " + c8 + " | " + c9);
                    }
                    if (pos == 8 && c8 == ' ') {
                        c8 = 'o';
                        System.out.println(c1 + " | " + c2 + " | " + c3);
                        System.out.println("---------");
                        System.out.println(c4 + " | " + c5 + " | " + c6);
                        System.out.println("---------");
                        System.out.println(c7 + " | " + c8 + " | " + c9);
                    }
                    if (pos == 9 && c9 == ' ') {
                        c9 = 'o';
                        System.out.println(c1 + " | " + c2 + " | " + c3);
                        System.out.println("---------");
                        System.out.println(c4 + " | " + c5 + " | " + c6);
                        System.out.println("---------");
                        System.out.println(c7 + " | " + c8 + " | " + c9);
                    }
                } else {
                    System.out.println("Turno del jugador 2:");
                    pos = leer.nextInt();
                    while (pos < 1 || pos > 9) {
                        System.out.println("Casilla invalida:");
                        pos = leer.nextInt();
                    }
                    while ((pos == 1 && c1 != ' ') || (pos == 2 && c2 != ' ') || (pos == 3 && c3 != ' ') || (pos == 4 && c4 != ' ') || (pos == 5 && c5 != ' ') || (pos == 6 && c6 != ' ')
                            || (pos == 7 && c7 != ' ') || (pos == 8 && c8 != ' ') || (pos == 9 && c9 != ' ')) {
                        System.out.println("Casilla ocupada: ");
                        pos = leer.nextInt();
                        while (pos < 1 || pos > 9) {
                            System.out.println("Casilla invalida:");
                            pos = leer.nextInt();
                        }
                    }
                    if (pos == 1 && c1 == ' ') {
                        c1 = 'x';
                        System.out.println(c1 + " | " + c2 + " | " + c3);
                        System.out.println("---------");
                        System.out.println(c4 + " | " + c5 + " | " + c6);
                        System.out.println("---------");
                        System.out.println(c7 + " | " + c8 + " | " + c9);
                    }
                    if (pos == 2 && c2 == ' ') {
                        c2 = 'x';
                        System.out.println(c1 + " | " + c2 + " | " + c3);
                        System.out.println("---------");
                        System.out.println(c4 + " | " + c5 + " | " + c6);
                        System.out.println("---------");
                        System.out.println(c7 + " | " + c8 + " | " + c9);
                    }
                    if (pos == 3 && c3 == ' ') {
                        c3 = 'x';
                        System.out.println(c1 + " | " + c2 + " | " + c3);
                        System.out.println("---------");
                        System.out.println(c4 + " | " + c5 + " | " + c6);
                        System.out.println("---------");
                        System.out.println(c7 + " | " + c8 + " | " + c9);
                    }
                    if (pos == 4 && c4 == ' ') {
                        c4 = 'x';
                        System.out.println(c1 + " | " + c2 + " | " + c3);
                        System.out.println("---------");
                        System.out.println(c4 + " | " + c5 + " | " + c6);
                        System.out.println("---------");
                        System.out.println(c7 + " | " + c8 + " | " + c9);
                    }
                    if (pos == 5 && c5 == ' ') {
                        c5 = 'x';
                        System.out.println(c1 + " | " + c2 + " | " + c3);
                        System.out.println("---------");
                        System.out.println(c4 + " | " + c5 + " | " + c6);
                        System.out.println("---------");
                        System.out.println(c7 + " | " + c8 + " | " + c9);
                    }
                    if (pos == 6 && c6 == ' ') {
                        c6 = 'x';
                        System.out.println(c1 + " | " + c2 + " | " + c3);
                        System.out.println("---------");
                        System.out.println(c4 + " | " + c5 + " | " + c6);
                        System.out.println("---------");
                        System.out.println(c7 + " | " + c8 + " | " + c9);
                    }
                    if (pos == 7 && c7 == ' ') {
                        c7 = 'x';
                        System.out.println(c1 + " | " + c2 + " | " + c3);
                        System.out.println("---------");
                        System.out.println(c4 + " | " + c5 + " | " + c6);
                        System.out.println("---------");
                        System.out.println(c7 + " | " + c8 + " | " + c9);
                    }
                    if (pos == 8 && c8 == ' ') {
                        c8 = 'x';
                        System.out.println(c1 + " | " + c2 + " | " + c3);
                        System.out.println("---------");
                        System.out.println(c4 + " | " + c5 + " | " + c6);
                        System.out.println("---------");
                        System.out.println(c7 + " | " + c8 + " | " + c9);
                    }
                    if (pos == 9 && c9 == ' ') {
                        c9 = 'x';
                        System.out.println(c1 + " | " + c2 + " | " + c3);
                        System.out.println("---------");
                        System.out.println(c4 + " | " + c5 + " | " + c6);
                        System.out.println("---------");
                        System.out.println(c7 + " | " + c8 + " | " + c9);
                    }
                }
                mov = mov + 1;
                if((c1 == 'o' && c1 == c2 && c2 == c3)||(c4 == 'o' && c4 == c5 && c5 == c6)||(c7 == 'o' && c7 == c8 && c8 == c9)||(c1 == 'o' && c1 == c4 && c4 == c7)||(c2 == 'o' && c2 == c5 && c5 == c8)||(c3 == 'o' && c3 == c6 && c6 == c9)
                        ||(c1 =='o' && c1 == c5 && c5 == c9)||(c3 == 'o' && c3 == c5 && c5 == c7)||(c7 == 'o' && c7 == c8 && c8 == c9)){
                    System.out.println("!EL JUGADOR 1 HA GANADO!");
                    mov=11;
                }
                if((c1 == 'x' && c1 == c2 && c2 == c3)||(c4 == 'x' && c4 == c5 && c5 == c6)||(c7 =='x' && c7 == c8 && c8 == c9)||(c1 == 'x' && c1 == c4 && c4 == c7)||(c2 == 'x' && c2 == c5 && c5 == c8)||(c3 == 'x' && c3 == c6 && c6 == c9)
                        ||(c1 == 'x' && c1 == c5 && c5 == c9)||(c3 == 'x' && c3 == c5 && c5 == c7)||(c7 == 'x' && c7 == c8 && c8 == c9)){
                    System.out.println("!EL JUGADOR 2 HA GANADO!");
                    mov=11;
                }
                if(mov!=11 && mov>=10){
                    System.out.println("!!EMPATE!!");
                }
                if (mov > 9) {
                    op = 2;
                }
            } while (mov < 9);
        }
    }
}
