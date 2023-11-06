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
                    while ((pos == 1 && c1 != 0) || (pos == 2 && c2 != 0) || (pos == 3 && c3 != 0) || (pos == 4 && c4 != 0) || (pos == 5 && c5 != 0) || (pos == 6 && c6 != 0)
                            || (pos == 7 && c7 != 0) || (pos == 8 && c8 != 0) || (pos == 9 && c9 != 0)) {
                        System.out.println("Casilla ocupada: ");
                        pos = leer.nextInt();
                        while (pos < 1 || pos > 9) {
                            System.out.println("Casilla invalida:");
                            pos = leer.nextInt();
                        }
                    }
                    if (pos == 1 && c1 == 0) {
                        c1 = 1;
                        System.out.println(c1 + " | " + c2 + " | " + c3);
                        System.out.println("---------");
                        System.out.println(c4 + " | " + c5 + " | " + c6);
                        System.out.println("---------");
                        System.out.println(c7 + " | " + c8 + " | " + c9);
                    }
                    if (pos == 2 && c2 == 0) {
                        c2 = 1;
                        System.out.println(c1 + " | " + c2 + " | " + c3);
                        System.out.println("---------");
                        System.out.println(c4 + " | " + c5 + " | " + c6);
                        System.out.println("---------");
                        System.out.println(c7 + " | " + c8 + " | " + c9);
                    }
                    if (pos == 3 && c3 == 0) {
                        c3 = 1;
                        System.out.println(c1 + " | " + c2 + " | " + c3);
                        System.out.println("---------");
                        System.out.println(c4 + " | " + c5 + " | " + c6);
                        System.out.println("---------");
                        System.out.println(c7 + " | " + c8 + " | " + c9);
                    }
                    if (pos == 4 && c4 == 0) {
                        c4 = 1;
                        System.out.println(c1 + " | " + c2 + " | " + c3);
                        System.out.println("---------");
                        System.out.println(c4 + " | " + c5 + " | " + c6);
                        System.out.println("---------");
                        System.out.println(c7 + " | " + c8 + " | " + c9);
                    }
                    if (pos == 5 && c5 == 0) {
                        c5 = 1;
                        System.out.println(c1 + " | " + c2 + " | " + c3);
                        System.out.println("---------");
                        System.out.println(c4 + " | " + c5 + " | " + c6);
                        System.out.println("---------");
                        System.out.println(c7 + " | " + c8 + " | " + c9);
                    }
                    if (pos == 6 && c6 == 0) {
                        c6 = 1;
                        System.out.println(c1 + " | " + c2 + " | " + c3);
                        System.out.println("---------");
                        System.out.println(c4 + " | " + c5 + " | " + c6);
                        System.out.println("---------");
                        System.out.println(c7 + " | " + c8 + " | " + c9);
                    }
                    if (pos == 7 && c7 == 0) {
                        c7 = 1;
                        System.out.println(c1 + " | " + c2 + " | " + c3);
                        System.out.println("---------");
                        System.out.println(c4 + " | " + c5 + " | " + c6);
                        System.out.println("---------");
                        System.out.println(c7 + " | " + c8 + " | " + c9);
                    }
                    if (pos == 8 && c8 == 0) {
                        c8 = 1;
                        System.out.println(c1 + " | " + c2 + " | " + c3);
                        System.out.println("---------");
                        System.out.println(c4 + " | " + c5 + " | " + c6);
                        System.out.println("---------");
                        System.out.println(c7 + " | " + c8 + " | " + c9);
                    }
                    if (pos == 9 && c9 == 0) {
                        c9 = 1;
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
                    while ((pos == 1 && c1 != 0) || (pos == 2 && c2 != 0) || (pos == 3 && c3 != 0) || (pos == 4 && c4 != 0) || (pos == 5 && c5 != 0) || (pos == 6 && c6 != 0)
                            || (pos == 7 && c7 != 0) || (pos == 8 && c8 != 0) || (pos == 9 && c9 != 0)) {
                        System.out.println("Casilla ocupada: ");
                        pos = leer.nextInt();
                        while (pos < 1 || pos > 9) {
                            System.out.println("Casilla invalida:");
                            pos = leer.nextInt();
                        }
                    }
                    if (pos == 1 && c1 == 0) {
                        c1 = 2;
                        System.out.println(c1 + " | " + c2 + " | " + c3);
                        System.out.println("---------");
                        System.out.println(c4 + " | " + c5 + " | " + c6);
                        System.out.println("---------");
                        System.out.println(c7 + " | " + c8 + " | " + c9);
                    }
                    if (pos == 2 && c2 == 0) {
                        c2 = 2;
                        System.out.println(c1 + " | " + c2 + " | " + c3);
                        System.out.println("---------");
                        System.out.println(c4 + " | " + c5 + " | " + c6);
                        System.out.println("---------");
                        System.out.println(c7 + " | " + c8 + " | " + c9);
                    }
                    if (pos == 3 && c3 == 0) {
                        c3 = 2;
                        System.out.println(c1 + " | " + c2 + " | " + c3);
                        System.out.println("---------");
                        System.out.println(c4 + " | " + c5 + " | " + c6);
                        System.out.println("---------");
                        System.out.println(c7 + " | " + c8 + " | " + c9);
                    }
                    if (pos == 4 && c4 == 0) {
                        c4 = 2;
                        System.out.println(c1 + " | " + c2 + " | " + c3);
                        System.out.println("---------");
                        System.out.println(c4 + " | " + c5 + " | " + c6);
                        System.out.println("---------");
                        System.out.println(c7 + " | " + c8 + " | " + c9);
                    }
                    if (pos == 5 && c5 == 0) {
                        c5 = 2;
                        System.out.println(c1 + " | " + c2 + " | " + c3);
                        System.out.println("---------");
                        System.out.println(c4 + " | " + c5 + " | " + c6);
                        System.out.println("---------");
                        System.out.println(c7 + " | " + c8 + " | " + c9);
                    }
                    if (pos == 6 && c6 == 0) {
                        c6 = 2;
                        System.out.println(c1 + " | " + c2 + " | " + c3);
                        System.out.println("---------");
                        System.out.println(c4 + " | " + c5 + " | " + c6);
                        System.out.println("---------");
                        System.out.println(c7 + " | " + c8 + " | " + c9);
                    }
                    if (pos == 7 && c7 == 0) {
                        c7 = 2;
                        System.out.println(c1 + " | " + c2 + " | " + c3);
                        System.out.println("---------");
                        System.out.println(c4 + " | " + c5 + " | " + c6);
                        System.out.println("---------");
                        System.out.println(c7 + " | " + c8 + " | " + c9);
                    }
                    if (pos == 8 && c8 == 0) {
                        c8 = 2;
                        System.out.println(c1 + " | " + c2 + " | " + c3);
                        System.out.println("---------");
                        System.out.println(c4 + " | " + c5 + " | " + c6);
                        System.out.println("---------");
                        System.out.println(c7 + " | " + c8 + " | " + c9);
                    }
                    if (pos == 9 && c9 == 0) {
                        c9 = 2;
                        System.out.println(c1 + " | " + c2 + " | " + c3);
                        System.out.println("---------");
                        System.out.println(c4 + " | " + c5 + " | " + c6);
                        System.out.println("---------");
                        System.out.println(c7 + " | " + c8 + " | " + c9);
                    }
                }
                mov = mov + 1;
                if (c1 == 1 && c1 == c2 && c2 == c3) {
                    System.out.println("¡El JUGADOR 1 HA GANADO!");
                    mov = 10;
                } else {
                    if (c4 == 1 && c4 == c5 && c5 == c6) {
                        System.out.println("¡El JUGADOR 1 HA GANADO!");
                        mov = 10;
                    } else {
                        if (c7 == 1 && c7 == c8 && c8 == c9) {
                            System.out.println("¡El JUGADOR 1 HA GANADO!");
                            mov = 10;
                        } else {
                            if (c1 == 1 && c1 == c4 && c4 == c7) {
                                System.out.println("¡El JUGADOR 1 HA GANADO!");
                                mov = 10;
                            } else {
                                if (c2 == 1 && c2 == c5 && c5 == c8) {
                                    System.out.println("¡El JUGADOR 1 HA GANADO!");
                                    mov = 10;
                                } else {
                                    if (c3 == 1 && c3 == c6 && c6 == c9) {
                                        System.out.println("¡El JUGADOR 1 HA GANADO!");
                                        mov = 10;
                                    } else {
                                        if (c1 == 1 && c1 == c5 && c5 == c9) {
                                            System.out.println("¡El JUGADOR 1 HA GANADO!");
                                            mov = 10;
                                        } else {
                                            if (c3 == 1 && c3 == c5 && c5 == c7) {
                                                System.out.println("¡El JUGADOR 1 HA GANADO!");
                                                mov = 10;
                                            } else {
                                                if (c7 == 1 && c7 == c8 && c8 == c9) {
                                                    System.out.println("¡El JUGADOR 1 HA GANADO!");
                                                    mov = 10;
                                                } else {
                                                    System.out.println("Empate");
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (c1 == 2 && c1 == c2 && c2 == c3) {
                    System.out.println("¡El JUGADOR 2 HA GANADO!");
                    mov = 11;
                } else {
                    if (c4 == 2 && c4 == c5 && c5 == c6) {
                        System.out.println("¡El JUGADOR 2 HA GANADO!");
                        mov = 11;
                    } else {
                        if (c7 == 2 && c7 == c8 && c8 == c9) {
                            System.out.println("¡El JUGADOR 2 HA GANADO!");
                            mov = 11;
                        } else {
                            if (c1 == 2 && c1 == c4 && c4 == c7) {
                                System.out.println("¡El JUGADOR 2 HA GANADO!");
                                mov = 11;
                            } else {
                                if (c2 == 2 && c2 == c5 && c5 == c8) {
                                    System.out.println("¡El JUGADOR 2 HA GANADO!");
                                    mov = 11;
                                } else {
                                    if (c3 == 2 && c3 == c6 && c6 == c9) {
                                        System.out.println("¡El JUGADOR 2 HA GANADO!");
                                        mov = 11;
                                    } else {
                                        if (c1 == 2 && c1 == c5 && c5 == c9) {
                                            System.out.println("¡El JUGADOR 2 HA GANADO!");
                                            mov = 11;
                                        } else {
                                            if (c3 == 2 && c3 == c5 && c5 == c7) {
                                                System.out.println("¡El JUGADOR 2 HA GANADO!");
                                                mov = 11;
                                            } else {
                                                if (c7 == 2 && c7 == c8 && c8 == c9) {
                                                    System.out.println("¡El JUGADOR 2 HA GANADO!");
                                                    mov = 11;
                                                } else {
                                                    System.out.println("Empate");
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (mov > 9) {
                    op = 2;
                }
            } while (mov < 9);
        }
    }
}
