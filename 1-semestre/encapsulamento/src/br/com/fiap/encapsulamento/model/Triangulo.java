package br.com.fiap.encapsulamento.model;

public class Triangulo {

    // Atributos privados (encapsulamento)
    private double x;
    private double y;
    private double z;

    // Construtor
    public Triangulo(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Getters
    public double getX() { return x; }
    public double getY() { return y; }
    public double getZ() { return z; }

    // Setters
    public void setX(double x) { this.x = x; }
    public void setY(double y) { this.y = y; }
    public void setZ(double z) { this.z = z; }

    // Método valida()
    public String valida() {
        // Desigualdade triangular
        if (x < y + z && y < x + z && z < x + y) {
            if (x == y && y == z) {
                return "Triângulo equilátero";
            } else if (x == y || y == z || x == z) {
                return "Triângulo isósceles";
            } else {
                return "Triângulo escaleno";
            }
        } else {
            return "Os valores não formam um triângulo";
        }
    }

}
