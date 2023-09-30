package figuras;

public class Triangulo {
    private Punto vertice1;
    private Punto vertice2;
    private Punto vertice3;

    public Triangulo(Punto vertice1, Punto vertice2, Punto vertice3) {
        this.vertice1 = vertice1;
        this.vertice2 = vertice2;
        this.vertice3 = vertice3;
    }


    public double getPerimetro() {
        double lado1 = distanciaEntrePuntos(vertice1, vertice2);
        double lado2 = distanciaEntrePuntos(vertice2, vertice3);
        double lado3 = distanciaEntrePuntos(vertice3, vertice1);
        double perimetro = lado1 + lado2 + lado3;
        return perimetro;
    }

    private double distanciaEntrePuntos(Punto punto1, Punto punto2) {
        double deltaX = punto2.getCoordenadaX() - punto1.getCoordenadaX();
        double deltaY = punto2.getCoordenadaY() - punto1.getCoordenadaY();
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
}
