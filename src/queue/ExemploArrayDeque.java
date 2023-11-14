package queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ExemploArrayDeque {
    public static void main(String[] args){
        inserindoNaFila();
        removendoDaFila();
        acessandoDaFila();
    }

    private static void acessandoDaFila() {
        System.out.println("*** ACESSANDO ***");
        Deque<String> ad = new ArrayDeque<String>();
        ad.add("Red");
        ad.add("Blue");
        ad.add("White");
        ad.add("Yellow");
        ad.add("Black");

        Deque<String> d = new ArrayDeque<String>();
        d.add("Pink");
        d.add("Green");
        d.add("Purple");
        d.add("Orange");
        d.add("Brown");

        ad.addAll(d);
        System.out.println("Elements in the ArrayDeque: "+ad);

        String val = ad.remove();
        ad.remove("Black");


       /*A terminar */
    }

    private static void removendoDaFila() {
        System.out.println("*** REMOVENDO ***");
    }

    private static void inserindoNaFila() {
    }
}
