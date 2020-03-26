package com.company;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        funcClass ABC = new funcClass();
        int[] a = new int[50];
        int[] b = new int[50];
        String d = "";
        boolean t = true;
        int n = 0;
        int[] aux = new int[1];
        System.out.println("- C â€“ iniÅ£ializeazÄƒ tabloul de sortat cu valori generate aleator \n- V - vizualizeazÄƒ tablou \n- R - reiniÅ£ializeazÄƒ tabloul: pentru aducerea tabloului la forma iniÅ£ialÄƒ dupa ce acesta a fost sortat, Ã®n vederea aplicÄƒrii unei alte sortÄƒri \n- I - sortare prin inserÅ£ie \n- B - sortare prin inserÅ£ie binarÄƒ \n- S - sortare prin selecÅ£ie \n- T - sortare prin interschimbare  \n- H - sortare prin metoda Shakersort  \n- X - pÄƒrÄƒsirea programului. \n ");
        Scanner sc = new Scanner(System.in);

        while(t) {
            System.out.print("Ce ati dori?");
            String c = sc.nextLine();
            d = c.toLowerCase();
            byte var11 = -1;
            switch(d.hashCode()) {
                case 98:
                    if (d.equals("b")) {
                        var11 = 4;
                    }
                    break;
                case 99:
                    if (d.equals("c")) {
                        var11 = 0;
                    }
                case 100:
                case 101:
                case 102:
                case 103:
                case 106:
                case 107:
                case 108:
                case 109:
                case 110:
                case 111:
                case 112:
                case 113:
                case 117:
                case 119:
                default:
                    break;
                case 104:
                    if (d.equals("h")) {
                        var11 = 7;
                    }
                    break;
                case 105:
                    if (d.equals("i")) {
                        var11 = 3;
                    }
                    break;
                case 114:
                    if (d.equals("r")) {
                        var11 = 2;
                    }
                    break;
                case 115:
                    if (d.equals("s")) {
                        var11 = 5;
                    }
                    break;
                case 116:
                    if (d.equals("t")) {
                        var11 = 6;
                    }
                    break;
                case 118:
                    if (d.equals("v")) {
                        var11 = 1;
                    }
                    break;
                case 120:
                    if (d.equals("x")) {
                        var11 = 8;
                    }
            }

            switch(var11) {
                case 0:
                    System.out.println("Introduceti un  numar: ");
                    n = sc.nextInt();
                    ABC.setArray(a, b, n);
                    break;
                case 1:
                    ABC.getArray(b, n);
                    break;
                case 2:
                    ABC.reset(a, b, n);
                    break;
                case 3:
                    ABC.insertion(b, n);
                    break;
                case 4:
                    ABC.binary(b, n);
                    break;
                case 5:
                    ABC.selection(b, n);
                    break;
                case 6:
                    ABC.bubble(b, n);
                    break;
                case 7:
                    ABC.shake(b, n);
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Reintroduceti o litera valida");
            }
        }

    }
}

