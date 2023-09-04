package Escola;

public class Aluno {
    private String nome;
    private String materia;
    private String periodo;
    private int matricula;

    public Aluno(String nome, int matricula, String materia, String periodo) {
        this.nome = nome;
        this.matricula = matricula;
        this.materia = materia;
        this.periodo = periodo;
    }

    public String getNome() {
        return nome;
    }

    public String getMateria() {
        return materia;
    }
    
    public String getPeriodo() {
    	return periodo;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(String materia) {
        this.materia = materia;
    }
    
    public void setPeriodo(String periodo) {
    	this.periodo = periodo;
    }
    
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
}
