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
        exemploListaAluno();

    }

    private static void exemploListaAluno() {
        List <ArrayListAluno> lista = new ArrayList<ArrayListAluno>();
        ArrayListAluno a = new ArrayListAluno("Otávio Henrique", "Microsoft Office", 0);
        ArrayListAluno b = new ArrayListAluno("Diego Oliveira", "Linux Unbutu", 0);
        ArrayListAluno c = new ArrayListAluno("Caio Fábio", "Desenvolvimento Web", 0);
        lista.add(a);
        lista.add(b);
        lista.add(c);
        System.out.println(lista);
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
