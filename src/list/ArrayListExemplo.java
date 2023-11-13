package list;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;


/**
 * Array List é utilizado para orderanção aleatória
 * Rápido para consultas, entretanto um pouco lento para exclusões
 * @author Otávio Henrique Dias
 * Primeiro referencie a Interface e logo após a implentação;
 * */

public class ArrayListExemplo {
    public static void main (String args[]){
        exemploListaSimples();
        exemploListaSimplesOrdemAscendente();

    }
    private static void exemploListaSimples (){
        List<String> lista = new ArrayList<String>();
        lista.add("Otávio Dias");
        lista.add("Alexsa Pacheco");
        lista.add("Lorenzo Henrique");
        System.out.println(lista);

    }

    private static void exemploListaSimplesOrdemAscendente(){
        List<String> lista = new ArrayList<String>();
        lista.add("Otávio Dias");
        lista.add("Alexsa Pacheco");
        lista.add("Lorenzo Henrique");
        Collections.sort(lista);
        System.out.println(lista);

    }

}
