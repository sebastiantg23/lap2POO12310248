package figuras;

public class Circulo {
    private double radio;
    private String color;
    private Punto centro;


    public  Circulo(double radio, String color, Punto centro) {
        this.radio = radio;
        this.centro = centro;
        this.color = color;
    }



    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {

        return Math.PI * Math.pow(getRadio(), 2);
    }

    public double getPerimetro(){
        return 2*Math.PI*getRadio();
    }
}
