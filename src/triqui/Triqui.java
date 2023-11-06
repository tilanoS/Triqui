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
        int juego = 1, mov = 1, pos, op, c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0, c6 = 0, c7 = 0, c8 = 0, c9 = 0;
        String O, X;
        Scanner leer = new Scanner(System.in);
        System.out.println("Quiere jugar una partida de triqui \n(1) SI\n(2)NO");
        op = leer.nextInt();
        while (op < 1 || op > 2) {
            System.out.println("Quiere jugar una partida de triqui (1) SI\n(2)NO");
            op = leer.nextInt();
        }
        do {
            switch (op) {
                case 1:
                    while (juego == 1) {
                        System.out.println("  |   | ");
                        System.out.println("---------");
                        System.out.println("  |   | ");
                        System.out.println("---------");
                        System.out.println("  |   | ");
                        if (mov%2 ==1) {
                            System.out.println("Turno del O");
                        } else {
                            System.out.println("Turno de la X");
                        }
                        pos = leer.nextInt();
                        while (pos < 1 || pos > 9) {
                            pos = leer.nextInt();
                        }
                        switch (pos) {
                            case 1:
                                if (c1 == 0) {
                                    if (mov % 2 == 1) {
                                        System.out.println(" O |  |  ");
                                        System.out.println("---------");
                                        System.out.println("  |  |  ");
                                        System.out.println("---------");
                                        System.out.println("  |   | ");
                                    } else {
                                        System.out.println(" X |   | ");
                                        System.out.println("---------");
                                        System.out.println("  |   | ");
                                        System.out.println("---------");
                                        System.out.println("  |   | ");
                                    }
                                }
                                break;
                            case 2:
                                if (c2 == 0) {
                                    if (mov % 2 == 1) {
                                        System.out.println("  |  |  ");
                                        System.out.println("---------");
                                        System.out.println("  |  |  ");
                                        System.out.println("---------");
                                        System.out.println("  |  |  ");
                                    } else {
                                        System.out.println("  |   | ");
                                        System.out.println("---------");
                                        System.out.println("  |   | ");
                                        System.out.println("---------");
                                        System.out.println("  |   | ");
                                    }
                                }
                                break;
                            case 3:
                                if (c3 == 0) {
                                    if (mov % 2 == 1) {
                                        c3 = 1;
                                    } else {
                                        c3 = 2;
                                    }
                                }
                                break;
                            case 4:
                                if (c4 == 0) {
                                    if (mov % 2 == 1) {
                                        c4 = 1;
                                    } else {
                                        c4 = 2;
                                    }
                                }
                                break;
                            case 5:
                                if (c5 == 0) {
                                    if (mov % 2 == 1) {
                                        c5 = 1;
                                    } else {
                                        c5 = 2;
                                    }
                                }
                                break;
                            case 6:
                                if (c6 == 0) {
                                    if (mov % 2 == 1) {
                                        c6 = 1;
                                    } else {
                                        c6 = 2;
                                    }
                                }
                                break;
                            case 7:
                                if (c7 == 0) {
                                    if (mov % 2 == 1) {
                                        c7 = 1;
                                    } else {
                                        c7 = 2;
                                    }
                                }
                                break;
                            case 8:
                                if (c8 == 0) {
                                    if (mov % 2 == 1) {
                                        c8 = 1;
                                    } else {
                                        c8 = 2;
                                    }
                                }
                                break;
                            case 9:
                                if (c9 == 0) {
                                    if (mov % 2 == 1) {
                                        c9 = 1;
                                    } else {
                                        c9 = 2;
                                    }
                                }
                                break;

                        }
                        mov = mov + 1;
                    }

                    break;
                case 2:

                    break;

            }
        } while (op != 2);
    }

}
