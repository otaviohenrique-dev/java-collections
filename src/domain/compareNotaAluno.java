package domain;

import list.ArrayListAluno;

import java.util.Comparator;

public class compareNotaAluno implements Comparator<ArrayListAluno> {

    @Override
    public int compare(ArrayListAluno o1, ArrayListAluno o2) {
        return Double.compare(o1.getNota(), o2.getNota());
    }
}
