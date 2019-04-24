package jtplab2.Peterson;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Student
 */
public class Peterson extends Thread {

    private int ktora;// okresla ktora metoda robimy
    private int nr; //identyfikuje watek
    private static volatile int czyjaKolej = 1;
    private static volatile boolean[] chce = new boolean[2];
    private Random rand = new Random();
    private static char[] znaki = {'+', '-', '*', '$', '@'};
    private Thread currentThread = Thread.currentThread();
    private int nrPowtorzenia;
    int other;

    //konstruktor
    public Peterson(int a, int k) {
        nr = a;
        ktora = k; //wybieramy metode
        other = (nr + 1) % 2;
    }

    void sprawyWlasne() {
        int x = 1 + rand.nextInt(10);
        try {
            Thread.sleep(x);
        } catch (InterruptedException ex) {
            Logger.getLogger(Peterson.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void sekcjaKrytyczna() {
        System.out.println("Sekcja krytyczna wątku: Dekker-" + nr + ", nr powt. ="
                + nrPowtorzenia + "\n");
        for (int i = 0; i < 100; i++) {
            System.out.print(znaki[nr]);
        }
        System.out.println();
    }

    void dzialanieSynchr() {
        for (nrPowtorzenia = 0; nrPowtorzenia < 100; nrPowtorzenia++) {
            sprawyWlasne();
            chce[nr] = true;
            czyjaKolej = other;
            while (chce[other] && czyjaKolej == other) {
            }
            sekcjaKrytyczna();
            chce[nr] = false;
        }
    }

    void dzialanieNieSynchr() {
        for (nrPowtorzenia = 0; nrPowtorzenia < 100; nrPowtorzenia++) {
            sprawyWlasne();
            sekcjaKrytyczna();
        }
    }

}
