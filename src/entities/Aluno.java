package entities;

public class Aluno {
    private String name;
    private double primeiraNota;
    private double segundaNota;

    public Aluno (String name, double primeiraNota, double segundaNota){
        this.name = name;
        this.primeiraNota = primeiraNota;
        this.segundaNota = segundaNota;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrimeiraNota() {
        return primeiraNota;
    }

    public void setPrimeiraNota(double primeiraNota) {
        this.primeiraNota = primeiraNota;
    }

    public double getSegundaNota() {
        return segundaNota;
    }

    public void setSegundaNota(double segundaNota) {
        this.segundaNota = segundaNota;
    }

    public double mediaNotas(double primeiraNota, double segundaNota){
        return ((primeiraNota + segundaNota) / 2);
    }
}