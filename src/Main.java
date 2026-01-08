import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ejercicio8();
    }

    public static void ejercicio1() {
        int[] numeros = {3, 5, 2};
        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros[2]);
    }

    public static void ejercicio2() {
        String[] cadenas = {"Una", "Dos", "Tres", "Cuatro"};
        System.out.println(cadenas[0]);
        System.out.println(cadenas[1]);
        System.out.println(cadenas[2]);
        System.out.println(cadenas[3]);
        cadenas[1] = "Cinco";
        System.out.println(cadenas[0]);
        System.out.println(cadenas[1]);
        System.out.println(cadenas[2]);
        System.out.println(cadenas[3]);
    }

    public static void ejercicio3() {
        int[] numeros = {6, 2, 9};
        System.out.println(numeros[0] + numeros[1] + numeros[2]);
    }

    public static void ejercicio4() {
        int[] numeros = {8, 3, 0, 1, 7};
        System.out.println((numeros[0] + numeros[1] + numeros[2] + numeros[3] + numeros[4]) / 5.0);
    }

    public static void ejercicio5() {
        String[] palabras = {"esternocleidomastoideo", "supercalifragilisticoespialidoso", "desoxirribonucleico"};
        String maslarga;
        if (palabras[0].length() >= palabras[1].length() && palabras[0].length() >= palabras[2].length()) {
            maslarga = palabras[0];
        } else if  (palabras[1].length() >= palabras[2].length() && palabras[1].length() >= palabras[0].length()) {
            maslarga = palabras[1];
        } else {
            maslarga = palabras[2];
        }
        System.out.println(maslarga);
    }

    public static void ejercicio6() {
        String[] palabras = {"palabra1",  "palabra2", "palabra3", "palabra4", "palabra5"};
        Scanner sc = new Scanner(System.in);
        String palabra = sc.nextLine();
        if (palabra.equals(palabras[0]) || palabra.equals(palabras[1]) || palabra.equals(palabras[2]) || palabra.equals(palabras[3]) || palabra.equals(palabras[4])) {
            System.out.println("Sí está en la lista");
        } else {
            System.out.println("No está en la lista");
        }
    }

    public static void ejercicio7() {
        int[][] miMatriz = {{4, 9}, {8, 2}};
        System.out.println(miMatriz[0][0]);
        System.out.println(miMatriz[0][1]);
        System.out.println(miMatriz[1][0]);
        System.out.println(miMatriz[1][1]);
    }

    public static void ejercicio8() {
        int[][] miMatriz = {{4, 9, 7}, {8, 2, 5}};
        double media = (double) (miMatriz[0][0] + miMatriz[0][1] + miMatriz[0][2] + miMatriz[1][0] + miMatriz[1][1] + miMatriz[1][2]) / 6;
        System.out.println(media);
    }
}