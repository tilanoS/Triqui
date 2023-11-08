/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package triquijuegoterminado;

import java.util.Scanner;

/**
 *
 * @author tilan
 */
public class TriquiJuegoTerminado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int juego = 1, mov = 1, pos, op, c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0, c6 = 0, c7 = 0, c8 = 0, c9 = 0;
        char cm1 = ' ', cm2 = ' ', cm3 = ' ', cm4 = ' ', cm5 = ' ', cm6 = ' ', cm7 = ' ', cm8 = ' ', cm9 = ' ';
        Scanner leer = new Scanner(System.in);
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
                    while ((pos == 1 && c1 != 0) || (pos == 2 && c2 != 0) || (pos == 3 && c3 != 0) || (pos == 4 && c4 != 0) || (pos == 5 && c5 != 0) || (pos == 6 && c6 != 0)
                            || (pos == 7 && c7 != 0) || (pos == 8 && c8 != 0) || (pos == 9 && c9 != 0)) {
                        System.out.println("Casilla ocupada: ");
                        pos = leer.nextInt();
                        while (pos < 1 || pos > 9) {
                            System.out.println("Casilla invalida:");
                            pos = leer.nextInt();
                        }
                    }
                    if (pos == 1) {
                        c1 = 1;
                        cm1 = 'o';
                        /*System.out.println(c1 + " | " + c2 + " | " + c3);
                        System.out.println("---------");
                        System.out.println(c4 + " | " + c5 + " | " + c6);
                        System.out.println("---------");
                        System.out.println(c7 + " | " + c8 + " | " + c9);
                        Esta sería la tabla detras de la que se muestra de salida, pues se toman en cuenta los valores del O (1) y X (2)
                        */
                        System.out.println("\n");
                        System.out.println(cm1 + " | " + cm2 + " | " + cm3);
                        System.out.println("---------");
                        System.out.println(cm4 + " | " + cm5 + " | " + cm6);
                        System.out.println("---------");
                        System.out.println(cm7 + " | " + cm8 + " | " + cm9);
                    }
                    if (pos == 2) {
                        c2 = 1;
                        cm2 = 'o';
                        System.out.println(cm1 + " | " + cm2 + " | " + cm3);
                        System.out.println("---------");
                        System.out.println(cm4 + " | " + cm5 + " | " + cm6);
                        System.out.println("---------");
                        System.out.println(cm7 + " | " + cm8 + " | " + c9);
                    }
                    if (pos == 3) {
                        c3 = 1;
                        cm3 = 'o';
                        System.out.println(cm1 + " | " + cm2 + " | " + cm3);
                        System.out.println("---------");
                        System.out.println(cm4 + " | " + cm5 + " | " + cm6);
                        System.out.println("---------");
                        System.out.println(cm7 + " | " + cm8 + " | " + cm9);
                    }
                    if (pos == 4) {
                        c4 = 1;
                        cm4 = 'o';
                        System.out.println(cm1 + " | " + cm2 + " | " + cm3);
                        System.out.println("---------");
                        System.out.println(cm4 + " | " + cm5 + " | " + cm6);
                        System.out.println("---------");
                        System.out.println(cm7 + " | " + cm8 + " | " + cm9);
                    }
                    if (pos == 5) {
                        c5 = 1;
                        cm5 = 'o';
                        System.out.println(cm1 + " | " + cm2 + " | " + cm3);
                        System.out.println("---------");
                        System.out.println(cm4 + " | " + cm5 + " | " + cm6);
                        System.out.println("---------");
                        System.out.println(cm7 + " | " + cm8 + " | " + cm9);
                    }
                    if (pos == 6) {
                        c6 = 1;
                        cm6 = 'o';
                        System.out.println(cm1 + " | " + cm2 + " | " + cm3);
                        System.out.println("---------");
                        System.out.println(cm4 + " | " + cm5 + " | " + cm6);
                        System.out.println("---------");
                        System.out.println(cm7 + " | " + cm8 + " | " + cm9);
                    }
                    if (pos == 7) {
                        c7 = 1;
                        cm7 = 'o';
                        System.out.println(cm1 + " | " + cm2 + " | " + cm3);
                        System.out.println("---------");
                        System.out.println(cm4 + " | " + cm5 + " | " + cm6);
                        System.out.println("---------");
                        System.out.println(cm7 + " | " + cm8 + " | " + cm9);
                    }
                    if (pos == 8) {
                        c8 = 1;
                        cm8 = 'o';
                        System.out.println(cm1 + " | " + cm2 + " | " + cm3);
                        System.out.println("---------");
                        System.out.println(cm4 + " | " + cm5 + " | " + cm6);
                        System.out.println("---------");
                        System.out.println(cm7 + " | " + cm8 + " | " + cm9);
                    }
                    if (pos == 9) {
                        c9 = 1;
                        cm9 = 'o';
                        System.out.println(cm1 + " | " + cm2 + " | " + cm3);
                        System.out.println("---------");
                        System.out.println(cm4 + " | " + cm5 + " | " + cm6);
                        System.out.println("---------");
                        System.out.println(cm7 + " | " + cm8 + " | " + cm9);
                    }
                } else {
                    System.out.println("Turno del jugador 2:");
                    pos = leer.nextInt();
                    while (pos < 1 || pos > 9) {
                        System.out.println("Casilla invalida:");
                        pos = leer.nextInt();
                    }
                    while ((pos == 1 && c1 != 0) || (pos == 2 && c2 != 0) || (pos == 3 && c3 != 0) || (pos == 4 && c4 != 0) || (pos == 5 && c5 != 0) || (pos == 6 && c6 != 0)
                            || (pos == 7 && c7 != 0) || (pos == 8 && c8 != 0) || (pos == 9 && c9 != 0)) {
                        System.out.println("Casilla ocupada: ");
                        pos = leer.nextInt();
                        while (pos < 1 || pos > 9) {
                            System.out.println("Casilla invalida:");
                            pos = leer.nextInt();
                        }
                    }
                    if (pos == 1) {
                        c1 = 2;
                        cm1 = 'x';
                        System.out.println(cm1 + " | " + cm2 + " | " + cm3);
                        System.out.println("---------");
                        System.out.println(cm4 + " | " + cm5 + " | " + cm6);
                        System.out.println("---------");
                        System.out.println(cm7 + " | " + cm8 + " | " + cm9);
                    }
                    if (pos == 2) {
                        c2 = 2;
                        cm2 = 'x';
                        System.out.println(cm1 + " | " + cm2 + " | " + cm3);
                        System.out.println("---------");
                        System.out.println(cm4 + " | " + cm5 + " | " + cm6);
                        System.out.println("---------");
                        System.out.println(cm7 + " | " + cm8 + " | " + cm9);
                    }
                    if (pos == 3) {
                        c3 = 2;
                        cm3 = 'x';
                        System.out.println(cm1 + " | " + cm2 + " | " + cm3);
                        System.out.println("---------");
                        System.out.println(cm4 + " | " + cm5 + " | " + cm6);
                        System.out.println("---------");
                        System.out.println(cm7 + " | " + cm8 + " | " + cm9);
                    }
                    if (pos == 4) {
                        c4 = 2;
                        cm4 = 'x';
                        System.out.println(cm1 + " | " + cm2 + " | " + cm3);
                        System.out.println("---------");
                        System.out.println(cm4 + " | " + cm5 + " | " + cm6);
                        System.out.println("---------");
                        System.out.println(cm7 + " | " + cm8 + " | " + cm9);
                    }
                    if (pos == 5) {
                        c5 = 2;
                        cm5 = 'x';
                        System.out.println(cm1 + " | " + cm2 + " | " + cm3);
                        System.out.println("---------");
                        System.out.println(cm4 + " | " + cm5 + " | " + cm6);
                        System.out.println("---------");
                        System.out.println(cm7 + " | " + cm8 + " | " + cm9);
                    }
                    if (pos == 6) {
                        c6 = 2;
                        cm6 = 'x';
                        System.out.println(cm1 + " | " + cm2 + " | " + cm3);
                        System.out.println("---------");
                        System.out.println(cm4 + " | " + cm5 + " | " + cm6);
                        System.out.println("---------");
                        System.out.println(cm7 + " | " + cm8 + " | " + cm9);
                    }
                    if (pos == 7) {
                        c7 = 2;
                        cm7 = 'x';
                        System.out.println(cm1 + " | " + cm2 + " | " + cm3);
                        System.out.println("---------");
                        System.out.println(cm4 + " | " + cm5 + " | " + cm6);
                        System.out.println("---------");
                        System.out.println(cm7 + " | " + cm8 + " | " + cm9);
                    }
                    if (pos == 8) {
                        c8 = 2;
                        cm8 = 'x';
                        System.out.println(cm1 + " | " + cm2 + " | " + cm3);
                        System.out.println("---------");
                        System.out.println(cm4 + " | " + cm5 + " | " + cm6);
                        System.out.println("---------");
                        System.out.println(cm7 + " | " + cm8 + " | " + cm9);
                    }
                    if (pos == 9) {
                        c9 = 2;
                        cm9 = 'x';
                        System.out.println(cm1 + " | " + cm2 + " | " + cm3);
                        System.out.println("---------");
                        System.out.println(cm4 + " | " + cm5 + " | " + cm6);
                        System.out.println("---------");
                        System.out.println(cm7 + " | " + cm8 + " | " + cm9);
                    }
                }
                mov = mov + 1;
                if ((c1 == 1 && c1 == c2 && c2 == c3) || (c4 == 1 && c4 == c5 && c5 == c6) || (c7 == 1 && c7 == c8 && c8 == c9) || (c1 == 1 && c1 == c4 && c4 == c7) || (c2 == 1 && c2 == c5 && c5 == c8) || (c3 == 1 && c3 == c6 && c6 == c9)
                        || (c1 == 1 && c1 == c5 && c5 == c9) || (c3 == 1 && c3 == c5 && c5 == c7) || (c7 == 1 && c7 == c8 && c8 == c9)) {
                    System.out.println("!EL JUGADOR 1 HA GANADO!");
                    mov = 11;
                }
                if ((c1 == 1 && c1 == c2 && c2 == c3) || (c4 == 1 && c4 == c5 && c5 == c6) || (c7 == 1 && c7 == c8 && c8 == c9) || (c1 == 1 && c1 == c4 && c4 == c7) || (c2 == 1 && c2 == c5 && c5 == c8) || (c3 == 1 && c3 == c6 && c6 == c9)
                        || (c1 == 1 && c1 == c5 && c5 == c9) || (c3 == 1 && c3 == c5 && c5 == c7) || (c7 == 1 && c7 == c8 && c8 == c9)) {
                    System.out.println("!EL JUGADOR 2 HA GANADO!");
                    mov = 11;
                }
                if (mov != 11 && mov >= 10) {
                    System.out.println("!!EMPATE!!");
                }
                if (mov > 9) {
                    op = 2;
                }
            } while (mov < 9);
        }
    }

}
