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
        d.add("Green");
        d.add("Orange");

        ad.addAll(d);

        System.out.println(ad);
        System.out.println(ad.contains("White"));
        System.out.println(d.contains("Brown"));
        System.out.println(d.containsAll(d));

        System.out.println("Output of element: "+ad.element());
        System.out.println("Get first using getFirst: "+ad.getFirst());
        System.out.println("Get last element using getLast: "+ad.getLast());
        System.out.println("Output of peek: "+ad.peek());
        System.out.println("Get first element using peekFirst: "+ad.peekFirst());
        System.out.println("Get last element using peekLast: "+ad.peekLast());
        System.out.println();
    }

    private static void removendoDaFila() {
    }

    private static void inserindoNaFila() {
    }
}
