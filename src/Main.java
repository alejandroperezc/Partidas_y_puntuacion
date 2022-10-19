import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean algunoMayorQue9 = false;

        int contador = 0;

        int puntuacionTotal = 0;

        int puntuacionMax = Integer.MIN_VALUE;

        int puntuacionMin = Integer.MAX_VALUE;

        for (;;) {
            int puntos = scanner.nextInt();
            if (puntos == -1) {
                break;
            }
            contador++;
            puntuacionTotal = puntuacionTotal + puntos;
            if (puntos > 9) {
                algunoMayorQue9 = true;
            }
            if (puntos > puntuacionMax) {
                puntuacionMax = puntos;
            }
            if (puntos < puntuacionMin) {
                puntuacionMin = puntos;
            }
        }
        System.out.println("Hay alguno mayor que 9?");
        System.out.println(algunoMayorQue9);
        System.out.println("Partidas jugadas: ");
        System.out.println(contador);
        System.out.println("Puntuacion total: ");
        System.out.println(puntuacionTotal);
        System.out.println("Puntuacion Máxima: ");
        System.out.println(puntuacionMax);
        System.out.println("Puntuacion Mínima: ");
        System.out.println(puntuacionMin);
    }
}