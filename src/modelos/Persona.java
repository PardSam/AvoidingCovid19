package modelos;

public class Persona {

    public String nombres;
    public String genero;
    public int score;

    public Persona() {

    }

    public Persona(String nombres, String genero, int score) {
        this.nombres = nombres;
        this.genero = genero;
        this.score = score;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    
}
