package list;

/**
 * @author Lorenzo Henrique de Souza
 * **/

public class ArrayListAluno {
    private String nome;
    private String curso;
    private Double nota;
    private String sala;

    public ArrayListAluno(String nome, String curso, Double nota){
        this.nome = nome;
        this.curso = curso;
        this.nota = nota;
    }

    public ArrayListAluno(String nome, String curso, Double nota, String sala){
        this(nome, curso, nota);
        this.sala = sala;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }
}
